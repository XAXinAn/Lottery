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
import com.ruoyi.lottery.domain.Transactions;
import com.ruoyi.lottery.service.ITransactionsService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 交易记录Controller
 * 
 * @author ruoyi
 * @date 2025-07-28
 */
@RestController
@RequestMapping("/lottery/transactions")
public class TransactionsController extends BaseController
{
    @Autowired
    private ITransactionsService transactionsService;

    /**
     * 查询交易记录列表
     */
    @PreAuthorize("@ss.hasPermi('lottery:transactions:list')")
    @GetMapping("/list")
    public TableDataInfo list(Transactions transactions)
    {
        startPage();
        List<Transactions> list = transactionsService.selectTransactionsList(transactions);
        return getDataTable(list);
    }

    /**
     * 导出交易记录列表
     */
    @PreAuthorize("@ss.hasPermi('lottery:transactions:export')")
    @Log(title = "交易记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Transactions transactions)
    {
        List<Transactions> list = transactionsService.selectTransactionsList(transactions);
        ExcelUtil<Transactions> util = new ExcelUtil<Transactions>(Transactions.class);
        util.exportExcel(response, list, "交易记录数据");
    }

    /**
     * 获取交易记录详细信息
     */
    @PreAuthorize("@ss.hasPermi('lottery:transactions:query')")
    @GetMapping(value = "/{acctnbr}")
    public AjaxResult getInfo(@PathVariable("acctnbr") Long acctnbr)
    {
        return success(transactionsService.selectTransactionsByAcctnbr(acctnbr));
    }

    /**
     * 新增交易记录
     */
    @PreAuthorize("@ss.hasPermi('lottery:transactions:add')")
    @Log(title = "交易记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Transactions transactions)
    {
        return toAjax(transactionsService.insertTransactions(transactions));
    }

    /**
     * 修改交易记录
     */
    @PreAuthorize("@ss.hasPermi('lottery:transactions:edit')")
    @Log(title = "交易记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Transactions transactions)
    {
        return toAjax(transactionsService.updateTransactions(transactions));
    }

    /**
     * 删除交易记录
     */
    @PreAuthorize("@ss.hasPermi('lottery:transactions:remove')")
    @Log(title = "交易记录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{acctnbrs}")
    public AjaxResult remove(@PathVariable Long[] acctnbrs)
    {
        return toAjax(transactionsService.deleteTransactionsByAcctnbrs(acctnbrs));
    }
}
