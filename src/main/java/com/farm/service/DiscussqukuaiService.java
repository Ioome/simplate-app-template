package com.farm.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.farm.utils.PageUtils;
import com.farm.entity.DiscussqukuaiEntity;
import java.util.List;
import java.util.Map;
import com.farm.entity.vo.DiscussqukuaiVO;
import org.apache.ibatis.annotations.Param;
import com.farm.entity.view.DiscussqukuaiView;


/**
 * 区块评论表
 *
 * @author 
 * @email 
 * @date 2020-12-20 09:48:46
 */
public interface DiscussqukuaiService extends IService<DiscussqukuaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussqukuaiVO> selectListVO(Wrapper<DiscussqukuaiEntity> wrapper);
   	
   	DiscussqukuaiVO selectVO(@Param("ew") Wrapper<DiscussqukuaiEntity> wrapper);
   	
   	List<DiscussqukuaiView> selectListView(Wrapper<DiscussqukuaiEntity> wrapper);
   	
   	DiscussqukuaiView selectView(@Param("ew") Wrapper<DiscussqukuaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussqukuaiEntity> wrapper);
   	
}

