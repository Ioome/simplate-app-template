package com.farm.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.farm.utils.PageUtils;
import com.farm.entity.ZhiwuEntity;
import java.util.List;
import java.util.Map;
import com.farm.entity.vo.ZhiwuVO;
import org.apache.ibatis.annotations.Param;
import com.farm.entity.view.ZhiwuView;


/**
 * 植物
 *
 * @author 
 * @email 
 * @date 2020-12-20 09:48:46
 */
public interface ZhiwuService extends IService<ZhiwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhiwuVO> selectListVO(Wrapper<ZhiwuEntity> wrapper);
   	
   	ZhiwuVO selectVO(@Param("ew") Wrapper<ZhiwuEntity> wrapper);
   	
   	List<ZhiwuView> selectListView(Wrapper<ZhiwuEntity> wrapper);
   	
   	ZhiwuView selectView(@Param("ew") Wrapper<ZhiwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhiwuEntity> wrapper);
   	
}

