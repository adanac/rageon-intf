package com.adanac.tool.rageon.module.disconf.service;

public interface DisconfService {
	/**
	* 验证是否合法的商户
	* @param companyCode 商户编码
	* @return
	*/
	boolean validateCompanyCode(String companyCode);
}
