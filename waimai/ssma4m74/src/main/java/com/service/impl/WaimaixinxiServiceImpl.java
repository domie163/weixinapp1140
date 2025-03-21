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


import com.dao.WaimaixinxiDao;
import com.entity.WaimaixinxiEntity;
import com.service.WaimaixinxiService;
import com.entity.vo.WaimaixinxiVO;
import com.entity.view.WaimaixinxiView;

@Service("waimaixinxiService")
public class WaimaixinxiServiceImpl extends ServiceImpl<WaimaixinxiDao, WaimaixinxiEntity> implements WaimaixinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WaimaixinxiEntity> page = this.selectPage(
                new Query<WaimaixinxiEntity>(params).getPage(),
                new EntityWrapper<WaimaixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WaimaixinxiEntity> wrapper) {
		  Page<WaimaixinxiView> page =new Query<WaimaixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WaimaixinxiVO> selectListVO(Wrapper<WaimaixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WaimaixinxiVO selectVO(Wrapper<WaimaixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WaimaixinxiView> selectListView(Wrapper<WaimaixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WaimaixinxiView selectView(Wrapper<WaimaixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
