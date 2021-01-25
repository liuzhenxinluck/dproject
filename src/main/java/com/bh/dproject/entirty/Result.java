package com.bh.dproject.entirty;

public class Result<T> {
    private Integer code;
    private  String messge;
    private  T data;
    public  Result(){

    }
    public Result(int code,String messge,T data){
        this.code=code;
        this.messge = messge;
        this.data = data;
    }
    public  Result(int code,String messge){
        this.code = code;
        this.messge = messge;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessge() {
        return messge;
    }

    public void setMessge(String messge) {
        this.messge = messge;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
