package com.dkd.manage.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.dkd.common.annotation.Excel;
import com.dkd.common.core.domain.BaseEntity;

/**
 * 废品管理对象 tb_cycle
 * 
 * @author jane
 * @date 2024-10-11
 */
public class Cycle extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 点位Id */
    private Long nodeId;

    /** 详细地址 */
    @Excel(name = "详细地址")
    private String addr;

    /** 区域类型 */
    private Long businessType;

    /** 区域Id */
    private Long regionId;

    /** 废品类型 */
    @Excel(name = "废品类型")
    private Long vmTypeId;

    /** 经度 */
    private Long longitudes;

    /** 维度 */
    private Long latitude;

    /** 客户端连接Id,做emq认证用 */
    private String clientId;

    /** 策略id */
    private Long policyId;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setNodeId(Long nodeId) 
    {
        this.nodeId = nodeId;
    }

    public Long getNodeId() 
    {
        return nodeId;
    }
    public void setAddr(String addr) 
    {
        this.addr = addr;
    }

    public String getAddr() 
    {
        return addr;
    }
    public void setBusinessType(Long businessType) 
    {
        this.businessType = businessType;
    }

    public Long getBusinessType() 
    {
        return businessType;
    }
    public void setRegionId(Long regionId) 
    {
        this.regionId = regionId;
    }

    public Long getRegionId() 
    {
        return regionId;
    }
    public void setVmTypeId(Long vmTypeId) 
    {
        this.vmTypeId = vmTypeId;
    }

    public Long getVmTypeId() 
    {
        return vmTypeId;
    }
    public void setLongitudes(Long longitudes) 
    {
        this.longitudes = longitudes;
    }

    public Long getLongitudes() 
    {
        return longitudes;
    }
    public void setLatitude(Long latitude) 
    {
        this.latitude = latitude;
    }

    public Long getLatitude() 
    {
        return latitude;
    }
    public void setClientId(String clientId) 
    {
        this.clientId = clientId;
    }

    public String getClientId() 
    {
        return clientId;
    }
    public void setPolicyId(Long policyId) 
    {
        this.policyId = policyId;
    }

    public Long getPolicyId() 
    {
        return policyId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("nodeId", getNodeId())
            .append("addr", getAddr())
            .append("businessType", getBusinessType())
            .append("regionId", getRegionId())
            .append("vmTypeId", getVmTypeId())
            .append("longitudes", getLongitudes())
            .append("latitude", getLatitude())
            .append("clientId", getClientId())
            .append("policyId", getPolicyId())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
