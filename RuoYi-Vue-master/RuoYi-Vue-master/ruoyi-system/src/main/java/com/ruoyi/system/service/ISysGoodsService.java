package com.ruoyi.system.service;

import com.ruoyi.common.core.domain.entity.SysGoods;
import com.ruoyi.system.domain.SysNotice;

import java.util.List;

/**
 * 物品 业务层
 *
 * @author sn
 */
public interface ISysGoodsService {
    /**
     * 根据条件分页查询物品列表
     *
     * @param goods 物品信息
     * @return 用户信息集合信息
     */
    public List<SysGoods> selectGoodsList(SysGoods goods);

    /**
     * 新增物品
     *
     * @param goods 物品信息
     * @return 结果
     */
    public int insertGoods(SysGoods goods);


    /**
     * 修改物品
     *
     * @param goods 物品信息
     * @return 结果
     */
    public int updateGoods(SysGoods goods);

    /**
     * 删除物品信息
     *
     * @param id 物品ID
     * @return 结果
     */
    public int deleteGoodsById(Long id);

    /**
     * 批量删除物品信息
     *
     * @param ids 需要删除的物品ID
     * @return 结果
     */
    public int deleteGoodsByIds(Long[] ids);
}
