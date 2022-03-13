package com.ruoyi.system.service.impl;

import com.ruoyi.common.core.domain.entity.SysGoods;
import com.ruoyi.system.mapper.SysGoodsMapper;
import com.ruoyi.system.service.ISysGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 物品管理 服务实现
 *
 * @author sn
 */
@Service
public class SysGoodsServiceImpl implements ISysGoodsService {

    @Autowired
    private SysGoodsMapper sysGoodsMapper;

    /**
     * 根据条件分页查询物品列表
     *
     * @param goods 物品信息
     * @return 物品信息集合信息
     */

    @Override
    public List<SysGoods> selectGoodsList(SysGoods goods)
    {
        return sysGoodsMapper.selectSysGoodsList(goods);
    }


    /**
     * 新增物品
     *
     * @param goods 物品信息
     * @return 结果
     */
    @Override
    public int insertGoods(SysGoods goods)
    {
        return sysGoodsMapper.insertGoods(goods);
    }

    /**
     * 修改物品
     *
     * @param goods 物品信息
     * @return 结果
     */
    @Override
    public int updateGoods(SysGoods goods)
    {
        return sysGoodsMapper.updateGoods(goods);
    }

    /**
     * 删除物品对象
     *
     * @param id 物品ID
     * @return 结果
     */
    @Override
    public int deleteGoodsById(Long id)
    {
        return sysGoodsMapper.deleteGoodsById(id);
    }

    /**
     * 批量删除物品信息
     *
     * @param ids 需要删除的物品ID
     * @return 结果
     */
    @Override
    public int deleteGoodsByIds(Long[] ids)
    {
        return sysGoodsMapper.deleteGoodsByIds(ids);
    }
}
