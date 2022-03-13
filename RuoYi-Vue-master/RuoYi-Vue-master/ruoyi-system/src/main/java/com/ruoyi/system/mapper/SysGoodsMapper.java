package com.ruoyi.system.mapper;

import com.ruoyi.common.core.domain.entity.SysGoods;
import com.ruoyi.system.domain.SysNotice;

import java.util.List;

public interface SysGoodsMapper {
    /**
     * 根据条件分页查询物品数据
     *
     * @param goods 物品信息
     * @return 物品信息
     */
    public List<SysGoods> selectSysGoodsList(SysGoods goods);

    /**
     * 新增物品信息
     *
     * @param goods 物品信息
     * @return 结果
     */
    public int insertGoods(SysGoods goods);

    /**
     * 修改物品信息
     *
     * @param goods 物品信息
     * @return 结果
     */
    public int updateGoods(SysGoods goods);

    /**
     * 删除物品
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
