package com.dkd.manage.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dkd.manage.mapper.FpTypeMapper;
import com.dkd.manage.domain.FpType;
import com.dkd.manage.service.IFpTypeService;

/**
 * 废品类型管理Service业务层处理
 * 
 * @author jane
 * @date 2024-10-11
 */
@Service
public class FpTypeServiceImpl implements IFpTypeService 
{
    @Autowired
    private FpTypeMapper fpTypeMapper;

    /**
     * 查询废品类型管理
     * 
     * @param id 废品类型管理主键
     * @return 废品类型管理
     */
    @Override
    public FpType selectFpTypeById(Long id)
    {
        return fpTypeMapper.selectFpTypeById(id);
    }

    /**
     * 查询废品类型管理列表
     * 
     * @param fpType 废品类型管理
     * @return 废品类型管理
     */
    @Override
    public List<FpType> selectFpTypeList(FpType fpType)
    {
        return fpTypeMapper.selectFpTypeList(fpType);
    }

    /**
     * 新增废品类型管理
     * 
     * @param fpType 废品类型管理
     * @return 结果
     */
    @Override
    public int insertFpType(FpType fpType)
    {
        return fpTypeMapper.insertFpType(fpType);
    }

    /**
     * 修改废品类型管理
     * 
     * @param fpType 废品类型管理
     * @return 结果
     */
    @Override
    public int updateFpType(FpType fpType)
    {
        return fpTypeMapper.updateFpType(fpType);
    }

    /**
     * 批量删除废品类型管理
     * 
     * @param ids 需要删除的废品类型管理主键
     * @return 结果
     */
    @Override
    public int deleteFpTypeByIds(Long[] ids)
    {
        return fpTypeMapper.deleteFpTypeByIds(ids);
    }

    /**
     * 删除废品类型管理信息
     * 
     * @param id 废品类型管理主键
     * @return 结果
     */
    @Override
    public int deleteFpTypeById(Long id)
    {
        return fpTypeMapper.deleteFpTypeById(id);
    }
}
