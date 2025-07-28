package com.ruoyi.lottery.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.lottery.mapper.TransactionsMapper;
import com.ruoyi.lottery.domain.Transactions;
import com.ruoyi.lottery.service.ITransactionsService;

/**
 * 交易记录Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-07-28
 */
@Service
public class TransactionsServiceImpl implements ITransactionsService 
{
    @Autowired
    private TransactionsMapper transactionsMapper;

    /**
     * 查询交易记录
     * 
     * @param acctnbr 交易记录主键
     * @return 交易记录
     */
    @Override
    public Transactions selectTransactionsByAcctnbr(Long acctnbr)
    {
        return transactionsMapper.selectTransactionsByAcctnbr(acctnbr);
    }

    /**
     * 查询交易记录列表
     * 
     * @param transactions 交易记录
     * @return 交易记录
     */
    @Override
    public List<Transactions> selectTransactionsList(Transactions transactions)
    {
        return transactionsMapper.selectTransactionsList(transactions);
    }

    /**
     * 新增交易记录
     * 
     * @param transactions 交易记录
     * @return 结果
     */
    @Override
    public int insertTransactions(Transactions transactions)
    {
        return transactionsMapper.insertTransactions(transactions);
    }

    /**
     * 修改交易记录
     * 
     * @param transactions 交易记录
     * @return 结果
     */
    @Override
    public int updateTransactions(Transactions transactions)
    {
        return transactionsMapper.updateTransactions(transactions);
    }

    /**
     * 批量删除交易记录
     * 
     * @param acctnbrs 需要删除的交易记录主键
     * @return 结果
     */
    @Override
    public int deleteTransactionsByAcctnbrs(Long[] acctnbrs)
    {
        return transactionsMapper.deleteTransactionsByAcctnbrs(acctnbrs);
    }

    /**
     * 删除交易记录信息
     * 
     * @param acctnbr 交易记录主键
     * @return 结果
     */
    @Override
    public int deleteTransactionsByAcctnbr(Long acctnbr)
    {
        return transactionsMapper.deleteTransactionsByAcctnbr(acctnbr);
    }
}
