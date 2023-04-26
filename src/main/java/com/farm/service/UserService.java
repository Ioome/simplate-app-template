
package com.farm.service;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.farm.entity.UserEntity;
import com.farm.utils.PageUtils;


/**
 * 系统用户
 * @author yangliyuan
 * @date 2019年10月10日 上午9:18:20
 */
public interface UserService extends IService<UserEntity> {
 	PageUtils queryPage(Map<String, Object> params);
    
   	List<UserEntity> selectListView(Wrapper<UserEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<UserEntity> wrapper);
	   	
}
