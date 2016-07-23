package com.adanac.tool.rageon.intf.front.service;

import java.util.List;

import com.adanac.tool.rageon.intf.front.entity.GoodDto;

/**
 * 商品相关接口
 */
public interface GoodService {
	/**
	 * 添加商品
	 * @param map
	 * @return
	 */
	Boolean addGoods(List<GoodDto> goodLisst);
}
