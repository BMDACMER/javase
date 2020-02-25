package com.atguigu.java;

public class Order {

    private int orderPrivate;
    int orderDefault;
    public int orderPublic;

    private void methodPrivate(){
        orderPrivate = 1;
        orderDefault = 2;
        orderPublic = 3;
    }
    void methodDefault(){
        orderPrivate = 11;
        orderDefault = 22;
        orderPublic = 33;
    }
    public void methodPublic(){
        orderPrivate = 111;
        orderDefault = 222;
        orderPublic = 333;
    }
}
