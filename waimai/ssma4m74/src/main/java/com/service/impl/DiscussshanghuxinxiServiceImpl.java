package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussshanghuxinxiDao;
import com.entity.DiscussshanghuxinxiEntity;
import com.service.DiscussshanghuxinxiService;
import com.entity.vo.DiscussshanghuxinxiVO;
import com.entity.view.DiscussshanghuxinxiView;

@Service("discussshanghuxinxiService")
public class DiscussshanghuxinxiServiceImpl extends ServiceImpl<DiscussshanghuxinxiDao, DiscussshanghuxinxiEntity> implements DiscussshanghuxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussshanghuxinxiEntity> page = this.selectPage(
                new Query<DiscussshanghuxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussshanghuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussshanghuxinxiEntity> wrapper) {
		  Page<DiscussshanghuxinxiView> page =new Query<DiscussshanghuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussshanghuxinxiVO> selectListVO(Wrapper<DiscussshanghuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussshanghuxinxiVO selectVO(Wrapper<DiscussshanghuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussshanghuxinxiView> selectListView(Wrapper<DiscussshanghuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussshanghuxinxiView selectView(Wrapper<DiscussshanghuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
