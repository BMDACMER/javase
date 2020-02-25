package com.atguigu.java1;

/**
 * JavaBean 是一种java语言写的可重用组件
 * <p>
 * 所谓javabean，是指符合如下标准的java类：
 * > 类是公共的
 * > 有一个无参的公共构造器
 * > 有属性，且有对应的get、set方法
 */
public class Customer {

    private int id;
    private String name;

    public Customer() {

    }

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
