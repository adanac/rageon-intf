package com.adanac.tool.rageon.intf.common.entity;

import java.io.Serializable;

public class CommonDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9047433652716017574L;

	private String id;

	private String name;

	private String pwd;

	private Integer age;

	public CommonDto() {
		super();
	}

	public CommonDto(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	public CommonDto(String id, String name, String pwd) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
	}

	public CommonDto(String name, String pwd, Integer age) {
		super();
		this.name = name;
		this.pwd = pwd;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "CommonDto [id=" + id + ", name=" + name + ", pwd=" + pwd + ", age=" + age + "]";
	}

}
