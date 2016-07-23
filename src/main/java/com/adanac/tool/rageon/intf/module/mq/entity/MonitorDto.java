package com.adanac.tool.rageon.intf.module.mq.entity;

import java.io.Serializable;

public class MonitorDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2160477681966270768L;
	private String id; // 事件id
	private Integer type;// 事件类型(0 查询 1新增 2修改 3删除
	private String happenTime;
	private String processTime;// 处理时间
	private String content;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getHappenTime() {
		return happenTime;
	}

	public void setHappenTime(String happenTime) {
		this.happenTime = happenTime;
	}

	public String getProcessTime() {
		return processTime;
	}

	public void setProcessTime(String processTime) {
		this.processTime = processTime;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "MonitorDto [id=" + id + ", type=" + type + ", happenTime=" + happenTime + ", processTime=" + processTime
				+ ", content=" + content + "]";
	}

}
