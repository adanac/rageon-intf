package com.adanac.tool.rageon.common.entity;

import com.adanac.framework.web.controller.BaseDto;

public class BaseResultDto<T> extends BaseDto {

	private static final long serialVersionUID = 1L;

	private T result;

	public BaseResultDto() {

	}

	public BaseResultDto(String errorCode, String errorMsg) {
		this.setStatus(BaseDto.ERROR);
		this.setErrorMsg(errorMsg);
		this.setErrorCode(errorCode);
	}

	public BaseResultDto(T result) {
		this.result = result;
		setStatus(SUCCESS);
	}

	public T getResult() {
		return result;
	}

	public void setResult(T result) {
		this.result = result;
	}

}
