package com.ruoyi.system.mapper;

import com.ruoyi.common.core.domain.entity.Message;

import java.util.List;


public interface MessageMapper {

    /**
     * 根据条件分页查询
     *
     * @param message 信息
     * @return 信息
     */
    public List<Message> selectMessageList(Message message);


    /**
     * 新增信息
     *
     * @param message 信息
     * @return 结果
     */
    public int insertMessage(Message message);
}