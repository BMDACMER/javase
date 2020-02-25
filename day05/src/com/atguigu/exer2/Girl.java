package com.atguigu.exer2;

public class Girl {
    private String name;
    private int age;

    public Girl() {

    }
    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void marry(Boy boy){
        System.out.println("我想嫁给" + boy.getName());
        boy.marry(this);
    }

    public int compare(Girl girl){
        return this.age - girl.age;
    }
}
