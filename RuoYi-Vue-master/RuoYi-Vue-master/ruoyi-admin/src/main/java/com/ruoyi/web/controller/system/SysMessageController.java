package com.ruoyi.web.controller.system;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.domain.entity.Message;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.service.IMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 消息
 *
 * @author sn
 */
@RestController
@RequestMapping("/system/message")
public class SysMessageController extends BaseController {

    @Autowired
    private IMessageService MessageService;

    /**
     * 获取列表
     */
    @PreAuthorize("@ss.hasPermi('system:message:list')")
    @GetMapping("/list")
    public TableDataInfo list(Message message)
    {
        startPage();
        List<Message> list = MessageService.selectMessageList(message);
        return getDataTable(list);
    }

    /**
     * 新增消息
     */
    @PreAuthorize("@ss.hasPermi('system:message:add')")
    @Log(title = "消息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@Validated @RequestBody Message message)
    {
        message.setCreateBy(getUsername());
        return toAjax(MessageService.insertMessage(message));
    }
}
