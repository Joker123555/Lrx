package com.dkd.manage.mapper;

import java.util.List;
import com.dkd.manage.domain.TbUser;

/**
 * 用户管理Mapper接口
 * 
 * @author ruoyi
 * @date 2024-10-12
 */
public interface TbUserMapper 
{
    /**
     * 查询用户管理
     * 
     * @param userId 用户管理主键
     * @return 用户管理
     */
    public TbUser selectTbUserByUserId(Long userId);

    /**
     * 查询用户管理列表
     * 
     * @param tbUser 用户管理
     * @return 用户管理集合
     */
    public List<TbUser> selectTbUserList(TbUser tbUser);

    /**
     * 新增用户管理
     * 
     * @param tbUser 用户管理
     * @return 结果
     */
    public int insertTbUser(TbUser tbUser);

    /**
     * 修改用户管理
     * 
     * @param tbUser 用户管理
     * @return 结果
     */
    public int updateTbUser(TbUser tbUser);

    /**
     * 删除用户管理
     * 
     * @param userId 用户管理主键
     * @return 结果
     */
    public int deleteTbUserByUserId(Long userId);

    /**
     * 批量删除用户管理
     * 
     * @param userIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTbUserByUserIds(Long[] userIds);
}
