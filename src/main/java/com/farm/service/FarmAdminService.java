package com.farm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.farm.entity.po.FarmAdmin;
import com.farm.exception.FarmException;
import org.springframework.stereotype.Service;

/**
 * @name: FarmAdminService
 * @author: sutton
 * @date: 2023-04-27 11:56
 * @description: 用户管理
 */
@Service
public interface FarmAdminService extends IService<FarmAdmin> {

    /**
     * 根据用户名获取后台管理员
     */
    FarmAdmin getAdminByUsername (String username);

    /**
     * 注册功能
     */
    FarmAdmin register (FarmAdmin umsAdminParam);

    /**
     * 登录功能
     *
     * @param username 用户名
     * @param password 密码
     * @return 生成的JWT的token
     */
    String login (FarmAdmin farmAdmin);

    void logout () throws FarmException;
}
