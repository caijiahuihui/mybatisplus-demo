package com.caicai.mybatisplusdemo.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("player_info")
@ApiModel(value="PlayerInfo对象", description="球员信息表")
public class PlayerInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键ID")
    @TableId(value = "id", type = IdType.NONE)
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
