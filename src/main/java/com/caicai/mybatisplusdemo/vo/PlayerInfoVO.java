package com.caicai.mybatisplusdemo.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
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
