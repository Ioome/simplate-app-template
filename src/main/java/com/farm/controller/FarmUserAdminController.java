package com.farm.controller;

import com.farm.utils.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @name: FarmUserAdminController
 * @author: sutton
 * @date: 2023-04-27 10:26
 * @description: FarmUserAdminController
 */

@Slf4j
@Controller
@Api(tags = "UmsAdminController", description = "后台用户管理")
@RequestMapping("api/{v}/admin")
public class FarmUserAdminController {

    @ApiOperation(value = "用户注册")
    @PostMapping(value = "/register")
    @ResponseBody
    public ResponseResult register () {
        return ResponseResult.fail(null);
    }

    @ApiOperation(value = "登录以后返回token")
    @PostMapping(value = "/login")
    @ResponseBody
    public ResponseResult login () {
        return null;
    }

    @ApiOperation("获取用户所有权限（包括+-权限）")
    @GetMapping(value = "/permission/{adminId}")
    @ResponseBody
    public Object getPermissionList (@PathVariable Long adminId) {
        return null;
    }

}
