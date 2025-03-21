package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.DiscussshanghuxinxiEntity;
import com.entity.view.DiscussshanghuxinxiView;

import com.service.DiscussshanghuxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 商户信息评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-20 10:07:41
 */
@RestController
@RequestMapping("/discussshanghuxinxi")
public class DiscussshanghuxinxiController {
    @Autowired
    private DiscussshanghuxinxiService discussshanghuxinxiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscussshanghuxinxiEntity discussshanghuxinxi, 
		HttpServletRequest request){

        EntityWrapper<DiscussshanghuxinxiEntity> ew = new EntityWrapper<DiscussshanghuxinxiEntity>();
		PageUtils page = discussshanghuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussshanghuxinxi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscussshanghuxinxiEntity discussshanghuxinxi, HttpServletRequest request){
        EntityWrapper<DiscussshanghuxinxiEntity> ew = new EntityWrapper<DiscussshanghuxinxiEntity>();
		PageUtils page = discussshanghuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussshanghuxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscussshanghuxinxiEntity discussshanghuxinxi){
       	EntityWrapper<DiscussshanghuxinxiEntity> ew = new EntityWrapper<DiscussshanghuxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discussshanghuxinxi, "discussshanghuxinxi")); 
        return R.ok().put("data", discussshanghuxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscussshanghuxinxiEntity discussshanghuxinxi){
        EntityWrapper< DiscussshanghuxinxiEntity> ew = new EntityWrapper< DiscussshanghuxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discussshanghuxinxi, "discussshanghuxinxi")); 
		DiscussshanghuxinxiView discussshanghuxinxiView =  discussshanghuxinxiService.selectView(ew);
		return R.ok("查询商户信息评论表成功").put("data", discussshanghuxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscussshanghuxinxiEntity discussshanghuxinxi = discussshanghuxinxiService.selectById(id);
        return R.ok().put("data", discussshanghuxinxi);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscussshanghuxinxiEntity discussshanghuxinxi = discussshanghuxinxiService.selectById(id);
        return R.ok().put("data", discussshanghuxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscussshanghuxinxiEntity discussshanghuxinxi, HttpServletRequest request){
    	discussshanghuxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discussshanghuxinxi);

        discussshanghuxinxiService.insert(discussshanghuxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscussshanghuxinxiEntity discussshanghuxinxi, HttpServletRequest request){
    	discussshanghuxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discussshanghuxinxi);

        discussshanghuxinxiService.insert(discussshanghuxinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody DiscussshanghuxinxiEntity discussshanghuxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discussshanghuxinxi);
        discussshanghuxinxiService.updateById(discussshanghuxinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discussshanghuxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<DiscussshanghuxinxiEntity> wrapper = new EntityWrapper<DiscussshanghuxinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = discussshanghuxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
