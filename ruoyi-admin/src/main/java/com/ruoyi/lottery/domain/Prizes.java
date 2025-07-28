package com.ruoyi.lottery.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 中奖区间信息对象 prizes
 * 
 * @author ruoyi
 * @date 2025-07-28
 */
public class Prizes extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 最大金额 */
    @Excel(name = "最大金额")
    private BigDecimal maxAmount;

    /** 最小金额 */
    @Excel(name = "最小金额")
    private BigDecimal minAmount;

    /** 名额 */
    @Excel(name = "名额")
    private Long num;

    /** 预算 */
    @Excel(name = "预算")
    private BigDecimal budget;

    public void setMaxAmount(BigDecimal maxAmount) 
    {
        this.maxAmount = maxAmount;
    }

    public BigDecimal getMaxAmount() 
    {
        return maxAmount;
    }

    public void setMinAmount(BigDecimal minAmount) 
    {
        this.minAmount = minAmount;
    }

    public BigDecimal getMinAmount() 
    {
        return minAmount;
    }

    public void setNum(Long num) 
    {
        this.num = num;
    }

    public Long getNum() 
    {
        return num;
    }

    public void setBudget(BigDecimal budget) 
    {
        this.budget = budget;
    }

    public BigDecimal getBudget() 
    {
        return budget;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("maxAmount", getMaxAmount())
            .append("minAmount", getMinAmount())
            .append("num", getNum())
            .append("budget", getBudget())
            .toString();
    }
}
