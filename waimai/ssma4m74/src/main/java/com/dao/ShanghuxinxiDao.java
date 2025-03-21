package com.dao;

import com.entity.ShanghuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShanghuxinxiVO;
import com.entity.view.ShanghuxinxiView;


/**
 * 商户信息
 * 
 * @author 
 * @email 
 * @date 2021-03-20 10:07:41
 */
public interface ShanghuxinxiDao extends BaseMapper<ShanghuxinxiEntity> {
	
	List<ShanghuxinxiVO> selectListVO(@Param("ew") Wrapper<ShanghuxinxiEntity> wrapper);
	
	ShanghuxinxiVO selectVO(@Param("ew") Wrapper<ShanghuxinxiEntity> wrapper);
	
	List<ShanghuxinxiView> selectListView(@Param("ew") Wrapper<ShanghuxinxiEntity> wrapper);

	List<ShanghuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ShanghuxinxiEntity> wrapper);
	
	ShanghuxinxiView selectView(@Param("ew") Wrapper<ShanghuxinxiEntity> wrapper);
	
}
