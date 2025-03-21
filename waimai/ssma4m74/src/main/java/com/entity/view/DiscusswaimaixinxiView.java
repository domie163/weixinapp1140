package com.entity.view;

import com.entity.DiscusswaimaixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 外卖信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-20 10:07:41
 */
@TableName("discusswaimaixinxi")
public class DiscusswaimaixinxiView  extends DiscusswaimaixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusswaimaixinxiView(){
	}
 
 	public DiscusswaimaixinxiView(DiscusswaimaixinxiEntity discusswaimaixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discusswaimaixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
