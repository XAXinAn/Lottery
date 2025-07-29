package com.ruoyi.lottery.mapper;

import java.util.List;
import com.ruoyi.lottery.domain.Org1MaxWin;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支行最高奖状态Mapper接口
 *
 * @author ruoyi
 * @date 2025-07-29
 */
@Mapper
public interface Org1MaxWinMapper
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
     * 删除支行最高奖状态
     *
     * @param org1Code 支行最高奖状态主键
     * @return 结果
     */
    public int deleteOrg1MaxWinByOrg1Code(String org1Code);

    /**
     * 批量删除支行最高奖状态
     *
     * @param org1Codes 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteOrg1MaxWinByOrg1Codes(String[] org1Codes);

    public void updateOrg1MaxWinStatusTo1(String org1Code);
    public void updateOrg1MaxWinStatusTo0(String org1Code);

    public int getOrg1Status(String org1Code);
}
