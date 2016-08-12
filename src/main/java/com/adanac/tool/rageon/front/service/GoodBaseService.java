package com.adanac.tool.rageon.front.service;

import java.util.Map;

import com.adanac.framework.page.Pager;
import com.adanac.framework.page.PagerParam;
import com.adanac.tool.rageon.front.entity.GoodDto;

public interface GoodBaseService {
	int[] batchInsert(Map<String, Object>[] maps);

	int deleteById(Map<String, Object> paramMap);

	GoodDto queryByGoodId(String id);

	Pager<GoodDto> queryForPage(Map<String, Object> paramMap, PagerParam pageParam);
}
