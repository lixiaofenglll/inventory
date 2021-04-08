package com.kade2021inventory.utils;

/**
 * @Auther: zhangsan
 * @Date:凌端辉
 * @Description:
 * @version：1.0
 **/
public enum WaerhouseType {
    //系统未知异常
    UNKNOW_EXCEPTION(10000,"系统未知异常"),
    //验证异常状态码
    VAILD_EXCEPTION(10001,"参数格式校验失败"),
    //id是否重复
    BYID_REPETITION_EXCEPTION(10002,"编码重复"),
    //name是否重复
    NAME_REPETITION_EXCEPTION(10003,"仓库名称重复"),
    //删除是否成功
    NULL_EXCEPTION(10004,"记录可能已经不存在");



    //枚举就是个私有的构造器
    private int code;
    private String msg;

    WaerhouseType(int code,String msg){
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;

    }



    public String getMsg() {
        return msg;
    }

}
