package com.dkd.manage.service;

import java.util.List;
import com.dkd.manage.domain.Cycle;

/**
 * 废品管理Service接口
 * 
 * @author jane
 * @date 2024-10-11
 */
public interface ICycleService 
{
    /**
     * 查询废品管理
     * 
     * @param id 废品管理主键
     * @return 废品管理
     */
    public Cycle selectCycleById(Long id);

    /**
     * 查询废品管理列表
     * 
     * @param cycle 废品管理
     * @return 废品管理集合
     */
    public List<Cycle> selectCycleList(Cycle cycle);

    /**
     * 新增废品管理
     * 
     * @param cycle 废品管理
     * @return 结果
     */
    public int insertCycle(Cycle cycle);

    /**
     * 修改废品管理
     * 
     * @param cycle 废品管理
     * @return 结果
     */
    public int updateCycle(Cycle cycle);

    /**
     * 批量删除废品管理
     * 
     * @param ids 需要删除的废品管理主键集合
     * @return 结果
     */
    public int deleteCycleByIds(Long[] ids);

    /**
     * 删除废品管理信息
     * 
     * @param id 废品管理主键
     * @return 结果
     */
    public int deleteCycleById(Long id);
}
