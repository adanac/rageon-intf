package com.adanac.tool.rageon.module.mq.service;

import com.adanac.tool.rageon.module.mq.entity.MonitorDto;

public interface MonitorService {
	public MonitorDto monitor(MonitorDto monitor);

	public String add(MonitorDto dto);

	public MonitorDto get(String id);

	public int mod(MonitorDto dto);
}
