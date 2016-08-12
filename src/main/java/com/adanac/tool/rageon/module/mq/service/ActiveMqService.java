package com.adanac.tool.rageon.module.mq.service;

public interface ActiveMqService {

	/**
	 * 同步处理时间
	 * @param id
	 */
	public void syncMonitor(String id);
}
