package com.adanac.tool.rageon.intf.common.service;

import com.adanac.framework.page.Pager;
import com.adanac.framework.web.controller.BaseResult;
import com.adanac.tool.rageon.intf.common.entity.BootstrapPage;
import com.adanac.tool.rageon.intf.common.entity.CommonDto;

public interface BootstrapTableService {

	/**
	 * 分页查询dto
	 * 
	 * @param keywordDto
	 * @param param
	 * @return
	 */
	Pager<CommonDto> queryCommonDtoList(CommonDto commonDto, BootstrapPage param);

	/**
	 * 根据ID获取dto
	 */
	BaseResult getCommonDto(String id);

}
