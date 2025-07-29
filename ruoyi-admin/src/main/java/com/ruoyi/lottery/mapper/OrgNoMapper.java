package com.ruoyi.lottery.mapper;

import java.util.List;
import com.ruoyi.lottery.domain.OrgNo;
import org.apache.ibatis.annotations.Mapper;

/**
 * 网点号Mapper接口
 *
 * @author ruoyi
 * @date 2025-07-29
 */
@Mapper
public interface OrgNoMapper
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
     * 删除网点号
     *
     * @param orgNo 网点号主键
     * @return 结果
     */
    public int deleteOrgNoByOrgNo(String orgNo);

    /**
     * 批量删除网点号
     *
     * @param orgNos 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteOrgNoByOrgNos(String[] orgNos);
}
