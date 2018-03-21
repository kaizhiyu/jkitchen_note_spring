package com.sauzny.springbootweb.controller.vo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.sauzny.springbootweb.SbwConstant.FailureEnum;
import com.sauzny.springbootweb.utils.JacksonUtils;

import static com.sauzny.springbootweb.SbwConstant.RestFulResult.*;

import lombok.Data;

@Data
@JsonInclude(Include.NON_NULL)
public class RestFulResult {
    
    private Integer status;
    private String message;
    private String content;
    private Boolean bool;
    private Object entity;
    private List<?> list;
    // 分页时填充结果
    private PageContent page;
    
    public static RestFulResult success(){
        RestFulResult result = new RestFulResult();
        result.setStatus(STATUS_CODE_SUCCESS);
        result.setMessage(MESSAGE_SUCCESS);
        return result;
    }
    
    public static RestFulResult success(String content){
        RestFulResult result = new RestFulResult();
        result.setStatus(STATUS_CODE_SUCCESS);
        result.setMessage(MESSAGE_SUCCESS);
        result.setContent(content);
        return result;
    }
    
    public static RestFulResult success(Boolean bool){
        RestFulResult result = new RestFulResult();
        result.setStatus(STATUS_CODE_SUCCESS);
        result.setMessage(MESSAGE_SUCCESS);
        result.setBool(bool);
        return result;
    }
    
    public static RestFulResult success(Object entity){
        RestFulResult result = new RestFulResult();
        result.setStatus(STATUS_CODE_SUCCESS);
        result.setMessage(MESSAGE_SUCCESS);
        result.setEntity(entity);
        return result;
    }
    
    public static RestFulResult success(List<?> list){
        RestFulResult result = new RestFulResult();
        result.setStatus(STATUS_CODE_SUCCESS);
        result.setMessage(MESSAGE_SUCCESS);
        result.setList(list);
        return result;
    }
    
    public static RestFulResult success(PageContent page){
        RestFulResult result = new RestFulResult();
        result.setStatus(STATUS_CODE_SUCCESS);
        result.setMessage(MESSAGE_SUCCESS);
        result.setPage(page);
        return result;
    }
    
    public static RestFulResult failure(){
        RestFulResult result = new RestFulResult();
        result.setStatus(STATUS_CODE_FAILURE);
        result.setMessage(MESSAGE_FAILURE);
        return result;
    }
    
    public static RestFulResult failure(Integer status, String message){
        RestFulResult result = new RestFulResult();
        result.setStatus(status);
        result.setMessage(message);
        return result;
    }
    
    public static RestFulResult failure(FailureEnum failureEnum){
        RestFulResult result = new RestFulResult();
        result.setStatus(failureEnum.getStatusCode());
        result.setMessage(failureEnum.getMessage());
        return result;
    }
    
    public String toJson(){
        return JacksonUtils.nonNull().toJson(this);
    }
}
