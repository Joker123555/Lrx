package com.dkd.manage.mapper;

import java.util.List;
import com.dkd.manage.domain.FpType;

/**
 * 废品类型管理Mapper接口
 * 
 * @author jane
 * @date 2024-10-11
 */
public interface FpTypeMapper 
{
    /**
     * 查询废品类型管理
     * 
     * @param id 废品类型管理主键
     * @return 废品类型管理
     */
    public FpType selectFpTypeById(Long id);

    /**
     * 查询废品类型管理列表
     * 
     * @param fpType 废品类型管理
     * @return 废品类型管理集合
     */
    public List<FpType> selectFpTypeList(FpType fpType);

    /**
     * 新增废品类型管理
     * 
     * @param fpType 废品类型管理
     * @return 结果
     */
    public int insertFpType(FpType fpType);

    /**
     * 修改废品类型管理
     * 
     * @param fpType 废品类型管理
     * @return 结果
     */
    public int updateFpType(FpType fpType);

    /**
     * 删除废品类型管理
     * 
     * @param id 废品类型管理主键
     * @return 结果
     */
    public int deleteFpTypeById(Long id);

    /**
     * 批量删除废品类型管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteFpTypeByIds(Long[] ids);
}
