package com.dkd.manage.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.dkd.common.annotation.Excel;
import com.dkd.common.core.domain.BaseEntity;

/**
 * 合作商管理对象 tb_partner
 * 
 * @author jane
 * @date 2024-10-05
 */
public class Partner extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long id;

    /** 合作商名称 */
    @Excel(name = "合作商名称")
    private String partnerName;

    /** 联系人 */
    @Excel(name = "联系人")
    private String contactPerson;

    /** 联系电话 */
    @Excel(name = "联系电话")
    private String contactPhone;

    /** 分成比例 */
    @Excel(name = "分成比例")
    private Long splitRatio;

    /** 账号 */
    @Excel(name = "账号")
    private String account;

    /** 密码 */
    private String password;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setPartnerName(String partnerName) 
    {
        this.partnerName = partnerName;
    }

    public String getPartnerName() 
    {
        return partnerName;
    }
    public void setContactPerson(String contactPerson) 
    {
        this.contactPerson = contactPerson;
    }

    public String getContactPerson() 
    {
        return contactPerson;
    }
    public void setContactPhone(String contactPhone) 
    {
        this.contactPhone = contactPhone;
    }

    public String getContactPhone() 
    {
        return contactPhone;
    }
    public void setSplitRatio(Long splitRatio) 
    {
        this.splitRatio = splitRatio;
    }

    public Long getSplitRatio() 
    {
        return splitRatio;
    }
    public void setAccount(String account) 
    {
        this.account = account;
    }

    public String getAccount() 
    {
        return account;
    }
    public void setPassword(String password) 
    {
        this.password = password;
    }

    public String getPassword() 
    {
        return password;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("partnerName", getPartnerName())
            .append("contactPerson", getContactPerson())
            .append("contactPhone", getContactPhone())
            .append("splitRatio", getSplitRatio())
            .append("account", getAccount())
            .append("password", getPassword())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("createBy", getCreateBy())
            .append("updateBy", getUpdateBy())
            .append("remark", getRemark())
            .toString();
    }
}
