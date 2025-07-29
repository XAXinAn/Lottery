package com.ruoyi.lottery.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.lottery.mapper.OrgNoMapper;
import com.ruoyi.lottery.domain.OrgNo;
import com.ruoyi.lottery.service.IOrgNoService;

/**
 * 网点号Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-07-29
 */
@Service
public class OrgNoServiceImpl implements IOrgNoService 
{
    @Autowired
    private OrgNoMapper orgNoMapper;

    /**
     * 查询网点号
     * 
     * @param orgNo 网点号主键
     * @return 网点号
     */
    @Override
    public OrgNo selectOrgNoByOrgNo(String orgNo)
    {
        return orgNoMapper.selectOrgNoByOrgNo(orgNo);
    }

    /**
     * 查询网点号列表
     * 
     * @param orgNo 网点号
     * @return 网点号
     */
    @Override
    public List<OrgNo> selectOrgNoList(OrgNo orgNo)
    {
        return orgNoMapper.selectOrgNoList(orgNo);
    }

    /**
     * 新增网点号
     * 
     * @param orgNo 网点号
     * @return 结果
     */
    @Override
    public int insertOrgNo(OrgNo orgNo)
    {
        return orgNoMapper.insertOrgNo(orgNo);
    }

    /**
     * 修改网点号
     * 
     * @param orgNo 网点号
     * @return 结果
     */
    @Override
    public int updateOrgNo(OrgNo orgNo)
    {
        return orgNoMapper.updateOrgNo(orgNo);
    }

    /**
     * 批量删除网点号
     * 
     * @param orgNos 需要删除的网点号主键
     * @return 结果
     */
    @Override
    public int deleteOrgNoByOrgNos(String[] orgNos)
    {
        return orgNoMapper.deleteOrgNoByOrgNos(orgNos);
    }

    /**
     * 删除网点号信息
     * 
     * @param orgNo 网点号主键
     * @return 结果
     */
    @Override
    public int deleteOrgNoByOrgNo(String orgNo)
    {
        return orgNoMapper.deleteOrgNoByOrgNo(orgNo);
    }
}
