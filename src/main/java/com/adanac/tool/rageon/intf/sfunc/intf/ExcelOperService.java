package com.adanac.tool.rageon.intf.sfunc.intf;

import com.adanac.framework.web.controller.BaseResult;

public interface ExcelOperService {

	/**
	 * 客户管理导入2.0验证数据格式
	 * @param fileName
	 * @return
	 */
	public BaseResult readXlsNew(String fileName, String type, String userId);
}
