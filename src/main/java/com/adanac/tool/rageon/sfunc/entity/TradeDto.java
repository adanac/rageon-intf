package com.adanac.tool.rageon.sfunc.entity;

import java.io.Serializable;

import com.adanac.framework.web.controller.BaseDto;

/**
 * 微商城交易记录dto
 * 
 */
public class TradeDto extends BaseDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5472155503020868869L;
	private Long id;
	/**
	 * 商户ID
	 */
	private Long companyId;
	/**
	 * 商户编码
	 */
	private String companyCode;
	/**
	 * 商户名称
	 */
	private String companyName;
	/**
	 * 微信公众号ID
	 */
	private String pubnumId;
	/**
	 * 发生日期
	 */
	private String occurDate;
	/**
	 * 支付笔数
	 */
	private Double payCount;
	/**
	 * 支付金额
	 */
	private Double payMoney;
	/**
	 * 上传时间
	 */
	private String uploadDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName == null ? null : companyName.trim();
	}

	public String getPubnumId() {
		return pubnumId;
	}

	public void setPubnumId(String pubnumId) {
		this.pubnumId = pubnumId;
	}

	public String getOccurDate() {
		return occurDate;
	}

	public void setOccurDate(String occurDate) {
		this.occurDate = occurDate == null ? null : occurDate.trim();
	}

	public Double getPayCount() {
		return payCount;
	}

	public void setPayCount(Double payCount) {
		this.payCount = payCount;
	}

	public Double getPayMoney() {
		return payMoney;
	}

	public void setPayMoney(Double payMoney) {
		this.payMoney = payMoney;
	}

	public String getUploadDate() {
		return uploadDate;
	}

	public void setUploadDate(String uploadDate) {
		this.uploadDate = uploadDate == null ? null : uploadDate.trim();
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

}