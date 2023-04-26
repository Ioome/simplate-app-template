package com.farm.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.farm.utils.PageUtils;
import com.farm.entity.QukuaiEntity;
import java.util.List;
import java.util.Map;
import com.farm.entity.vo.QukuaiVO;
import org.apache.ibatis.annotations.Param;
import com.farm.entity.view.QukuaiView;


/**
 * 区块
 *
 * @author 
 * @email 
 * @date 2020-12-20 09:48:46
 */
public interface QukuaiService extends IService<QukuaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QukuaiVO> selectListVO(Wrapper<QukuaiEntity> wrapper);
   	
   	QukuaiVO selectVO(@Param("ew") Wrapper<QukuaiEntity> wrapper);
   	
   	List<QukuaiView> selectListView(Wrapper<QukuaiEntity> wrapper);
   	
   	QukuaiView selectView(@Param("ew") Wrapper<QukuaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QukuaiEntity> wrapper);
   	
}

