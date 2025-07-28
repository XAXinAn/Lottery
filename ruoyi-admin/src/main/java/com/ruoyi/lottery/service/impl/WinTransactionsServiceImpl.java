package com.ruoyi.lottery.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.lottery.mapper.WinTransactionsMapper;
import com.ruoyi.lottery.domain.WinTransactions;
import com.ruoyi.lottery.service.IWinTransactionsService;

/**
 * 中奖交易记录Service业务层处理
 *
 * @author ruoyi
 * @date 2025-07-28
 */
@Service
public class WinTransactionsServiceImpl implements IWinTransactionsService
{
    @Autowired
    private WinTransactionsMapper winTransactionsMapper;

    /**
     * 查询中奖交易记录
     *
     * @param time 中奖交易记录主键
     * @return 中奖交易记录
     */
    @Override
    public WinTransactions selectWinTransactionsByTime(Long time)
    {
        return winTransactionsMapper.selectWinTransactionsByTime(time);
    }

    /**
     * 查询中奖交易记录列表
     *
     * @param winTransactions 中奖交易记录
     * @return 中奖交易记录
     */
    @Override
    public List<WinTransactions> selectWinTransactionsList(WinTransactions winTransactions)
    {
        return winTransactionsMapper.selectWinTransactionsList(winTransactions);
    }

    /**
     * 新增中奖交易记录
     *
     * @param winTransactions 中奖交易记录
     * @return 结果
     */
    @Override
    public int insertWinTransactions(WinTransactions winTransactions)
    {
        return winTransactionsMapper.insertWinTransactions(winTransactions);
    }

    /**
     * 修改中奖交易记录
     *
     * @param winTransactions 中奖交易记录
     * @return 结果
     */
    @Override
    public int updateWinTransactions(WinTransactions winTransactions)
    {
        return winTransactionsMapper.updateWinTransactions(winTransactions);
    }

    /**
     * 批量删除中奖交易记录
     *
     * @param times 需要删除的中奖交易记录主键
     * @return 结果
     */
    @Override
    public int deleteWinTransactionsByTimes(Long[] times)
    {
        return winTransactionsMapper.deleteWinTransactionsByTimes(times);
    }

    /**
     * 删除中奖交易记录信息
     *
     * @param time 中奖交易记录主键
     * @return 结果
     */
    @Override
    public int deleteWinTransactionsByTime(Long time)
    {
        return winTransactionsMapper.deleteWinTransactionsByTime(time);
    }

    @Override
    public String lottery() {

        return null;
    }
}
