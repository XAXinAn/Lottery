package com.ruoyi.lottery.mapper;

import java.util.List;
import com.ruoyi.lottery.domain.Prizes;
import org.apache.ibatis.annotations.Mapper;

/**
 * 中奖区间信息Mapper接口
 * 
 * @author ruoyi
 * @date 2025-08-08
 */
@Mapper
public interface PrizesMapper 
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
     * 删除中奖区间信息
     * 
     * @param id 中奖区间信息主键
     * @return 结果
     */
    public int deletePrizesById(Long id);

    /**
     * 批量删除中奖区间信息
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePrizesByIds(Long[] ids);
}
