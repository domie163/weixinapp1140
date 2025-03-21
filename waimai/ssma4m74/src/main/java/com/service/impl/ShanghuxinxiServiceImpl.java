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


import com.dao.ShanghuxinxiDao;
import com.entity.ShanghuxinxiEntity;
import com.service.ShanghuxinxiService;
import com.entity.vo.ShanghuxinxiVO;
import com.entity.view.ShanghuxinxiView;

@Service("shanghuxinxiService")
public class ShanghuxinxiServiceImpl extends ServiceImpl<ShanghuxinxiDao, ShanghuxinxiEntity> implements ShanghuxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShanghuxinxiEntity> page = this.selectPage(
                new Query<ShanghuxinxiEntity>(params).getPage(),
                new EntityWrapper<ShanghuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShanghuxinxiEntity> wrapper) {
		  Page<ShanghuxinxiView> page =new Query<ShanghuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShanghuxinxiVO> selectListVO(Wrapper<ShanghuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShanghuxinxiVO selectVO(Wrapper<ShanghuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShanghuxinxiView> selectListView(Wrapper<ShanghuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShanghuxinxiView selectView(Wrapper<ShanghuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
