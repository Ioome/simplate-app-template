package com.farm.controller;

import com.farm.utils.ResponseResult;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @name: BigDataController
 * @author: sutton
 * @date: 2023-04-26 15:50
 * @description: 大数据展示页面
 */
@RestController
@RequestMapping("/big/data")
@Api(value = "BigDataController", tags = "data Interface")
@Slf4j
public class BigDataController {


    @GetMapping("/print")
    public ResponseResult<Object> print () {
        log.info("BigDataController");
        return ResponseResult.success();
    }

}
