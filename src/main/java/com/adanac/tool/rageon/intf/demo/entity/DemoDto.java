package com.adanac.tool.rageon.intf.demo.entity;

import java.io.Serializable;

public class DemoDto implements Serializable {
	/**
	 */
	private static final long serialVersionUID = 2909177707266824469L;

	private Integer id;
	private String name;

	public DemoDto() {
	}

	public DemoDto(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
