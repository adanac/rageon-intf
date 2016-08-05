package com.adanac.tool.rageon.intf.common.entity;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class CommonDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9047433652716017574L;

	private String id;

	private String username;
	private Integer sex;
	private Integer age;
	private String passwd;

	public CommonDto() {
		super();
	}

	public CommonDto(String name, Integer age) {
		super();
		this.username = name;
		this.age = age;
	}

	public CommonDto(String username, Integer sex, Integer age) {
		super();
		this.username = username;
		this.sex = sex;
		this.age = age;
	}

	public CommonDto(String id, String name, String pwd) {
		super();
		this.id = id;
		this.username = name;
		this.passwd = pwd;
	}

	public CommonDto(String name, String pwd, Integer age) {
		super();
		this.username = name;
		this.passwd = pwd;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "CommonDto [id=" + id + ", username=" + username + ", sex=" + sex + ", age=" + age + ", passwd=" + passwd
				+ "]";
	}

	public Map<String, Object> toMap() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		map.put("username", username);
		map.put("sex", sex);
		map.put("age", age);
		map.put("passwd", passwd);
		return map;
	}

}
