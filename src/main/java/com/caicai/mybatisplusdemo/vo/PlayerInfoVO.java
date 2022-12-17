package com.caicai.mybatisplusdemo.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 一定需要添加@Data注释，因为@Data注释等于为实体类的所有属性添加了
 * get、set、equals、hashCode、toString等方法
 * ORM框架将字段值映射到实体类的时候，通过Setter方法为类的属性赋值
 * 因此，返回值一定需要@Data注解
 */
@Data
public class PlayerInfoVO {

    @ApiModelProperty(value = "主键ID")
    private String id;

    @ApiModelProperty(value = "姓名")
    private String playerName;

    @ApiModelProperty(value = "国籍")
    private String nation;

    @ApiModelProperty(value = "身价")
    private BigDecimal price;

    @ApiModelProperty(value = "队伍ID")
    private String teamId;

    @ApiModelProperty(value = "号码")
    private Integer number;

    @ApiModelProperty(value = "年龄")
    private Integer age;
}
