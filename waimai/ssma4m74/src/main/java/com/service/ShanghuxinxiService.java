package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShanghuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShanghuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShanghuxinxiView;


/**
 * 商户信息
 *
 * @author 
 * @email 
 * @date 2021-03-20 10:07:41
 */
public interface ShanghuxinxiService extends IService<ShanghuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShanghuxinxiVO> selectListVO(Wrapper<ShanghuxinxiEntity> wrapper);
   	
   	ShanghuxinxiVO selectVO(@Param("ew") Wrapper<ShanghuxinxiEntity> wrapper);
   	
   	List<ShanghuxinxiView> selectListView(Wrapper<ShanghuxinxiEntity> wrapper);
   	
   	ShanghuxinxiView selectView(@Param("ew") Wrapper<ShanghuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShanghuxinxiEntity> wrapper);
   	
}

