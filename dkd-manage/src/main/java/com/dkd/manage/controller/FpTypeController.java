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
import com.dkd.manage.domain.FpType;
import com.dkd.manage.service.IFpTypeService;
import com.dkd.common.utils.poi.ExcelUtil;
import com.dkd.common.core.page.TableDataInfo;

/**
 * 废品类型管理Controller
 * 
 * @author jane
 * @date 2024-10-11
 */
@RestController
@RequestMapping("/manage/type")
public class FpTypeController extends BaseController
{
    @Autowired
    private IFpTypeService fpTypeService;

    /**
     * 查询废品类型管理列表
     */
    @PreAuthorize("@ss.hasPermi('manage:type:list')")
    @GetMapping("/list")
    public TableDataInfo list(FpType fpType)
    {
        startPage();
        List<FpType> list = fpTypeService.selectFpTypeList(fpType);
        return getDataTable(list);
    }

    /**
     * 导出废品类型管理列表
     */
    @PreAuthorize("@ss.hasPermi('manage:type:export')")
    @Log(title = "废品类型管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, FpType fpType)
    {
        List<FpType> list = fpTypeService.selectFpTypeList(fpType);
        ExcelUtil<FpType> util = new ExcelUtil<FpType>(FpType.class);
        util.exportExcel(response, list, "废品类型管理数据");
    }

    /**
     * 获取废品类型管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('manage:type:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(fpTypeService.selectFpTypeById(id));
    }

    /**
     * 新增废品类型管理
     */
    @PreAuthorize("@ss.hasPermi('manage:type:add')")
    @Log(title = "废品类型管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody FpType fpType)
    {
        return toAjax(fpTypeService.insertFpType(fpType));
    }

    /**
     * 修改废品类型管理
     */
    @PreAuthorize("@ss.hasPermi('manage:type:edit')")
    @Log(title = "废品类型管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody FpType fpType)
    {
        return toAjax(fpTypeService.updateFpType(fpType));
    }

    /**
     * 删除废品类型管理
     */
    @PreAuthorize("@ss.hasPermi('manage:type:remove')")
    @Log(title = "废品类型管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(fpTypeService.deleteFpTypeByIds(ids));
    }
}
