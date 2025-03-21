package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WaimaixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WaimaixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WaimaixinxiView;


/**
 * 外卖信息
 *
 * @author 
 * @email 
 * @date 2021-03-20 10:07:41
 */
public interface WaimaixinxiService extends IService<WaimaixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WaimaixinxiVO> selectListVO(Wrapper<WaimaixinxiEntity> wrapper);
   	
   	WaimaixinxiVO selectVO(@Param("ew") Wrapper<WaimaixinxiEntity> wrapper);
   	
   	List<WaimaixinxiView> selectListView(Wrapper<WaimaixinxiEntity> wrapper);
   	
   	WaimaixinxiView selectView(@Param("ew") Wrapper<WaimaixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WaimaixinxiEntity> wrapper);
   	
}

