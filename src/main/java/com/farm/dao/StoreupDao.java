package com.farm.dao;

import com.farm.entity.StoreupEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import com.farm.entity.view.StoreupView;
import com.farm.entity.vo.StoreupVO;
import org.apache.ibatis.annotations.Param;


/**
 * 收藏表
 * 
 * @author 
 * @email 
 * @date 2020-12-20 09:48:46
 */
public interface StoreupDao extends BaseMapper<StoreupEntity> {
	
	List<StoreupVO> selectListVO(@Param("ew") Wrapper<StoreupEntity> wrapper);
	
	StoreupVO selectVO(@Param("ew") Wrapper<StoreupEntity> wrapper);
	
	List<StoreupView> selectListView(@Param("ew") Wrapper<StoreupEntity> wrapper);

	List<StoreupView> selectListView(Pagination page,@Param("ew") Wrapper<StoreupEntity> wrapper);
	
	StoreupView selectView(@Param("ew") Wrapper<StoreupEntity> wrapper);
	
}
