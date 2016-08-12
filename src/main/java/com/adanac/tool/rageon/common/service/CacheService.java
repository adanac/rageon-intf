package com.adanac.tool.rageon.common.service;

/**
 * 缓存
 */
public interface CacheService<T> {

	public T get(String key);

	public void set(String key, T t);

}
