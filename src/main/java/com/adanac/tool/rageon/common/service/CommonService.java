package com.adanac.tool.rageon.common.service;

import java.util.List;

import com.adanac.framework.page.Pager;
import com.adanac.framework.page.PagerParam;
import com.adanac.framework.web.controller.BaseResult;
import com.adanac.tool.rageon.common.entity.CommonDto;

public interface CommonService {

	/**
	 * 分页查询dto
	 * @param query 0精确查询，1根据id或username模糊匹配
	 */
	Pager<CommonDto> queryCommonDtoPage(CommonDto commonDto, PagerParam param, Integer query);

	/**
	 * 查询dto列表
	 */
	List<CommonDto> queryCommonDtoList(CommonDto commonDto);

	/**
	 * 保存单个用户
	 * @param commonDto
	 * @return
	 */
	BaseResult addCommonDto(CommonDto commonDto);

	/**
	 * 批量保存用户
	 * @param paramJson
	 * @return
	 */
	BaseResult addCommonDto(List<CommonDto> commonDtoList);

	BaseResult getCommonDtoByID(String id);

	CommonDto getCommonDto(String id);

	BaseResult modCommonDto(String id);

	BaseResult delCommonDto(String id);

}
