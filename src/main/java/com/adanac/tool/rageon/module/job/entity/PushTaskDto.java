package com.adanac.tool.rageon.module.job.entity;

import java.io.Serializable;

public class PushTaskDto implements Serializable {

	private static final long serialVersionUID = -4033456179558765729L;

	/**
	 * 消息推送ID
	 */
	private String id;

	/**
	 * 消息标题
	 */
	private String title;

	/**
	 * 推送方式
	 * 1:立即推送2:定时推送
	 * @see PushTaskMode
	 */
	private Integer pushmode;

	/**
	 * 推送时间
	 */
	private String pushtime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getPushmode() {
		return pushmode;
	}

	public void setPushmode(Integer pushmode) {
		this.pushmode = pushmode;
	}

	public String getPushtime() {
		return pushtime;
	}

	public void setPushtime(String pushtime) {
		this.pushtime = pushtime;
	}

	@Override
	public String toString() {
		return "PushTaskDto [id=" + id + ", title=" + title + ", pushmode=" + pushmode + ", pushtime=" + pushtime + "]";
	}

}
