package com.ruoyi.lottery.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.lottery.domain.Transactions;
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
import com.ruoyi.lottery.domain.WinTransactions;
import com.ruoyi.lottery.service.IWinTransactionsService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 中奖交易记录Controller
 *
 * @author ruoyi
 * @date 2025-07-28
 */
@RestController
@RequestMapping("/lottery/winTransactions")
public class WinTransactionsController extends BaseController
{
    @Autowired
    private IWinTransactionsService winTransactionsService;

    /**
     * 查询中奖交易记录列表
     */
    @PreAuthorize("@ss.hasPermi('lottery:winTransactions:list')")
    @GetMapping("/list")
    public TableDataInfo list(WinTransactions winTransactions)
    {
        startPage();
        List<WinTransactions> list = winTransactionsService.selectWinTransactionsList(winTransactions);
        return getDataTable(list);
    }

    /**
     * 导出中奖交易记录列表
     */
    @PreAuthorize("@ss.hasPermi('lottery:winTransactions:export')")
    @Log(title = "中奖交易记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, WinTransactions winTransactions)
    {
        List<WinTransactions> list = winTransactionsService.selectWinTransactionsList(winTransactions);
        ExcelUtil<WinTransactions> util = new ExcelUtil<WinTransactions>(WinTransactions.class);
        util.exportExcel(response, list, "中奖交易记录数据");
    }

    /**
     * 获取中奖交易记录详细信息
     */
    @PreAuthorize("@ss.hasPermi('lottery:winTransactions:query')")
    @GetMapping(value = "/{time}")
    public AjaxResult getInfo(@PathVariable("time") Long time)
    {
        return success(winTransactionsService.selectWinTransactionsByTime(time));
    }

    /**
     * 新增中奖交易记录
     */
    @PreAuthorize("@ss.hasPermi('lottery:winTransactions:add')")
    @Log(title = "中奖交易记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody WinTransactions winTransactions)
    {
        return toAjax(winTransactionsService.insertWinTransactions(winTransactions));
    }

    /**
     * 修改中奖交易记录
     */
    @PreAuthorize("@ss.hasPermi('lottery:winTransactions:edit')")
    @Log(title = "中奖交易记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody WinTransactions winTransactions)
    {
        return toAjax(winTransactionsService.updateWinTransactions(winTransactions));
    }

    /**
     * 删除中奖交易记录
     */
    @PreAuthorize("@ss.hasPermi('lottery:winTransactions:remove')")
    @Log(title = "中奖交易记录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{times}")
    public AjaxResult remove(@PathVariable Long[] times)
    {
        return toAjax(winTransactionsService.deleteWinTransactionsByTimes(times));
    }

    /**
     * 抽奖接口
     */
    @GetMapping("/lottery")
    public AjaxResult lottery()
    {
        List<WinTransactions> winTransactionsList = new ArrayList<>();
        WinTransactions winTransaction = new WinTransactions(1L,9234167L,20250117L,19451778L,731282L, BigDecimal.valueOf(66.3),"966230","966230","7dcee2c765c9b735ded5b1c21e49a566","正常","江*","76bfee1a83612afd24cf4fa479a206ba","b40fa3006cd062625dc56c88eb32eeca","银行**");
        winTransactionsList.add(winTransaction);
//        List<Prize> prizes = new ArrayList<>();
//        prizes.add(new Prize(5,50,35,700));
//        prizes.add(new Prize(50,100,10,800));
//        prizes.add(new Prize(100,800,5,1500));
//        List<Transactions> transactionsList = transactionsService.lottery(prizes);
//        return AjaxResult.success(transactionsList);
//        return success(winTransactionsService.lottery());
        return success(winTransactionsList);
    }
}
