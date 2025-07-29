package com.ruoyi.lottery.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.lottery.mapper.Org1MaxWinMapper;
import com.ruoyi.lottery.domain.Org1MaxWin;
import com.ruoyi.lottery.service.IOrg1MaxWinService;

/**
 * 支行最高奖状态Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-07-29
 */
@Service
public class Org1MaxWinServiceImpl implements IOrg1MaxWinService 
{
    @Autowired
    private Org1MaxWinMapper org1MaxWinMapper;

    /**
     * 查询支行最高奖状态
     * 
     * @param org1Code 支行最高奖状态主键
     * @return 支行最高奖状态
     */
    @Override
    public Org1MaxWin selectOrg1MaxWinByOrg1Code(String org1Code)
    {
        return org1MaxWinMapper.selectOrg1MaxWinByOrg1Code(org1Code);
    }

    /**
     * 查询支行最高奖状态列表
     * 
     * @param org1MaxWin 支行最高奖状态
     * @return 支行最高奖状态
     */
    @Override
    public List<Org1MaxWin> selectOrg1MaxWinList(Org1MaxWin org1MaxWin)
    {
        return org1MaxWinMapper.selectOrg1MaxWinList(org1MaxWin);
    }

    /**
     * 新增支行最高奖状态
     * 
     * @param org1MaxWin 支行最高奖状态
     * @return 结果
     */
    @Override
    public int insertOrg1MaxWin(Org1MaxWin org1MaxWin)
    {
        return org1MaxWinMapper.insertOrg1MaxWin(org1MaxWin);
    }

    /**
     * 修改支行最高奖状态
     * 
     * @param org1MaxWin 支行最高奖状态
     * @return 结果
     */
    @Override
    public int updateOrg1MaxWin(Org1MaxWin org1MaxWin)
    {
        return org1MaxWinMapper.updateOrg1MaxWin(org1MaxWin);
    }

    /**
     * 批量删除支行最高奖状态
     * 
     * @param org1Codes 需要删除的支行最高奖状态主键
     * @return 结果
     */
    @Override
    public int deleteOrg1MaxWinByOrg1Codes(String[] org1Codes)
    {
        return org1MaxWinMapper.deleteOrg1MaxWinByOrg1Codes(org1Codes);
    }

    /**
     * 删除支行最高奖状态信息
     * 
     * @param org1Code 支行最高奖状态主键
     * @return 结果
     */
    @Override
    public int deleteOrg1MaxWinByOrg1Code(String org1Code)
    {
        return org1MaxWinMapper.deleteOrg1MaxWinByOrg1Code(org1Code);
    }
}
