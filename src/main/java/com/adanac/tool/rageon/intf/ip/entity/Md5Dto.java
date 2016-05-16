package com.adanac.tool.rageon.intf.ip.entity;

import java.io.Serializable;

public class Md5Dto implements Serializable {
	// "querymd5=1&md5type=encode&formhash=5c93b841&querymd5submit=encode"
	private static final long serialVersionUID = -6627772860809449801L;
	private String querymd5;

	// 1 encode , 0 decode
	private String md5type;

	public String getQuerymd5() {
		return querymd5;
	}

	public void setQuerymd5(String querymd5) {
		this.querymd5 = querymd5;
	}

	public String getMd5type() {
		return md5type;
	}

	public void setMd5type(String md5type) {
		this.md5type = md5type;
	}

	@Override
	public String toString() {
		return "Md5Dto [querymd5=" + querymd5 + ", md5type=" + md5type + "]";
	}

}
