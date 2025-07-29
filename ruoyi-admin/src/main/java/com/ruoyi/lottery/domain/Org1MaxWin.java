package com.ruoyi.lottery.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 支行最高奖状态对象 org1_max_win
 * 
 * @author ruoyi
 * @date 2025-07-29
 */
public class Org1MaxWin extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 支行号 */
    @Excel(name = "支行号")
    private String org1Code;

    /** 状态码 */
    @Excel(name = "状态码")
    private Long status;

    public void setOrg1Code(String org1Code) 
    {
        this.org1Code = org1Code;
    }

    public String getOrg1Code() 
    {
        return org1Code;
    }

    public void setStatus(Long status) 
    {
        this.status = status;
    }

    public Long getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("org1Code", getOrg1Code())
            .append("status", getStatus())
            .toString();
    }
}
