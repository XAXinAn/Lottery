package com.ruoyi.lottery.mapper;

import java.util.List;

import com.ruoyi.lottery.domain.Prizes;
import com.ruoyi.lottery.domain.Transactions;
import com.ruoyi.lottery.domain.WinTransactions;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 中奖交易记录Mapper接口
 *
 * @author ruoyi
 * @date 2025-07-28
 */
@Mapper
public interface WinTransactionsMapper
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
     * 删除中奖交易记录
     *
     * @param time 中奖交易记录主键
     * @return 结果
     */
    public int deleteWinTransactionsByTime(Long time);

    /**
     * 批量删除中奖交易记录
     *
     * @param times 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteWinTransactionsByTimes(Long[] times);

    /**
     * 获取最大时间
     *
     * @return 最大时间
     */
    public Long getMaxTime();

    public boolean existsCust(String custIsn);

    public boolean existsOrgNo(String orgNo);

    public boolean existsOrgNoWithTime(@Param("transactions")Transactions transactions, @Param("time")Long time);
}
