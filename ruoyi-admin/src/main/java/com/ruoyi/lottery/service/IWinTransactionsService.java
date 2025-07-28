package com.ruoyi.lottery.service;

import java.util.List;
import com.ruoyi.lottery.domain.WinTransactions;

/**
 * 中奖交易记录Service接口
 *
 * @author ruoyi
 * @date 2025-07-28
 */
public interface IWinTransactionsService
{
    /**
     * 查询中奖交易记录
     *
     * @param time 中奖交易记录主键
     * @return 中奖交易记录
     */
    public WinTransactions selectWinTransactionsByTime(Long time);

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
     * @param times 需要删除的中奖交易记录主键集合
     * @return 结果
     */
    public int deleteWinTransactionsByTimes(Long[] times);

    /**
     * 删除中奖交易记录信息
     *
     * @param time 中奖交易记录主键
     * @return 结果
     */
    public int deleteWinTransactionsByTime(Long time);

    /**
     * 抽奖
     * @return 结果
     */
    public String lottery();
}
