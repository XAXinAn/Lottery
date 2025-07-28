package com.ruoyi.lottery.service;

import java.util.List;
import com.ruoyi.lottery.domain.Transactions;

/**
 * 交易记录Service接口
 * 
 * @author ruoyi
 * @date 2025-07-28
 */
public interface ITransactionsService 
{
    /**
     * 查询交易记录
     * 
     * @param acctnbr 交易记录主键
     * @return 交易记录
     */
    public Transactions selectTransactionsByAcctnbr(Long acctnbr);

    /**
     * 查询交易记录列表
     * 
     * @param transactions 交易记录
     * @return 交易记录集合
     */
    public List<Transactions> selectTransactionsList(Transactions transactions);

    /**
     * 新增交易记录
     * 
     * @param transactions 交易记录
     * @return 结果
     */
    public int insertTransactions(Transactions transactions);

    /**
     * 修改交易记录
     * 
     * @param transactions 交易记录
     * @return 结果
     */
    public int updateTransactions(Transactions transactions);

    /**
     * 批量删除交易记录
     * 
     * @param acctnbrs 需要删除的交易记录主键集合
     * @return 结果
     */
    public int deleteTransactionsByAcctnbrs(Long[] acctnbrs);

    /**
     * 删除交易记录信息
     * 
     * @param acctnbr 交易记录主键
     * @return 结果
     */
    public int deleteTransactionsByAcctnbr(Long acctnbr);
}
