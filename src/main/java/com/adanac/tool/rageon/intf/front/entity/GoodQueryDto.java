package com.adanac.tool.rageon.intf.front.entity;

import java.io.Serializable;

public class GoodQueryDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8693364969090568361L;
	private String goodName;
	private String activityId;
	private String discountType;
	private String pageNumber;
	private String pageSize;

	public String getGoodName() {
		return goodName;
	}

	public void setGoodName(String goodName) {
		this.goodName = goodName;
	}

	public String getActivityId() {
		return activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getDiscountType() {
		return discountType;
	}

	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}

	public String getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getPageSize() {
		return pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	@Override
	public String toString() {
		return "GoodQueryDto [activityId=" + activityId + ", discountType=" + discountType + ", pageNumber="
				+ pageNumber + ", pageSize=" + pageSize + "]";
	}

}
