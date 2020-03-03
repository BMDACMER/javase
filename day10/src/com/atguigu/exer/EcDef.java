package com.atguigu.exer;

// 自定义异常类
public class EcDef  extends Exception {
    static final long serialVersionUID = 1457412L;

    public EcDef(){

    }

    public EcDef(String message) {
        super(message);
    }
}
