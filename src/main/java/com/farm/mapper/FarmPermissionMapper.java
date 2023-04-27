package com.farm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.farm.entity.po.FarmPermission;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @name: FarmPermissionMapper
 * @author: sutton
 * @date: 2023-04-27 23:02
 * @description: FarmPermissionMapper
 */
@Mapper
public interface FarmPermissionMapper extends BaseMapper<FarmPermission> {
    List<String> selectPermsByUserId(Long id);
}

