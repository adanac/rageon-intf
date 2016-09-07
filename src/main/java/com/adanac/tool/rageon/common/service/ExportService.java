package com.adanac.tool.rageon.common.service;

import java.util.List;

import com.adanac.tool.rageon.common.entity.CommonDto;

/**
 * 导出service接口
 */
public interface ExportService {

	/**
	 * 导出文件
	 * @param basePath
	 * @param list
	 * @return
	 */
	public String exportFile(String basePath, List<CommonDto> list);

}
