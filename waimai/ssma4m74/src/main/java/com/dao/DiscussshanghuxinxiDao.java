package com.dao;

import com.entity.DiscussshanghuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussshanghuxinxiVO;
import com.entity.view.DiscussshanghuxinxiView;


/**
 * 商户信息评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-20 10:07:41
 */
public interface DiscussshanghuxinxiDao extends BaseMapper<DiscussshanghuxinxiEntity> {
	
	List<DiscussshanghuxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussshanghuxinxiEntity> wrapper);
	
	DiscussshanghuxinxiVO selectVO(@Param("ew") Wrapper<DiscussshanghuxinxiEntity> wrapper);
	
	List<DiscussshanghuxinxiView> selectListView(@Param("ew") Wrapper<DiscussshanghuxinxiEntity> wrapper);

	List<DiscussshanghuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussshanghuxinxiEntity> wrapper);
	
	DiscussshanghuxinxiView selectView(@Param("ew") Wrapper<DiscussshanghuxinxiEntity> wrapper);
	
}
