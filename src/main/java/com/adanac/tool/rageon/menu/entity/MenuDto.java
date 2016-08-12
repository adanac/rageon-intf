package com.adanac.tool.rageon.menu.entity;

import java.io.Serializable;

public class MenuDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7536533292162001810L;
	private Integer id;
	private Integer pId;
	private String name;
	private String url;
	private String shortUrl;
	private String createTime;
	private String updateTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPId() {
		return pId;
	}

	public void setPId(Integer pId) {
		this.pId = pId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getShortUrl() {
		return shortUrl;
	}

	public void setShortUrl(String shortUrl) {
		this.shortUrl = shortUrl;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		return "MenuDto [id=" + id + ", pId=" + pId + ", name=" + name + ", url=" + url + ", shortUrl=" + shortUrl
				+ ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
	}

}
