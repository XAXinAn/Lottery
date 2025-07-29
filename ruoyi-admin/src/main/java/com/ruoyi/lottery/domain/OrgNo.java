package com.ruoyi.lottery.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 网点号对象 org_no
 * 
 * @author ruoyi
 * @date 2025-07-29
 */
public class OrgNo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 网点号 */
    @Excel(name = "网点号")
    private String orgNo;

    public void setOrgNo(String orgNo) 
    {
        this.orgNo = orgNo;
    }

    public String getOrgNo() 
    {
        return orgNo;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("orgNo", getOrgNo())
            .toString();
    }
}
