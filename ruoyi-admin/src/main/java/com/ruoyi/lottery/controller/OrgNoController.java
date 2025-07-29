package com.ruoyi.lottery.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.lottery.domain.OrgNo;
import com.ruoyi.lottery.service.IOrgNoService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 网点号Controller
 * 
 * @author ruoyi
 * @date 2025-07-29
 */
@RestController
@RequestMapping("/lottery/orgNo")
public class OrgNoController extends BaseController
{
    @Autowired
    private IOrgNoService orgNoService;

    /**
     * 查询网点号列表
     */
    @PreAuthorize("@ss.hasPermi('lottery:orgNo:list')")
    @GetMapping("/list")
    public TableDataInfo list(OrgNo orgNo)
    {
        startPage();
        List<OrgNo> list = orgNoService.selectOrgNoList(orgNo);
        return getDataTable(list);
    }

    /**
     * 导出网点号列表
     */
    @PreAuthorize("@ss.hasPermi('lottery:orgNo:export')")
    @Log(title = "网点号", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, OrgNo orgNo)
    {
        List<OrgNo> list = orgNoService.selectOrgNoList(orgNo);
        ExcelUtil<OrgNo> util = new ExcelUtil<OrgNo>(OrgNo.class);
        util.exportExcel(response, list, "网点号数据");
    }

    /**
     * 获取网点号详细信息
     */
    @PreAuthorize("@ss.hasPermi('lottery:orgNo:query')")
    @GetMapping(value = "/{orgNo}")
    public AjaxResult getInfo(@PathVariable("orgNo") String orgNo)
    {
        return success(orgNoService.selectOrgNoByOrgNo(orgNo));
    }

    /**
     * 新增网点号
     */
    @PreAuthorize("@ss.hasPermi('lottery:orgNo:add')")
    @Log(title = "网点号", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody OrgNo orgNo)
    {
        return toAjax(orgNoService.insertOrgNo(orgNo));
    }

    /**
     * 修改网点号
     */
    @PreAuthorize("@ss.hasPermi('lottery:orgNo:edit')")
    @Log(title = "网点号", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody OrgNo orgNo)
    {
        return toAjax(orgNoService.updateOrgNo(orgNo));
    }

    /**
     * 删除网点号
     */
    @PreAuthorize("@ss.hasPermi('lottery:orgNo:remove')")
    @Log(title = "网点号", businessType = BusinessType.DELETE)
	@DeleteMapping("/{orgNos}")
    public AjaxResult remove(@PathVariable String[] orgNos)
    {
        return toAjax(orgNoService.deleteOrgNoByOrgNos(orgNos));
    }
}
