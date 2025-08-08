package com.ruoyi.lottery.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.ruoyi.lottery.domain.Prizes;
import com.ruoyi.lottery.domain.Transactions;
import com.ruoyi.lottery.mapper.PrizesMapper;
import com.ruoyi.lottery.mapper.TransactionsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.lottery.mapper.WinTransactionsMapper;
import com.ruoyi.lottery.domain.WinTransactions;
import com.ruoyi.lottery.service.IWinTransactionsService;

/**
 * 中奖交易记录Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-08-08
 */
@Service
public class WinTransactionsServiceImpl implements IWinTransactionsService 
{    @Autowired
    private WinTransactionsMapper winTransactionsMapper;

    @Autowired
    private PrizesMapper prizesMapper;

    @Autowired
    private TransactionsMapper transactionsMapper;
    /**
     * 查询中奖交易记录
     * 
     * @param id 中奖交易记录主键
     * @return 中奖交易记录
     */
    @Override
    public WinTransactions selectWinTransactionsById(Long id)
    {
        return winTransactionsMapper.selectWinTransactionsById(id);
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
     * @param ids 需要删除的中奖交易记录主键
     * @return 结果
     */
    @Override
    public int deleteWinTransactionsByIds(Long[] ids)
    {
        return winTransactionsMapper.deleteWinTransactionsByIds(ids);
    }

    /**
     * 删除中奖交易记录信息
     * 
     * @param id 中奖交易记录主键
     * @return 结果
     */
    @Override
    public int deleteWinTransactionsById(Long id)
    {
        return winTransactionsMapper.deleteWinTransactionsById(id);
    }


    /**
     * 进行抽奖操作
     *
     * @return 抽奖结果
     */
    @Override
    public List<Transactions> lottery() {
        //获得prizes列表
        List<Prizes> prizesList = prizesMapper.selectPrizesList(new Prizes());
        Long time = winTransactionsMapper.getMaxTime() + 1;
        double sum = 0.0;
        List<Transactions> result = new ArrayList<>();
        List<Transactions> finalResult = new ArrayList<>();
        List<WinTransactions> finalWinResult = new ArrayList<>();
        result.clear();
        for (Prizes prize : prizesList) {
            List<BigDecimal> billAmounts = new ArrayList<>();
            List<Transactions> temp = new ArrayList<>();
            //取出金额区间内的交易记录
            List<Transactions> transactionsList = transactionsMapper.selectTransactionsByAmountRange(prize);
            Transactions maxBillAmountTransaction = null;
            long looptime = 0;
            //随机打乱交易记录
            do {
                looptime++;
                temp.clear();
                result.clear();
                billAmounts.clear();
                List<Transactions> shuffledList = new ArrayList<>(transactionsList);
                Collections.shuffle(shuffledList);
                int cnt = 0;
                Transactions transaction = null;
                for (int i = 0; i < transactionsList.size() && cnt < prize.getNum(); i++) {
                    transaction = shuffledList.get(i);
                    //判断本次中奖记录的客户内码和网点号是否存在于当前存储的List
                    boolean exists = false;
                    for (Transactions t : temp) {
                        if (t.getCustIsn().equals(transaction.getCustIsn())) {
                            exists = true;
                            break;
                        }
                    }
                    //判断是否符合中奖 客户内码不存在于所有中奖纪录 网点号不存在于本轮已记录的中奖记录 网点号不存在于本循环抽出的中奖信息中
                    if (!winTransactionsMapper.existsCust(transaction.getCustIsn()) && !exists && transaction.getCardStatusTxt().equals("正常")) {
                        temp.add(transaction);
                        billAmounts.add(transaction.getBillAmt());
                        cnt++;
                    }
                }
            } while (sum < prize.getBudget().doubleValue() * (0.95 - looptime * 0.01) || sum >= prize.getBudget().doubleValue() * (1 + looptime * 0.01));
            result.addAll(temp);
            finalResult.addAll(temp);
            for (Transactions transaction : result) {
                winTransactionsMapper.insertWinTransactions(new WinTransactions(time,transaction.getAcctnbr(),transaction.getInpTime(),transaction.getInpDate(),transaction.getXtranno(),transaction.getBillAmt(),transaction.getOrg1Code(),transaction.getOrgNo(),transaction.getCustIsn(),transaction.getCardStatusTxt(),transaction.getCustName(),transaction.getCertNo(),transaction.getCardNo(),transaction.getOrgName()));
            }
        }
        finalResult.sort(Comparator.comparing(Transactions::getBillAmt).reversed());
        return finalResult;
    }

    /**
     * 将账单金额列表相加输出总金额
     *
     * @param billAmts 账单金额列表，每个金额以BigDecimal类型表示
     */
    public double getBillAmtsSum(List<BigDecimal> billAmts) {
        if (billAmts == null || billAmts.isEmpty()) {
            return 0.0; // 如果列表为空或null，返回0.0
        }

        BigDecimal sum = BigDecimal.ZERO; // 初始化总和为0
        for (BigDecimal amount : billAmts) {
            sum = sum.add(amount); // 将每个金额加到总和中
        }

        return sum.doubleValue(); // 返回总和的double值
    }
}
