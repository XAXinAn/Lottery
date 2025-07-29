package com.ruoyi.lottery.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.lottery.domain.Org1MaxWin;
import com.ruoyi.lottery.service.IOrg1MaxWinService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 支行最高奖状态Controller
 * 
 * @author ruoyi
 * @date 2025-07-29
 */
@RestController
@RequestMapping("/lottery/org1MaxWin")
public class Org1MaxWinController extends BaseController
{
    @Autowired
    private IOrg1MaxWinService org1MaxWinService;

    /**
     * 查询支行最高奖状态列表
     */
    @PreAuthorize("@ss.hasPermi('lottery:org1MaxWin:list')")
    @GetMapping("/list")
    public TableDataInfo list(Org1MaxWin org1MaxWin)
    {
        startPage();
        List<Org1MaxWin> list = org1MaxWinService.selectOrg1MaxWinList(org1MaxWin);
        return getDataTable(list);
    }

    /**
     * 导出支行最高奖状态列表
     */
    @PreAuthorize("@ss.hasPermi('lottery:org1MaxWin:export')")
    @Log(title = "支行最高奖状态", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Org1MaxWin org1MaxWin)
    {
        List<Org1MaxWin> list = org1MaxWinService.selectOrg1MaxWinList(org1MaxWin);
        ExcelUtil<Org1MaxWin> util = new ExcelUtil<Org1MaxWin>(Org1MaxWin.class);
        util.exportExcel(response, list, "支行最高奖状态数据");
    }

    /**
     * 获取支行最高奖状态详细信息
     */
    @PreAuthorize("@ss.hasPermi('lottery:org1MaxWin:query')")
    @GetMapping(value = "/{org1Code}")
    public AjaxResult getInfo(@PathVariable("org1Code") String org1Code)
    {
        return success(org1MaxWinService.selectOrg1MaxWinByOrg1Code(org1Code));
    }

    /**
     * 新增支行最高奖状态
     */
    @PreAuthorize("@ss.hasPermi('lottery:org1MaxWin:add')")
    @Log(title = "支行最高奖状态", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Org1MaxWin org1MaxWin)
    {
        return toAjax(org1MaxWinService.insertOrg1MaxWin(org1MaxWin));
    }

    /**
     * 修改支行最高奖状态
     */
    @PreAuthorize("@ss.hasPermi('lottery:org1MaxWin:edit')")
    @Log(title = "支行最高奖状态", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Org1MaxWin org1MaxWin)
    {
        return toAjax(org1MaxWinService.updateOrg1MaxWin(org1MaxWin));
    }

    /**
     * 删除支行最高奖状态
     */
    @PreAuthorize("@ss.hasPermi('lottery:org1MaxWin:remove')")
    @Log(title = "支行最高奖状态", businessType = BusinessType.DELETE)
	@DeleteMapping("/{org1Codes}")
    public AjaxResult remove(@PathVariable String[] org1Codes)
    {
        return toAjax(org1MaxWinService.deleteOrg1MaxWinByOrg1Codes(org1Codes));
    }
}
