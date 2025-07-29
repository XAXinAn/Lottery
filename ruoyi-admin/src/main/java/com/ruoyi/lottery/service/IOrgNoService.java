package com.ruoyi.lottery.service;

import java.util.List;
import com.ruoyi.lottery.domain.OrgNo;

/**
 * 网点号Service接口
 * 
 * @author ruoyi
 * @date 2025-07-29
 */
public interface IOrgNoService 
{
    /**
     * 查询网点号
     * 
     * @param orgNo 网点号主键
     * @return 网点号
     */
    public OrgNo selectOrgNoByOrgNo(String orgNo);

    /**
     * 查询网点号列表
     * 
     * @param orgNo 网点号
     * @return 网点号集合
     */
    public List<OrgNo> selectOrgNoList(OrgNo orgNo);

    /**
     * 新增网点号
     * 
     * @param orgNo 网点号
     * @return 结果
     */
    public int insertOrgNo(OrgNo orgNo);

    /**
     * 修改网点号
     * 
     * @param orgNo 网点号
     * @return 结果
     */
    public int updateOrgNo(OrgNo orgNo);

    /**
     * 批量删除网点号
     * 
     * @param orgNos 需要删除的网点号主键集合
     * @return 结果
     */
    public int deleteOrgNoByOrgNos(String[] orgNos);

    /**
     * 删除网点号信息
     * 
     * @param orgNo 网点号主键
     * @return 结果
     */
    public int deleteOrgNoByOrgNo(String orgNo);
}
