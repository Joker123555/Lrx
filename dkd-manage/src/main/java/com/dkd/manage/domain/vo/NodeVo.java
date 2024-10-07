package com.dkd.manage.domain.vo;

import com.dkd.manage.domain.Node;
import com.dkd.manage.domain.Region;
import lombok.Data;

@Data
public class NodeVo extends Node {
    //区域信息
    private Region region;

}
