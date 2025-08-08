package com.ruoyi.lottery.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.lottery.mapper.PrizesMapper;
import com.ruoyi.lottery.domain.Prizes;
import com.ruoyi.lottery.service.IPrizesService;

/**
 * 中奖区间信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-08-08
 */
@Service
public class PrizesServiceImpl implements IPrizesService 
{
    @Autowired
    private PrizesMapper prizesMapper;

    /**
     * 查询中奖区间信息
     * 
     * @param id 中奖区间信息主键
     * @return 中奖区间信息
     */
    @Override
    public Prizes selectPrizesById(Long id)
    {
        return prizesMapper.selectPrizesById(id);
    }

    /**
     * 查询中奖区间信息列表
     * 
     * @param prizes 中奖区间信息
     * @return 中奖区间信息
     */
    @Override
    public List<Prizes> selectPrizesList(Prizes prizes)
    {
        return prizesMapper.selectPrizesList(prizes);
    }

    /**
     * 新增中奖区间信息
     * 
     * @param prizes 中奖区间信息
     * @return 结果
     */
    @Override
    public int insertPrizes(Prizes prizes)
    {
        return prizesMapper.insertPrizes(prizes);
    }

    /**
     * 修改中奖区间信息
     * 
     * @param prizes 中奖区间信息
     * @return 结果
     */
    @Override
    public int updatePrizes(Prizes prizes)
    {
        return prizesMapper.updatePrizes(prizes);
    }

    /**
     * 批量删除中奖区间信息
     * 
     * @param ids 需要删除的中奖区间信息主键
     * @return 结果
     */
    @Override
    public int deletePrizesByIds(Long[] ids)
    {
        return prizesMapper.deletePrizesByIds(ids);
    }

    /**
     * 删除中奖区间信息信息
     * 
     * @param id 中奖区间信息主键
     * @return 结果
     */
    @Override
    public int deletePrizesById(Long id)
    {
        return prizesMapper.deletePrizesById(id);
    }
}
