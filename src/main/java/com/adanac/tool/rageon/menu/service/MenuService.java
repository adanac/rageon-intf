package com.adanac.tool.rageon.menu.service;

import java.util.List;

import com.adanac.tool.rageon.menu.entity.MenuDto;

/**
 * menu接口
 */
public interface MenuService {

	List<MenuDto> listMenu(MenuDto menuDto);

	/**
	 * 增加菜单
	 * @param menu
	 * @return
	 */
	Integer addMenu(MenuDto menu);

	/**
	 * 查询某个特定菜单项
	 * @param id
	 * @return
	 */
	MenuDto getMenu(Integer id);

	/**
	 * 修改菜单
	 * @param menu
	 * @return
	 */
	Boolean updateMenu(MenuDto menu);

	/**
	 * 删除菜单
	 * @param id
	 * @return
	 */
	Boolean delMenu(Integer id);
}
