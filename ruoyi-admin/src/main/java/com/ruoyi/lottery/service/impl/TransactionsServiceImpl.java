package com.ruoyi.lottery.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.lottery.mapper.TransactionsMapper;
import com.ruoyi.lottery.domain.Transactions;
import com.ruoyi.lottery.service.ITransactionsService;

/**
 * 交易记录表Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-08-08
 */
@Service
public class TransactionsServiceImpl implements ITransactionsService 
{
    @Autowired
    private TransactionsMapper transactionsMapper;

    /**
     * 查询交易记录表
     * 
     * @param id 交易记录表主键
     * @return 交易记录表
     */
    @Override
    public Transactions selectTransactionsById(Long id)
    {
        return transactionsMapper.selectTransactionsById(id);
    }

    /**
     * 查询交易记录表列表
     * 
     * @param transactions 交易记录表
     * @return 交易记录表
     */
    @Override
    public List<Transactions> selectTransactionsList(Transactions transactions)
    {
        return transactionsMapper.selectTransactionsList(transactions);
    }

    /**
     * 新增交易记录表
     * 
     * @param transactions 交易记录表
     * @return 结果
     */
    @Override
    public int insertTransactions(Transactions transactions)
    {
        return transactionsMapper.insertTransactions(transactions);
    }

    /**
     * 修改交易记录表
     * 
     * @param transactions 交易记录表
     * @return 结果
     */
    @Override
    public int updateTransactions(Transactions transactions)
    {
        return transactionsMapper.updateTransactions(transactions);
    }

    /**
     * 批量删除交易记录表
     * 
     * @param ids 需要删除的交易记录表主键
     * @return 结果
     */
    @Override
    public int deleteTransactionsByIds(Long[] ids)
    {
        return transactionsMapper.deleteTransactionsByIds(ids);
    }

    /**
     * 删除交易记录表信息
     * 
     * @param id 交易记录表主键
     * @return 结果
     */
    @Override
    public int deleteTransactionsById(Long id)
    {
        return transactionsMapper.deleteTransactionsById(id);
    }
}
