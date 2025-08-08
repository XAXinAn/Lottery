package com.ruoyi.lottery.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 交易记录表对象 transactions
 * 
 * @author ruoyi
 * @date 2025-08-08
 */
public class Transactions extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 交易记录id */
    private Long id;

    /** 信用卡账号 */
    @Excel(name = "信用卡账号")
    private Long acctnbr;

    /** 交易日期 */
    @Excel(name = "交易日期")
    private Long inpDate;

    /** 交易时间 */
    @Excel(name = "交易时间")
    private Long inpTime;

    /** 交易序号 */
    @Excel(name = "交易序号")
    private Long xtranno;

    /** 交易金额 */
    @Excel(name = "交易金额")
    private BigDecimal billAmt;

    /** 支行号 */
    @Excel(name = "支行号")
    private String org1Code;

    /** 网点号 */
    @Excel(name = "网点号")
    private String orgNo;

    /** 客户内码 */
    @Excel(name = "客户内码")
    private String custIsn;

    /** 卡片状态 */
    @Excel(name = "卡片状态")
    private String cardStatusTxt;

    /** 客户姓名 */
    @Excel(name = "客户姓名")
    private String custName;

    /** 身份证号码 */
    @Excel(name = "身份证号码")
    private String certNo;

    /** 信用卡卡号 */
    @Excel(name = "信用卡卡号")
    private String cardNo;

    /** 机构名称 */
    @Excel(name = "机构名称")
    private String orgName;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setAcctnbr(Long acctnbr) 
    {
        this.acctnbr = acctnbr;
    }

    public Long getAcctnbr() 
    {
        return acctnbr;
    }

    public void setInpDate(Long inpDate) 
    {
        this.inpDate = inpDate;
    }

    public Long getInpDate() 
    {
        return inpDate;
    }

    public void setInpTime(Long inpTime) 
    {
        this.inpTime = inpTime;
    }

    public Long getInpTime() 
    {
        return inpTime;
    }

    public void setXtranno(Long xtranno) 
    {
        this.xtranno = xtranno;
    }

    public Long getXtranno() 
    {
        return xtranno;
    }

    public void setBillAmt(BigDecimal billAmt) 
    {
        this.billAmt = billAmt;
    }

    public BigDecimal getBillAmt() 
    {
        return billAmt;
    }

    public void setOrg1Code(String org1Code) 
    {
        this.org1Code = org1Code;
    }

    public String getOrg1Code() 
    {
        return org1Code;
    }

    public void setOrgNo(String orgNo) 
    {
        this.orgNo = orgNo;
    }

    public String getOrgNo() 
    {
        return orgNo;
    }

    public void setCustIsn(String custIsn) 
    {
        this.custIsn = custIsn;
    }

    public String getCustIsn() 
    {
        return custIsn;
    }

    public void setCardStatusTxt(String cardStatusTxt) 
    {
        this.cardStatusTxt = cardStatusTxt;
    }

    public String getCardStatusTxt() 
    {
        return cardStatusTxt;
    }

    public void setCustName(String custName) 
    {
        this.custName = custName;
    }

    public String getCustName() 
    {
        return custName;
    }

    public void setCertNo(String certNo) 
    {
        this.certNo = certNo;
    }

    public String getCertNo() 
    {
        return certNo;
    }

    public void setCardNo(String cardNo) 
    {
        this.cardNo = cardNo;
    }

    public String getCardNo() 
    {
        return cardNo;
    }

    public void setOrgName(String orgName) 
    {
        this.orgName = orgName;
    }

    public String getOrgName() 
    {
        return orgName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("acctnbr", getAcctnbr())
            .append("inpDate", getInpDate())
            .append("inpTime", getInpTime())
            .append("xtranno", getXtranno())
            .append("billAmt", getBillAmt())
            .append("org1Code", getOrg1Code())
            .append("orgNo", getOrgNo())
            .append("custIsn", getCustIsn())
            .append("cardStatusTxt", getCardStatusTxt())
            .append("custName", getCustName())
            .append("certNo", getCertNo())
            .append("cardNo", getCardNo())
            .append("orgName", getOrgName())
            .toString();
    }
}
