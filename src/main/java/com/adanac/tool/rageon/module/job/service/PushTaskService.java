package com.adanac.tool.rageon.module.job.service;

import java.util.List;

import com.adanac.framework.exception.SysException;
import com.adanac.framework.page.Pager;
import com.adanac.framework.page.PagerParam;
import com.adanac.tool.rageon.module.job.entity.PushTaskDto;

public interface PushTaskService {

	/**
	 * 分页查询推送任务列表
	 * @param taskDto	消息dto
	 * @param param		分页参数
	 * @return	Pager	分页数据
	 */
	Pager<PushTaskDto> queryPushTaskList(PushTaskDto taskDto, PagerParam param);

	/**
	 * 获取全部当前需要推送的推送任务
	 * @return	List	全部可推送的任务
	 */
	List<PushTaskDto> getAllPushingTask();

	/**
	 * 根据ID获取推送任务详情
	 * @param id	推送任务ID
	 * @return	PushTaskDto 推送任务详情
	 */
	PushTaskDto getPushTask(String id);

	/**
	 * 新增推送任务
	 * @param taskDto 
	 * 			1、如果推送的内容为文本：将文本信息存放在taskDto.msgTemplateDto的msgContent属性中
	 * 			2、如果推送的内容为多图文：需要在taskDto.msgTemplateDto中的tempResList中维护映射关系
	 * 			3、如果推送的内容为关键字：taskDto中msgId设置为关键字所关联的消息模板ID
	 * @return	Integer 操作状态 参考：@see com.bn.b2b.wxChat.constant.RespStatus
	 */
	Integer addPushTask(PushTaskDto taskDto) throws SysException;

	/**
	 * 修改推送任务
	 * @param taskDto 传入需要修改的参数，id必需
	 * @return	Integer 操作状态 参考：@see com.bn.b2b.wxChat.constant.RespStatus
	 */
	Integer modPushTask(PushTaskDto taskDto) throws SysException;

	/**
	 * 根据ID删除推送任务
	 * @param id	需要删除的任务ID
	 * @return	Integer 操作状态 参考：@see com.bn.b2b.wxChat.constant.RespStatus
	 */
	Integer delPushTask(String id) throws SysException;

	/**
	 * 设置消息状态
	 * <p>用来在推送任务后设置消息的推送状态</p>
	 * @param userId  设置状态的用户ID
	 * @param id	    消息ID
	 * @param status  状态 @see PushTaskStatus
	 * @return	Integer 操作状态 参考：@see com.bn.b2b.wxChat.constant.RespStatus
	 */
	Integer setStatus(String userId, String id, Integer status) throws SysException;

	/**
	 * 推送失败保存
	 * <p>用来在推送任务后设置消息的推送状态</p>
	 * @param userId  设置状态的用户ID
	 * @param id	    消息ID
	 * @param status  状态 @see PushTaskStatus
	 * @return	Integer 操作状态 参考：@see com.bn.b2b.wxChat.constant.RespStatus
	 */
	Integer setStatusError(String userId, String id, String errorCode) throws SysException;
}
