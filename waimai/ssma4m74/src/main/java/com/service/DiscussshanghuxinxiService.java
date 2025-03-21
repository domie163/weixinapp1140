package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussshanghuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussshanghuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussshanghuxinxiView;


/**
 * 商户信息评论表
 *
 * @author 
 * @email 
 * @date 2021-03-20 10:07:41
 */
public interface DiscussshanghuxinxiService extends IService<DiscussshanghuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussshanghuxinxiVO> selectListVO(Wrapper<DiscussshanghuxinxiEntity> wrapper);
   	
   	DiscussshanghuxinxiVO selectVO(@Param("ew") Wrapper<DiscussshanghuxinxiEntity> wrapper);
   	
   	List<DiscussshanghuxinxiView> selectListView(Wrapper<DiscussshanghuxinxiEntity> wrapper);
   	
   	DiscussshanghuxinxiView selectView(@Param("ew") Wrapper<DiscussshanghuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussshanghuxinxiEntity> wrapper);
   	
}

