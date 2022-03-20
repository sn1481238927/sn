package com.ruoyi.system.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 物品对象 goods
 *
 * @author sn
 */
public class SysGoodsVo extends BaseEntity {

    /** 物品ID */
    @Excel(name = "物品序号")
    private Long id;

    /** 描述 */
    @Excel(name = "描述")
    private String goodsdescribe;

    /** 用户名称 */
    @Excel(name = "用户名称")
    private String nickName;

    /** 地址 */
    @Excel(name = "地址")
    private String address;

    /** 电话 */
    @Excel(name = "电话")
    private String phonenumber;

    /** 名称 */
    @Excel(name = "名称")
    private String goodsname;

    /** 类型 */
    @Excel(name = "类型")
    private Integer goodstype;

    /** 状态 */
    @Excel(name = "状态")
    private Integer status;

    /** 发布人ID */
    @Excel(name = "发布人Id")
    private Long userId;

    /** 发布时间 */
    @Excel(name = "发布时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date createtime;

    /** 结束时间 */
    @Excel(name = "结束时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date endtime;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getGoodsdescribe()
    {
        return goodsdescribe;
    }

    public void setGoodsdescribe(String goodsdescribe)
    {
        this.goodsdescribe = goodsdescribe;
    }

    public String getGoodsname()
    {
        return goodsname;
    }

    public void setGoodsname(String goodsname)
    {
        this.goodsname = goodsname;
    }

    public String getNickName()
    {
        return nickName;
    }

    public void setNickName(String nickName)
    {
        this.nickName = nickName;
    }

    public String getPhonenumber()
    {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber)
    {
        this.phonenumber = phonenumber;
    }

    public String getAddress() { return address; }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public Integer getGoodstype()
    {
        return goodstype;
    }

    public void setGoodstype(Integer goodstype)
    {
        this.goodstype = goodstype;
    }

    public Integer getStatus()
    {
        return status;
    }

    public void setStatus(Integer status)
    {
        this.status = status;
    }

    public Long getUserId()
    {
        return userId;
    }

    public void setUserId(Long userId)
    {
        this.userId = userId;
    }

    public Date getCreatetime()
    {
        return createtime;
    }

    public void setCreatetime(Date createtime)
    {
        this.createtime = createtime;
    }
    public Date getEndtime()
    {
        return endtime;
    }

    public void setEndtime(Date endtime)
    {
        this.endtime = endtime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("goodsdescribe", getGoodsdescribe())
                .append("goodstype", getGoodstype())
                .append("goodsname", getGoodsname())
                .append("status", getStatus())
                .append("endtime", getEndtime())
                .append("userId", getUserId())
                .append("createtime", getCreatetime())
                .append("nickeName", getNickName())
                .append("address", getAddress())
                .append("phonenumber", getPhonenumber())
                .toString();
    }
}
