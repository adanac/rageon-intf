package com.adanac.tool.rageon.intf.front;

import java.io.Serializable;

public class KeywordDto implements Serializable {

	private static final long serialVersionUID = 7285563901349307371L;

	private String id;

	/**
	 * 消息模板Id
	 */
	private String msgTemplateId;

	/**
	 * 公众号Id
	 */
	private String pubnum;

	/**
	 * 名称
	 */
	private String name;

	/**
	 * 匹配模式
	 */
	private Integer matchType;

	/**
	 * 状态
	 */
	private Integer status;

	/**
	 * 最新更新时间
	 */
	private String updateTime;

	/**
	 * 最新更新用户ID
	 */
	private String updateUserId;

	/**
	 * 创建时间
	 */
	private String createTime;

	/**
	 * 创建用户Id
	 */
	private String createUserId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMsgTemplateId() {
		return msgTemplateId;
	}

	public void setMsgTemplateId(String msgTemplateId) {
		this.msgTemplateId = msgTemplateId;
	}

	public String getPubnum() {
		return pubnum;
	}

	public void setPubnum(String pubnum) {
		this.pubnum = pubnum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getMatchType() {
		return matchType;
	}

	public void setMatchType(Integer matchType) {
		this.matchType = matchType;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public String getUpdateUserId() {
		return updateUserId;
	}

	public void setUpdateUserId(String updateUserId) {
		this.updateUserId = updateUserId;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}

	@Override
	public String toString() {
		return "KeywordDto [id=" + id + ", msgTemplateId=" + msgTemplateId + ", pubnum=" + pubnum + ", name=" + name
				+ ", matchType=" + matchType + ", status=" + status + ", updateTime=" + updateTime + ", updateUserId="
				+ updateUserId + ", createTime=" + createTime + ", createUserId=" + createUserId + "]";
	}

}
