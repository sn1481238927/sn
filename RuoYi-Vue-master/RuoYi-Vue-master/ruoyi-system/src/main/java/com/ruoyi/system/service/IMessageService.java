package com.ruoyi.system.service;

import com.ruoyi.common.core.domain.entity.Message;

import java.util.List;

public interface IMessageService {
    /**
     * 根据条件分页查询列表
     *
     * @param message 信息
     * @return 信息
     */
    public List<Message> selectMessageList(Message message);

    /**
     * 新增
     *
     * @param message 信息
     * @return 结果
     */
    public int insertMessage(Message message);
}
