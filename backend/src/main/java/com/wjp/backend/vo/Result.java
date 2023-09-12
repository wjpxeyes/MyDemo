package com.wjp.backend.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> {
    private Integer code;
    private T data;
    private String message;

    public static <T> Result<T> success(T data) {
        return new Result<>(200, data, "请求成功");
    }

    public static <T> Result<T> success() {
        return success(null);
    }

    public String toJson() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.ALWAYS);
        return mapper.writeValueAsString(this);
    }

    public static <T> Result<T> fa(T data) {
        return new Result<>(200, data, "请求成功");
    }

    public static <T> Result<T> fa1(T data) {
        return new Result<>(200, data, "请求成功");
    }


}
