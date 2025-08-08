package com.ruoyi.lottery.service;

import java.util.List;
import com.ruoyi.lottery.domain.Transactions;

/**
 * 交易记录表Service接口
 * 
 * @author ruoyi
 * @date 2025-08-08
 */
public interface ITransactionsService 
{
    /**
     * 查询交易记录表
     * 
     * @param id 交易记录表主键
     * @return 交易记录表
     */
    public Transactions selectTransactionsById(Long id);

    /**
     * 查询交易记录表列表
     * 
     * @param transactions 交易记录表
     * @return 交易记录表集合
     */
    public List<Transactions> selectTransactionsList(Transactions transactions);

    /**
     * 新增交易记录表
     * 
     * @param transactions 交易记录表
     * @return 结果
     */
    public int insertTransactions(Transactions transactions);

    /**
     * 修改交易记录表
     * 
     * @param transactions 交易记录表
     * @return 结果
     */
    public int updateTransactions(Transactions transactions);

    /**
     * 批量删除交易记录表
     * 
     * @param ids 需要删除的交易记录表主键集合
     * @return 结果
     */
    public int deleteTransactionsByIds(Long[] ids);

    /**
     * 删除交易记录表信息
     * 
     * @param id 交易记录表主键
     * @return 结果
     */
    public int deleteTransactionsById(Long id);
}
