package com.dkd.manage.service.impl;

import java.util.List;
import com.dkd.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dkd.manage.mapper.CycleMapper;
import com.dkd.manage.domain.Cycle;
import com.dkd.manage.service.ICycleService;

/**
 * 废品管理Service业务层处理
 * 
 * @author jane
 * @date 2024-10-11
 */
@Service
public class CycleServiceImpl implements ICycleService 
{
    @Autowired
    private CycleMapper cycleMapper;

    /**
     * 查询废品管理
     * 
     * @param id 废品管理主键
     * @return 废品管理
     */
    @Override
    public Cycle selectCycleById(Long id)
    {
        return cycleMapper.selectCycleById(id);
    }

    /**
     * 查询废品管理列表
     * 
     * @param cycle 废品管理
     * @return 废品管理
     */
    @Override
    public List<Cycle> selectCycleList(Cycle cycle)
    {
        return cycleMapper.selectCycleList(cycle);
    }

    /**
     * 新增废品管理
     * 
     * @param cycle 废品管理
     * @return 结果
     */
    @Override
    public int insertCycle(Cycle cycle)
    {
        cycle.setCreateTime(DateUtils.getNowDate());
        return cycleMapper.insertCycle(cycle);
    }

    /**
     * 修改废品管理
     * 
     * @param cycle 废品管理
     * @return 结果
     */
    @Override
    public int updateCycle(Cycle cycle)
    {
        cycle.setUpdateTime(DateUtils.getNowDate());
        return cycleMapper.updateCycle(cycle);
    }

    /**
     * 批量删除废品管理
     * 
     * @param ids 需要删除的废品管理主键
     * @return 结果
     */
    @Override
    public int deleteCycleByIds(Long[] ids)
    {
        return cycleMapper.deleteCycleByIds(ids);
    }

    /**
     * 删除废品管理信息
     * 
     * @param id 废品管理主键
     * @return 结果
     */
    @Override
    public int deleteCycleById(Long id)
    {
        return cycleMapper.deleteCycleById(id);
    }
}
