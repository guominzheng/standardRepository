package com.yls.standard.common.util;

import java.util.HashMap;

public class AjaxResponse extends HashMap<String,Object> {

    private AjaxResponse(){

    }

    public AjaxResponse(String code,String msg,Object data){
        this.put("code",code);
        this.put("msg",msg);
        this.put("data",data);
    }

    public static AjaxResponse success(){
       return new AjaxResponse("200","操作成功",null);
    }

    public static AjaxResponse success(String msg){
        return new AjaxResponse("200",msg,null);
    }

    public static AjaxResponse success(String msg ,Object data){
        return new AjaxResponse("200",msg,data);
    }

    public String getCode(){
        return this.get("code")!=null?this.get("code").toString():"";
    }

    public String getMsg(){
        return this.get("msg")!=null?this.get("msg").toString():"";
    }

    public Object getData(){
        return this.get("data");
    }
}
