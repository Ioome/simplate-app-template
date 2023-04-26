package com.farm.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.farm.utils.PageUtils;
import com.farm.entity.StoreupEntity;
import java.util.List;
import java.util.Map;
import com.farm.entity.vo.StoreupVO;
import org.apache.ibatis.annotations.Param;
import com.farm.entity.view.StoreupView;


/**
 * 收藏表
 *
 * @author 
 * @email 
 * @date 2020-12-20 09:48:46
 */
public interface StoreupService extends IService<StoreupEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<StoreupVO> selectListVO(Wrapper<StoreupEntity> wrapper);
   	
   	StoreupVO selectVO(@Param("ew") Wrapper<StoreupEntity> wrapper);
   	
   	List<StoreupView> selectListView(Wrapper<StoreupEntity> wrapper);
   	
   	StoreupView selectView(@Param("ew") Wrapper<StoreupEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<StoreupEntity> wrapper);
   	
}

