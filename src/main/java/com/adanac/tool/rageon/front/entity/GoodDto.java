package com.adanac.tool.rageon.front.entity;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * 商品dto
 */
public class GoodDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8780254066906352084L;
	/**
	 * 活动商品中主键ID
	 */
	private String id;
	/**
	 * skuID
	 */
	private String fskuId;

	/**
	 * spuID
	 */
	private String fspuId;

	/**
	 * 供应商ID
	 */
	private String fcooperatorId;

	/**
	 * 商品名称
	 */
	private String fspuTitle;

	/**
	 * 商品库存
	 */
	private Double fskuNumber;

	/**
	 * 商品价格
	 */
	private Double fskuReferPrice;

	/**
	 * 起购量
	 */
	private Integer fspuMinBuyCount;

	/**
	 * 一级类目Id
	 */
	private Long classId1;

	/**
	 * 品类Id
	 */
	private Integer categoryId;
	/**
	 * 折扣
	 */
	private Double discount = 0d;

	/**
	 * 每人限购量
	 */
	private Integer restriction = 0;

	/**
	 * 折后价
	 */
	private Double disPrice;
	/**
	 * 标注商品是否已添加过
	 */
	private boolean selected;

	/**
	 * 商品编码
	 */
	private String fspuLocalCode;

	////////////////////////////////////// 闪拼申请商品的字段
	/**
	 * 优惠价格
	 */
	private Double favorablePrice = 0d;

	/**
	 * 商品标题
	 */
	private String goodsTitle = "";

	/**
	 * 商品图片
	 */
	private String goodsImg = "";

	/**
	 * 阶梯价中文描述
	 */
	private String priceStepDesc = "";

	public String getPriceStepDesc() {
		return priceStepDesc;
	}

	public void setPriceStepDesc(String priceStepDesc) {
		this.priceStepDesc = priceStepDesc;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getFspuLocalCode() {
		return fspuLocalCode;
	}

	public void setFspuLocalCode(String fspuLocalCode) {
		this.fspuLocalCode = fspuLocalCode;
	}

	public String getGoodsImg() {
		return goodsImg;
	}

	public void setGoodsImg(String goodsImg) {
		this.goodsImg = goodsImg;
	}

	public Double getFavorablePrice() {
		return favorablePrice;
	}

	public void setFavorablePrice(Double favorablePrice) {
		this.favorablePrice = favorablePrice;
	}

	public String getGoodsTitle() {
		return goodsTitle;
	}

	public void setGoodsTitle(String goodsTitle) {
		this.goodsTitle = goodsTitle;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	public String getFskuId() {
		return fskuId;
	}

	public void setFskuId(String fskuId) {
		this.fskuId = fskuId;
	}

	public String getFspuId() {
		return fspuId;
	}

	public void setFspuId(String fspuId) {
		this.fspuId = fspuId;
	}

	public String getFcooperatorId() {
		return fcooperatorId;
	}

	public void setFcooperatorId(String fcooperatorId) {
		this.fcooperatorId = fcooperatorId;
	}

	public String getFspuTitle() {
		return fspuTitle;
	}

	public void setFspuTitle(String fspuTitle) {
		this.fspuTitle = fspuTitle;
	}

	public Double getFskuNumber() {
		return fskuNumber;
	}

	public void setFskuNumber(Double fskuNumber) {
		this.fskuNumber = fskuNumber;
	}

	public Double getFskuReferPrice() {
		return fskuReferPrice;
	}

	public void setFskuReferPrice(Double fskuReferPrice) {
		this.fskuReferPrice = fskuReferPrice;
	}

	public Integer getFspuMinBuyCount() {
		return fspuMinBuyCount;
	}

	public void setFspuMinBuyCount(Integer fspuMinBuyCount) {
		this.fspuMinBuyCount = fspuMinBuyCount;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public Integer getRestriction() {
		return restriction;
	}

	public Double getDisPrice() {
		return disPrice;
	}

	public void setDisPrice(Double disPrice) {
		this.disPrice = disPrice;
	}

	public void setRestriction(Integer restriction) {
		this.restriction = restriction;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getClassId1() {
		return classId1;
	}

	public void setClassId1(Long classId1) {
		this.classId1 = classId1;
	}

	@Override
	public String toString() {
		return "GoodDto [id=" + id + ", fskuId=" + fskuId + ", fspuId=" + fspuId + ", fcooperatorId=" + fcooperatorId
				+ ", fspuTitle=" + fspuTitle + ", fskuNumber=" + fskuNumber + ", fskuReferPrice=" + fskuReferPrice
				+ ", fspuMinBuyCount=" + fspuMinBuyCount + ", classId1=" + classId1 + ", categoryId=" + categoryId
				+ ", discount=" + discount + ", restriction=" + restriction + ", disPrice=" + disPrice + ", selected="
				+ selected + ", fspuLocalCode=" + fspuLocalCode + ", favorablePrice=" + favorablePrice + ", goodsTitle="
				+ goodsTitle + ", goodsImg=" + goodsImg + ", priceStepDesc=" + priceStepDesc + "]";
	}

	public Map<String, Object> toMap() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		map.put("fskuId", fskuId);
		map.put("fspuId", fspuId);
		map.put("fspuTitle", fspuTitle);
		map.put("fspuMinBuyCount", fspuMinBuyCount);
		return map;
	}

}
