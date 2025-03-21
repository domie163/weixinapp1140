package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusswaimaixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusswaimaixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusswaimaixinxiView;


/**
 * 外卖信息评论表
 *
 * @author 
 * @email 
 * @date 2021-03-20 10:07:41
 */
public interface DiscusswaimaixinxiService extends IService<DiscusswaimaixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusswaimaixinxiVO> selectListVO(Wrapper<DiscusswaimaixinxiEntity> wrapper);
   	
   	DiscusswaimaixinxiVO selectVO(@Param("ew") Wrapper<DiscusswaimaixinxiEntity> wrapper);
   	
   	List<DiscusswaimaixinxiView> selectListView(Wrapper<DiscusswaimaixinxiEntity> wrapper);
   	
   	DiscusswaimaixinxiView selectView(@Param("ew") Wrapper<DiscusswaimaixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusswaimaixinxiEntity> wrapper);
   	
}

