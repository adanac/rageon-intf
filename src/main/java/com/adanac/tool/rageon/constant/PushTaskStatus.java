package com.adanac.tool.rageon.constant;

public enum PushTaskStatus {

	/**
	 * 已推送
	 */
	pushed(1),
	
	/**
	 * 推送中
	 */
	pushing(2),
	
	/**
	 * 推送失败 
	 */
	failed(3);
	
	private int value;
	
	private PushTaskStatus(Integer type){
		this.value = type;
	}
	
	public int getValue(){
		return value;
	}
}
