package com.ruoyi.common.core.domain.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;


/**
 * 信息对象 message
 *
 * @author sn
 */
public class Message  extends BaseEntity {

    /** 消息ID */
    @Excel(name = "消息序号")
    private Long newsId;

    /** 内容 */
    @Excel(name = "内容")
    private String content;

    /** 用户名称 */
    @Excel(name = "用户名称")
    private String nickName;

    /** 父ID */
    @Excel(name = "父ID")
    private Long parentId;

    /** 物品ID */
    @Excel(name = "物品ID")
    private Long goodsid;

    /** 发表时间 */
    @Excel(name = "发表时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date settime;

    public Message()
    {

    }
    public Long getNewsId()
    {
        return newsId;
    }

    public void setNewsId(Long newsId)
    {
        this.newsId = newsId;
    }

    public String getContent()
    {
        return content;
    }

    public void setContent(String content)
    {
        this.content = content;
    }

    public Long getParentId()
    {
        return parentId;
    }

    public void setParentId(Long parentId)
    {
        this.parentId = parentId;
    }

    public String getNickName()
    {
        return nickName;
    }

    public void setNickName(String nickName)
    {
        this.nickName = nickName;
    }

    public Long getGoodsid()
    {
        return goodsid;
    }

    public void setGoodsid(Long goodsid)
    {
        this.goodsid = goodsid;
    }


    public Date getSettime()
    {
        return settime;
    }

    public void setSettime(Date settime)
    {
        this.settime = settime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("newsId", getNewsId())
                .append("goodsid", getGoodsid())
                .append("content", getContent())
                .append("nickeName", getNickName())
                .append("settime", getSettime())
                .append("parentId", getParentId())
                .toString();
    }
}
