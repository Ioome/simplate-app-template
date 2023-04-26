package com.farm.entity.view;

import com.farm.entity.HuanjingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 环境
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-12-20 09:48:46
 */
@TableName("huanjing")
public class HuanjingView  extends HuanjingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HuanjingView(){
	}
 
 	public HuanjingView(HuanjingEntity huanjingEntity){
 	try {
			BeanUtils.copyProperties(this, huanjingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
