package com.ruoyi.lottery.service;

import java.util.List;
import com.ruoyi.lottery.domain.Org1MaxWin;

/**
 * 支行最高奖状态Service接口
 * 
 * @author ruoyi
 * @date 2025-07-29
 */
public interface IOrg1MaxWinService 
{
    /**
     * 查询支行最高奖状态
     * 
     * @param org1Code 支行最高奖状态主键
     * @return 支行最高奖状态
     */
    public Org1MaxWin selectOrg1MaxWinByOrg1Code(String org1Code);

    /**
     * 查询支行最高奖状态列表
     * 
     * @param org1MaxWin 支行最高奖状态
     * @return 支行最高奖状态集合
     */
    public List<Org1MaxWin> selectOrg1MaxWinList(Org1MaxWin org1MaxWin);

    /**
     * 新增支行最高奖状态
     * 
     * @param org1MaxWin 支行最高奖状态
     * @return 结果
     */
    public int insertOrg1MaxWin(Org1MaxWin org1MaxWin);

    /**
     * 修改支行最高奖状态
     * 
     * @param org1MaxWin 支行最高奖状态
     * @return 结果
     */
    public int updateOrg1MaxWin(Org1MaxWin org1MaxWin);

    /**
     * 批量删除支行最高奖状态
     * 
     * @param org1Codes 需要删除的支行最高奖状态主键集合
     * @return 结果
     */
    public int deleteOrg1MaxWinByOrg1Codes(String[] org1Codes);

    /**
     * 删除支行最高奖状态信息
     * 
     * @param org1Code 支行最高奖状态主键
     * @return 结果
     */
    public int deleteOrg1MaxWinByOrg1Code(String org1Code);
}
