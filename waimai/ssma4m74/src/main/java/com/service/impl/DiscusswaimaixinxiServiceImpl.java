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


import com.dao.DiscusswaimaixinxiDao;
import com.entity.DiscusswaimaixinxiEntity;
import com.service.DiscusswaimaixinxiService;
import com.entity.vo.DiscusswaimaixinxiVO;
import com.entity.view.DiscusswaimaixinxiView;

@Service("discusswaimaixinxiService")
public class DiscusswaimaixinxiServiceImpl extends ServiceImpl<DiscusswaimaixinxiDao, DiscusswaimaixinxiEntity> implements DiscusswaimaixinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusswaimaixinxiEntity> page = this.selectPage(
                new Query<DiscusswaimaixinxiEntity>(params).getPage(),
                new EntityWrapper<DiscusswaimaixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusswaimaixinxiEntity> wrapper) {
		  Page<DiscusswaimaixinxiView> page =new Query<DiscusswaimaixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusswaimaixinxiVO> selectListVO(Wrapper<DiscusswaimaixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusswaimaixinxiVO selectVO(Wrapper<DiscusswaimaixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusswaimaixinxiView> selectListView(Wrapper<DiscusswaimaixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusswaimaixinxiView selectView(Wrapper<DiscusswaimaixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
