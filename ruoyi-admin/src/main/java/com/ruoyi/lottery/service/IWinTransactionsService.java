package com.ruoyi.lottery.service;

import java.util.List;

import com.ruoyi.lottery.domain.Transactions;
import com.ruoyi.lottery.domain.WinTransactions;

/**
 * 中奖交易记录Service接口
 * 
 * @author ruoyi
 * @date 2025-08-08
 */
public interface IWinTransactionsService 
{
    /**
     * 查询中奖交易记录
     * 
     * @param id 中奖交易记录主键
     * @return 中奖交易记录
     */
    public WinTransactions selectWinTransactionsById(Long id);

    /**
     * 查询中奖交易记录列表
     * 
     * @param winTransactions 中奖交易记录
     * @return 中奖交易记录集合
     */
    public List<WinTransactions> selectWinTransactionsList(WinTransactions winTransactions);

    /**
     * 新增中奖交易记录
     * 
     * @param winTransactions 中奖交易记录
     * @return 结果
     */
    public int insertWinTransactions(WinTransactions winTransactions);

    /**
     * 修改中奖交易记录
     * 
     * @param winTransactions 中奖交易记录
     * @return 结果
     */
    public int updateWinTransactions(WinTransactions winTransactions);

    /**
     * 批量删除中奖交易记录
     * 
     * @param ids 需要删除的中奖交易记录主键集合
     * @return 结果
     */
    public int deleteWinTransactionsByIds(Long[] ids);

    /**
     * 删除中奖交易记录信息
     * 
     * @param id 中奖交易记录主键
     * @return 结果
     */
    public int deleteWinTransactionsById(Long id);


    /**
     * 抽奖
     * @return 结果
     */
    public List<Transactions> lottery();
}
