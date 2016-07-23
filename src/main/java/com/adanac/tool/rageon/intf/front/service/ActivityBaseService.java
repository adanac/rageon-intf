package com.adanac.tool.rageon.intf.front.service;

import java.util.List;
import java.util.Map;

import com.adanac.framework.page.Pager;
import com.adanac.framework.page.PagerParam;
import com.adanac.tool.rageon.intf.front.entity.ActivityDto;

/**
 * 活动基础业务实现接口
 */
public interface ActivityBaseService {
	/**
	 * 新增限时促销活动信息
	 * @param suppActivityDto 限时促销活动
	 * @return 活动主键
	 */
	public int addActivity(ActivityDto suppActivityDto);

	/**
	 * 修改限时促销信息
	 * @param platActivity 限时促销活动
	 * @return 是否成功 0-成功 1-失败
	 */
	public int modActivity(ActivityDto suppActivityDto);

	int stop(ActivityDto tempXSAct);

	ActivityDto queryByActivityId(String suppActivityId);

	Pager<ActivityDto> queryForPage(Map<String, Object> paramMap, PagerParam pageParam);

	List<ActivityDto> queryRepeatActivityList(Map<String, Object> paramMap);
}
