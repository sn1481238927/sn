package com.ruoyi.system.service.impl;

import com.ruoyi.common.core.domain.entity.Message;
import com.ruoyi.system.mapper.MessageMapper;
import com.ruoyi.system.service.IMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl implements IMessageService {

    @Autowired
    private MessageMapper messageMapper;

    /**
     * 根据条件分页查询列表
     *
     * @param message 信息
     * @return 信息
     */

    @Override
    public List<Message> selectMessageList(Message message)
    {
        return messageMapper.selectMessageList(message);
    }


    /**
     * 新增物品
     *
     * @param message 物品信息
     * @return 结果
     */
    @Override
    public int insertMessage(Message message)
    {
        return messageMapper.insertMessage(message);
    }

}
