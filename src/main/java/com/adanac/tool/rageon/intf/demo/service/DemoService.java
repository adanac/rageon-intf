package com.adanac.tool.rageon.intf.demo.service;

import com.adanac.framework.page.Pager;
import com.adanac.framework.page.PagerParam;
import com.adanac.tool.rageon.intf.demo.entity.DemoDto;

public interface DemoService {

	public Pager<DemoDto> getDemoList(DemoDto demoDto, PagerParam pagerParam);

	public DemoDto getDemoById(Integer id);

	public boolean delDemoById(Integer id);

	public boolean addDemo(DemoDto demoDto);

	public boolean modDemo(DemoDto demoDto);

}
