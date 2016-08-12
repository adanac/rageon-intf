package com.adanac.tool.rageon.sql;

import com.adanac.framework.web.controller.BaseResult;

public interface SqlService {

	/**
	 * 将username pwd age 字段对应的值插入到数据库中
	 * @param username
	 * @param pwd
	 * @param age
	 * @return
	 */
	BaseResult insertDB(String username, String pwd, Integer age);

	/**
	 * 根据username和pwd字段精确匹配
	 * @param username
	 * @param pwd
	 * @return
	 */
	BaseResult queryDB(String username, String pwd);

	/**
	 * 根据username模糊匹配
	 * @param username
	 * @return
	 */
	BaseResult queryList(String username);

	/**
	 * In
	 * @param username
	 * @return
	 */
	BaseResult queryIn(String[] username);
}
