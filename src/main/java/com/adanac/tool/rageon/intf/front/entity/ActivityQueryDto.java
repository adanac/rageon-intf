package com.adanac.tool.rageon.intf.front.entity;

import java.io.Serializable;

public class ActivityQueryDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6279891480454450905L;

	private String name;
	private String startDttm;
	private String endDttm;
	private Integer status;
	private Integer PageSize;
	private Integer PageNumber;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStartDttm() {
		return startDttm;
	}

	public void setStartDttm(String startDttm) {
		this.startDttm = startDttm;
	}

	public String getEndDttm() {
		return endDttm;
	}

	public void setEndDttm(String endDttm) {
		this.endDttm = endDttm;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getPageSize() {
		return PageSize;
	}

	public void setPageSize(Integer pageSize) {
		PageSize = pageSize;
	}

	public Integer getPageNumber() {
		return PageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		PageNumber = pageNumber;
	}

	@Override
	public String toString() {
		return "ActivityQueryDto [name=" + name + ", startDttm=" + startDttm + ", endDttm=" + endDttm + ", status="
				+ status + ", PageSize=" + PageSize + ", PageNumber=" + PageNumber + "]";
	}

}
