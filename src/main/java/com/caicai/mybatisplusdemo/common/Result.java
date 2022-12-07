package com.caicai.mybatisplusdemo.common;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Setter
@Accessors(chain = true)
public class Result<T> implements Serializable {

    @ApiModelProperty(value = "成功标志")
    private boolean success;

    @ApiModelProperty(value = "消息")
    private String message;

    @ApiModelProperty(value = "返回代码")
    private Integer code;

    @ApiModelProperty(value = "时间戳")
    private long timestamp = System.currentTimeMillis();

    @ApiModelProperty(value = "结果对象")
    private T result;

    /**
     * 成功
     */
    public static <T> Result<T> success(T data) {
        Result<T> result = new Result<T>();
        result.setCode(200);
        result.setMessage("成功");
        result.setResult(data);
        return result;
    }

    /**
     * 失败
     */
    public static <T> Result<T> error(int code, String message) {
        return new Result().setCode(code).setMessage(message);
    }
}
