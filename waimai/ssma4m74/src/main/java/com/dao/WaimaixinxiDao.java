package com.dao;

import com.entity.WaimaixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WaimaixinxiVO;
import com.entity.view.WaimaixinxiView;


/**
 * 外卖信息
 * 
 * @author 
 * @email 
 * @date 2021-03-20 10:07:41
 */
public interface WaimaixinxiDao extends BaseMapper<WaimaixinxiEntity> {
	
	List<WaimaixinxiVO> selectListVO(@Param("ew") Wrapper<WaimaixinxiEntity> wrapper);
	
	WaimaixinxiVO selectVO(@Param("ew") Wrapper<WaimaixinxiEntity> wrapper);
	
	List<WaimaixinxiView> selectListView(@Param("ew") Wrapper<WaimaixinxiEntity> wrapper);

	List<WaimaixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<WaimaixinxiEntity> wrapper);
	
	WaimaixinxiView selectView(@Param("ew") Wrapper<WaimaixinxiEntity> wrapper);
	
}
