package com.ruoyi.web.controller.system;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.domain.entity.SysGoods;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.service.ISysGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 物品信息
 *
 * @author sn
 */
@RestController
@RequestMapping("/system/goods")
public class SysGoodsController extends BaseController {

    @Autowired
    private ISysGoodsService sysGoodsService;

    /**
     * 获取物品列表
     */
    @PreAuthorize("@ss.hasPermi('system:goods:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysGoods goods)
    {
        startPage();
        List<SysGoods> list = sysGoodsService.selectGoodsList(goods);
        return getDataTable(list);
    }

    /**
     * 新增物品信息
     */
    @PreAuthorize("@ss.hasPermi('system:goods:add')")
    @Log(title = "物品信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@Validated @RequestBody SysGoods goods)
    {
        goods.setCreateBy(getUsername());
        return toAjax(sysGoodsService.insertGoods(goods));
    }

    /**
     * 修改物品
     */
    @PreAuthorize("@ss.hasPermi('system:goods:edit')")
    @Log(title = "物品管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@Validated @RequestBody SysGoods goods)
    {
        goods.setUpdateBy(getUsername());
        return toAjax(sysGoodsService.updateGoods(goods));
    }

    /**
     * 删除物品
     */
    @PreAuthorize("@ss.hasPermi('system:goods:remove')")
    @Log(title = "物品管理", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(sysGoodsService.deleteGoodsByIds(ids));
    }
}
