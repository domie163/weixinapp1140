package com.entity.vo;

import com.entity.WaimaixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 外卖信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-20 10:07:41
 */
public class WaimaixinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 商家姓名
	 */
	
	private String shangjiaxingming;
		
	/**
	 * 店铺名称
	 */
	
	private String dianpumingcheng;
		
	/**
	 * 外卖名称
	 */
	
	private String waimaimingcheng;
		
	/**
	 * 分类
	 */
	
	private String fenlei;
		
	/**
	 * 外卖封面
	 */
	
	private String waimaifengmian;
		
	/**
	 * 外卖分量
	 */
	
	private String waimaifenliang;
		
	/**
	 * 外卖主料
	 */
	
	private String waimaizhuliao;
		
	/**
	 * 外卖详情
	 */
	
	private String waimaixiangqing;
		
	/**
	 * 月售数量
	 */
	
	private String yueshoushuliang;
		
	/**
	 * 配送价格
	 */
	
	private Integer peisongjiage;
		
	/**
	 * 起送价格
	 */
	
	private Integer qisongjiage;
		
	/**
	 * 配送时间
	 */
	
	private String peisongshijian;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
		
	/**
	 * 价格
	 */
	
	private Float price;
				
	
	/**
	 * 设置：商家姓名
	 */
	 
	public void setShangjiaxingming(String shangjiaxingming) {
		this.shangjiaxingming = shangjiaxingming;
	}
	
	/**
	 * 获取：商家姓名
	 */
	public String getShangjiaxingming() {
		return shangjiaxingming;
	}
				
	
	/**
	 * 设置：店铺名称
	 */
	 
	public void setDianpumingcheng(String dianpumingcheng) {
		this.dianpumingcheng = dianpumingcheng;
	}
	
	/**
	 * 获取：店铺名称
	 */
	public String getDianpumingcheng() {
		return dianpumingcheng;
	}
				
	
	/**
	 * 设置：外卖名称
	 */
	 
	public void setWaimaimingcheng(String waimaimingcheng) {
		this.waimaimingcheng = waimaimingcheng;
	}
	
	/**
	 * 获取：外卖名称
	 */
	public String getWaimaimingcheng() {
		return waimaimingcheng;
	}
				
	
	/**
	 * 设置：分类
	 */
	 
	public void setFenlei(String fenlei) {
		this.fenlei = fenlei;
	}
	
	/**
	 * 获取：分类
	 */
	public String getFenlei() {
		return fenlei;
	}
				
	
	/**
	 * 设置：外卖封面
	 */
	 
	public void setWaimaifengmian(String waimaifengmian) {
		this.waimaifengmian = waimaifengmian;
	}
	
	/**
	 * 获取：外卖封面
	 */
	public String getWaimaifengmian() {
		return waimaifengmian;
	}
				
	
	/**
	 * 设置：外卖分量
	 */
	 
	public void setWaimaifenliang(String waimaifenliang) {
		this.waimaifenliang = waimaifenliang;
	}
	
	/**
	 * 获取：外卖分量
	 */
	public String getWaimaifenliang() {
		return waimaifenliang;
	}
				
	
	/**
	 * 设置：外卖主料
	 */
	 
	public void setWaimaizhuliao(String waimaizhuliao) {
		this.waimaizhuliao = waimaizhuliao;
	}
	
	/**
	 * 获取：外卖主料
	 */
	public String getWaimaizhuliao() {
		return waimaizhuliao;
	}
				
	
	/**
	 * 设置：外卖详情
	 */
	 
	public void setWaimaixiangqing(String waimaixiangqing) {
		this.waimaixiangqing = waimaixiangqing;
	}
	
	/**
	 * 获取：外卖详情
	 */
	public String getWaimaixiangqing() {
		return waimaixiangqing;
	}
				
	
	/**
	 * 设置：月售数量
	 */
	 
	public void setYueshoushuliang(String yueshoushuliang) {
		this.yueshoushuliang = yueshoushuliang;
	}
	
	/**
	 * 获取：月售数量
	 */
	public String getYueshoushuliang() {
		return yueshoushuliang;
	}
				
	
	/**
	 * 设置：配送价格
	 */
	 
	public void setPeisongjiage(Integer peisongjiage) {
		this.peisongjiage = peisongjiage;
	}
	
	/**
	 * 获取：配送价格
	 */
	public Integer getPeisongjiage() {
		return peisongjiage;
	}
				
	
	/**
	 * 设置：起送价格
	 */
	 
	public void setQisongjiage(Integer qisongjiage) {
		this.qisongjiage = qisongjiage;
	}
	
	/**
	 * 获取：起送价格
	 */
	public Integer getQisongjiage() {
		return qisongjiage;
	}
				
	
	/**
	 * 设置：配送时间
	 */
	 
	public void setPeisongshijian(String peisongshijian) {
		this.peisongshijian = peisongshijian;
	}
	
	/**
	 * 获取：配送时间
	 */
	public String getPeisongshijian() {
		return peisongshijian;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setPrice(Float price) {
		this.price = price;
	}
	
	/**
	 * 获取：价格
	 */
	public Float getPrice() {
		return price;
	}
			
}
