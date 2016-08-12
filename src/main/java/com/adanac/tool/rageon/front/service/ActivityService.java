package com.adanac.tool.rageon.front.service;

import com.adanac.framework.page.Pager;
import com.adanac.tool.rageon.front.entity.ActivityDto;
import com.adanac.tool.rageon.front.entity.ActivityQueryDto;

/**
 * 限时活动接口
 */
public interface ActivityService {

	/**
	 * 保存活动
	 * @param list
	 * @return
	 */
	String addActivity(ActivityDto activityDto);

	/**
	 * 查询活动
	 * @param map
	 * @return
	 */
	Pager<ActivityDto> queryActivityList(ActivityQueryDto queryDto);

}
