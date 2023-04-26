package com.farm.utils;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.mvc.condition.RequestCondition;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @name: ApiVersionCondition
 * @author: sutton
 * @date: 2023-04-26 17:10
 * @description: ApiVersionCondition
 */
@Slf4j
public class ApiVersionCondition implements RequestCondition<ApiVersionCondition> {


    /**
     * support v1.1.1, v1.1, v1; three levels .
     */
    private static final Pattern VERSION_PREFIX_PATTERN_1 = Pattern.compile("/v\\d\\.\\d\\.\\d/");
    private static final Pattern VERSION_PREFIX_PATTERN_2 = Pattern.compile("/v\\d\\.\\d/");
    private static final Pattern VERSION_PREFIX_PATTERN_3 = Pattern.compile("/v\\d/");
    private static final List<Pattern> VERSION_LIST = Collections.unmodifiableList(
            Arrays.asList(VERSION_PREFIX_PATTERN_1, VERSION_PREFIX_PATTERN_2, VERSION_PREFIX_PATTERN_3)
    );


    @Getter
    private final String apiVersion;

    public ApiVersionCondition (String apiVersion) {
        this.apiVersion = apiVersion;
    }


    /**
     * 其他
     *
     * @param other 其他
     * @return 用于组合多个条件
     */
    @Override
    public ApiVersionCondition combine (ApiVersionCondition other) {
        return new ApiVersionCondition(other.apiVersion);
    }


    /**
     * 用于匹配请求，返回匹配的结果
     *
     * @param httpServletRequest 请求
     * @return 匹配的结果
     */
    @Override
    public ApiVersionCondition getMatchingCondition (HttpServletRequest httpServletRequest) {
        for (int vIndex = 0; vIndex < VERSION_LIST.size(); vIndex++) {
            Matcher m = VERSION_LIST.get(vIndex).matcher(httpServletRequest.getRequestURI());
            if (m.find()) {
                String version = m.group(0).replace("/v", "").replace("/", "");
                if (vIndex == 1) {
                    version = version + ".0";
                } else if (vIndex == 2) {
                    version = version + ".0.0";
                }
                if (compareVersion(version, this.apiVersion) >= 0) {
                    log.info("version={}, apiVersion={}", version, this.apiVersion);
                    return this;
                }
            }
        }
        return null;
    }

    private int compareVersion (String version1, String version2) {
        if (version1 == null || version2 == null) {
            throw new RuntimeException("compareVersion error:illegal params.");
        }
        String[] versionArray1 = version1.split("\\.");
        String[] versionArray2 = version2.split("\\.");
        int idx = 0;
        int minLength = Math.min(versionArray1.length, versionArray2.length);
        int diff = 0;
        while (idx < minLength
                && (diff = versionArray1[idx].length() - versionArray2[idx].length()) == 0
                && (diff = versionArray1[idx].compareTo(versionArray2[idx])) == 0) {
            ++idx;
        }
        diff = (diff != 0) ? diff : versionArray1.length - versionArray2.length;
        return diff;
    }

    @Override
    public int compareTo (ApiVersionCondition other, HttpServletRequest httpServletRequest) {
        return compareVersion(other.getApiVersion(), this.apiVersion);
    }
}
