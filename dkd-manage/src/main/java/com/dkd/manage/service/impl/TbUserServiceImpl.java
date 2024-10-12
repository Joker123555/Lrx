package com.dkd.manage.service.impl;

import java.util.List;
import com.dkd.common.utils.DateUtils;
import com.dkd.manage.domain.Role;
import com.dkd.manage.mapper.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dkd.manage.mapper.TbUserMapper;
import com.dkd.manage.domain.TbUser;
import com.dkd.manage.service.ITbUserService;

/**
 * 用户管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-10-12
 */
@Service
public class TbUserServiceImpl implements ITbUserService 
{
    @Autowired
    private TbUserMapper tbUserMapper;

    @Autowired
    private RoleMapper roleMapper;
    /**
     * 查询用户管理
     * 
     * @param userId 用户管理主键
     * @return 用户管理
     */
    @Override
    public TbUser selectTbUserByUserId(Long userId)
    {
        return tbUserMapper.selectTbUserByUserId(userId);
    }

    /**
     * 查询用户管理列表
     * 
     * @param tbUser 用户管理
     * @return 用户管理
     */
    @Override
    public List<TbUser> selectTbUserList(TbUser tbUser)
    {
        return tbUserMapper.selectTbUserList(tbUser);
    }

    /**
     * 新增用户管理
     * 
     * @param tbUser 用户管理
     * @return 结果
     */
    @Override
    public int insertTbUser(TbUser tbUser)
    {
        //补充角色信息
        Role role = roleMapper.selectRoleByRoleId(tbUser.getRoleId());
            tbUser.setRoleName(role.getRoleName());
            tbUser.setRoleCode(role.getRoleCode());
        tbUser.setCreateTime(DateUtils.getNowDate());
        return tbUserMapper.insertTbUser(tbUser);
    }

    /**
     * 修改用户管理
     * 
     * @param tbUser 用户管理
     * @return 结果
     */
    @Override
    public int updateTbUser(TbUser tbUser)
    {
        //补充角色信息
        Role role = roleMapper.selectRoleByRoleId(tbUser.getRoleId());
        tbUser.setRoleName(role.getRoleName());
        tbUser.setRoleCode(role.getRoleCode());
        tbUser.setUpdateTime(DateUtils.getNowDate());
        return tbUserMapper.updateTbUser(tbUser);
    }

    /**
     * 批量删除用户管理
     * 
     * @param userIds 需要删除的用户管理主键
     * @return 结果
     */
    @Override
    public int deleteTbUserByUserIds(Long[] userIds)
    {
        return tbUserMapper.deleteTbUserByUserIds(userIds);
    }

    /**
     * 删除用户管理信息
     * 
     * @param userId 用户管理主键
     * @return 结果
     */
    @Override
    public int deleteTbUserByUserId(Long userId)
    {
        return tbUserMapper.deleteTbUserByUserId(userId);
    }
}
