package com.ruoyi.lottery.service;

import java.util.List;
import com.ruoyi.lottery.domain.Prizes;

/**
 * 中奖区间信息Service接口
 * 
 * @author ruoyi
 * @date 2025-08-08
 */
public interface IPrizesService 
{
    /**
     * 查询中奖区间信息
     * 
     * @param id 中奖区间信息主键
     * @return 中奖区间信息
     */
    public Prizes selectPrizesById(Long id);

    /**
     * 查询中奖区间信息列表
     * 
     * @param prizes 中奖区间信息
     * @return 中奖区间信息集合
     */
    public List<Prizes> selectPrizesList(Prizes prizes);

    /**
     * 新增中奖区间信息
     * 
     * @param prizes 中奖区间信息
     * @return 结果
     */
    public int insertPrizes(Prizes prizes);

    /**
     * 修改中奖区间信息
     * 
     * @param prizes 中奖区间信息
     * @return 结果
     */
    public int updatePrizes(Prizes prizes);

    /**
     * 批量删除中奖区间信息
     * 
     * @param ids 需要删除的中奖区间信息主键集合
     * @return 结果
     */
    public int deletePrizesByIds(Long[] ids);

    /**
     * 删除中奖区间信息信息
     * 
     * @param id 中奖区间信息主键
     * @return 结果
     */
    public int deletePrizesById(Long id);
}
