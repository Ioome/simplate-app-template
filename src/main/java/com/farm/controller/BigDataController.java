package com.farm.controller;

import com.farm.annotation.ApiVersion;
import com.farm.utils.ResponseResult;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @name: BigDataController
 * @author: sutton
 * @date: 2023-04-26 15:50
 * @description: 大数据展示页面
 */
@Slf4j
@RestController
@RequestMapping("api/{v}/data")
@Api(value = "BigDataController", tags = "data Interface")
public class BigDataController {


    @PreAuthorize("hasAnyRole('test')")
    @RequestMapping("print")
    public ResponseResult<Object> getUser () {
        return ResponseResult.success("v1");
    }

    @ApiVersion("1.0.0")
    @RequestMapping("print")
    public ResponseResult<Object> getUserV1 () {
        return ResponseResult.success("1.0.0");
    }


    @ApiVersion("1.1.0")
    @RequestMapping("print")
    public ResponseResult<Object> getUserV2 () {
        return ResponseResult.success("1.1.0");
    }

    @ApiVersion("1.1.1")
    @RequestMapping("print")
    public ResponseResult<Object> getUserV3 () {
        return ResponseResult.success("1.1.1");
    }
}
