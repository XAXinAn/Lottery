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
import com.ruoyi.lottery.domain.Prizes;
import com.ruoyi.lottery.service.IPrizesService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 中奖区间信息Controller
 * 
 * @author ruoyi
 * @date 2025-08-08
 */
@RestController
@RequestMapping("/lottery/prizes")
public class PrizesController extends BaseController
{
    @Autowired
    private IPrizesService prizesService;

    /**
     * 查询中奖区间信息列表
     */
    @PreAuthorize("@ss.hasPermi('lottery:prizes:list')")
    @GetMapping("/list")
    public TableDataInfo list(Prizes prizes)
    {
        startPage();
        List<Prizes> list = prizesService.selectPrizesList(prizes);
        return getDataTable(list);
    }

    /**
     * 导出中奖区间信息列表
     */
    @PreAuthorize("@ss.hasPermi('lottery:prizes:export')")
    @Log(title = "中奖区间信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Prizes prizes)
    {
        List<Prizes> list = prizesService.selectPrizesList(prizes);
        ExcelUtil<Prizes> util = new ExcelUtil<Prizes>(Prizes.class);
        util.exportExcel(response, list, "中奖区间信息数据");
    }

    /**
     * 获取中奖区间信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('lottery:prizes:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(prizesService.selectPrizesById(id));
    }

    /**
     * 新增中奖区间信息
     */
    @PreAuthorize("@ss.hasPermi('lottery:prizes:add')")
    @Log(title = "中奖区间信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Prizes prizes)
    {
        return toAjax(prizesService.insertPrizes(prizes));
    }

    /**
     * 修改中奖区间信息
     */
    @PreAuthorize("@ss.hasPermi('lottery:prizes:edit')")
    @Log(title = "中奖区间信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Prizes prizes)
    {
        return toAjax(prizesService.updatePrizes(prizes));
    }

    /**
     * 删除中奖区间信息
     */
    @PreAuthorize("@ss.hasPermi('lottery:prizes:remove')")
    @Log(title = "中奖区间信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(prizesService.deletePrizesByIds(ids));
    }
}
