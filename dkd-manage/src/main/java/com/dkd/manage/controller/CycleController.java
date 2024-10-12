package com.dkd.manage.controller;

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
import com.dkd.common.annotation.Log;
import com.dkd.common.core.controller.BaseController;
import com.dkd.common.core.domain.AjaxResult;
import com.dkd.common.enums.BusinessType;
import com.dkd.manage.domain.Cycle;
import com.dkd.manage.service.ICycleService;
import com.dkd.common.utils.poi.ExcelUtil;
import com.dkd.common.core.page.TableDataInfo;

/**
 * 废品管理Controller
 * 
 * @author jane
 * @date 2024-10-11
 */
@RestController
@RequestMapping("/manage/cycle")
public class CycleController extends BaseController
{
    @Autowired
    private ICycleService cycleService;

    /**
     * 查询废品管理列表
     */
    @PreAuthorize("@ss.hasPermi('manage:cycle:list')")
    @GetMapping("/list")
    public TableDataInfo list(Cycle cycle)
    {
        startPage();
        List<Cycle> list = cycleService.selectCycleList(cycle);
        return getDataTable(list);
    }

    /**
     * 导出废品管理列表
     */
    @PreAuthorize("@ss.hasPermi('manage:cycle:export')")
    @Log(title = "废品管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Cycle cycle)
    {
        List<Cycle> list = cycleService.selectCycleList(cycle);
        ExcelUtil<Cycle> util = new ExcelUtil<Cycle>(Cycle.class);
        util.exportExcel(response, list, "废品管理数据");
    }

    /**
     * 获取废品管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('manage:cycle:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(cycleService.selectCycleById(id));
    }

    /**
     * 新增废品管理
     */
    @PreAuthorize("@ss.hasPermi('manage:cycle:add')")
    @Log(title = "废品管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Cycle cycle)
    {
        return toAjax(cycleService.insertCycle(cycle));
    }

    /**
     * 修改废品管理
     */
    @PreAuthorize("@ss.hasPermi('manage:cycle:edit')")
    @Log(title = "废品管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Cycle cycle)
    {
        return toAjax(cycleService.updateCycle(cycle));
    }

    /**
     * 删除废品管理
     */
    @PreAuthorize("@ss.hasPermi('manage:cycle:remove')")
    @Log(title = "废品管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(cycleService.deleteCycleByIds(ids));
    }
}
