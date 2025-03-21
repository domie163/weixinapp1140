package com.dao;

import com.entity.DiscusswaimaixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusswaimaixinxiVO;
import com.entity.view.DiscusswaimaixinxiView;


/**
 * 外卖信息评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-20 10:07:41
 */
public interface DiscusswaimaixinxiDao extends BaseMapper<DiscusswaimaixinxiEntity> {
	
	List<DiscusswaimaixinxiVO> selectListVO(@Param("ew") Wrapper<DiscusswaimaixinxiEntity> wrapper);
	
	DiscusswaimaixinxiVO selectVO(@Param("ew") Wrapper<DiscusswaimaixinxiEntity> wrapper);
	
	List<DiscusswaimaixinxiView> selectListView(@Param("ew") Wrapper<DiscusswaimaixinxiEntity> wrapper);

	List<DiscusswaimaixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusswaimaixinxiEntity> wrapper);
	
	DiscusswaimaixinxiView selectView(@Param("ew") Wrapper<DiscusswaimaixinxiEntity> wrapper);
	
}
