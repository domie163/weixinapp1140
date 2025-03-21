package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 商户信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-20 10:07:41
 */
@TableName("shanghuxinxi")
public class ShanghuxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShanghuxinxiEntity() {
		
	}
	
	public ShanghuxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 商家账号
	 */
					
	private String shangjiazhanghao;
	
	/**
	 * 商家姓名
	 */
					
	private String shangjiaxingming;
	
	/**
	 * 店铺名称
	 */
					
	private String dianpumingcheng;
	
	/**
	 * 门店照片
	 */
					
	private String mendianzhaopian;
	
	/**
	 * 配送时间
	 */
					
	private String peisongshijian;
	
	/**
	 * 店铺地址
	 */
					
	private String dianpudizhi;
	
	/**
	 * 店铺详情
	 */
					
	private String dianpuxiangqing;
	
	/**
	 * 配送价格
	 */
					
	private Integer peisongjiage;
	
	/**
	 * 起送价格
	 */
					
	private Integer qisongjiage;
	
	/**
	 * 月售数量
	 */
					
	private String yueshoushuliang;
	
	/**
	 * 开业时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date kaiyeshijian;
	
	/**
	 * 休业时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date xiuyeshijian;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：商家账号
	 */
	public void setShangjiazhanghao(String shangjiazhanghao) {
		this.shangjiazhanghao = shangjiazhanghao;
	}
	/**
	 * 获取：商家账号
	 */
	public String getShangjiazhanghao() {
		return shangjiazhanghao;
	}
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
	 * 设置：门店照片
	 */
	public void setMendianzhaopian(String mendianzhaopian) {
		this.mendianzhaopian = mendianzhaopian;
	}
	/**
	 * 获取：门店照片
	 */
	public String getMendianzhaopian() {
		return mendianzhaopian;
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
	 * 设置：店铺地址
	 */
	public void setDianpudizhi(String dianpudizhi) {
		this.dianpudizhi = dianpudizhi;
	}
	/**
	 * 获取：店铺地址
	 */
	public String getDianpudizhi() {
		return dianpudizhi;
	}
	/**
	 * 设置：店铺详情
	 */
	public void setDianpuxiangqing(String dianpuxiangqing) {
		this.dianpuxiangqing = dianpuxiangqing;
	}
	/**
	 * 获取：店铺详情
	 */
	public String getDianpuxiangqing() {
		return dianpuxiangqing;
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
	 * 设置：开业时间
	 */
	public void setKaiyeshijian(Date kaiyeshijian) {
		this.kaiyeshijian = kaiyeshijian;
	}
	/**
	 * 获取：开业时间
	 */
	public Date getKaiyeshijian() {
		return kaiyeshijian;
	}
	/**
	 * 设置：休业时间
	 */
	public void setXiuyeshijian(Date xiuyeshijian) {
		this.xiuyeshijian = xiuyeshijian;
	}
	/**
	 * 获取：休业时间
	 */
	public Date getXiuyeshijian() {
		return xiuyeshijian;
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

}
