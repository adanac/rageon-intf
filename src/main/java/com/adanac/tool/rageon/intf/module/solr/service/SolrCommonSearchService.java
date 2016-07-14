package com.adanac.tool.rageon.intf.module.solr.service;

import java.util.Map;

import com.adanac.framework.page.Pager;
import com.adanac.framework.page.PagerParam;
import com.adanac.tool.rageon.intf.common.entity.CommonDto;

public interface SolrCommonSearchService {

	/**
	 * 根据条件调用solr查询数据
	 * @param dto
	 * @param param
	 * @return
	 */
	public Pager<CommonDto> queryDtos(CommonDto dto, PagerParam param);

	/**
	 * 
	 * 查询solr的数据
	 * @param map
	 * @param param
	 * @return
	 */
	public Pager<CommonDto> searchCommonDtos(Map<String, Object> map, PagerParam param);

	/**
	 * 根据id查询
	 * @param id
	 * @return
	 */
	public CommonDto getCommonDtoById(String id);

	/**
	 * 根据对象实体查询
	 * @param dto
	 * @return
	 */
	public CommonDto getCommonDtoByEntity(CommonDto dto);
}
