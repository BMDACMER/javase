package com.atguigu.java;

public class InstanceTest {
    public static void main(String[] args) {
        Phone p = new Phone();
        System.out.println(p);   // com.atguigu.java.Phone@1b6d3586

        p.setEmail();
        p.playGame();

        System.out.println("===============");
        // 匿名对象
        new Phone().setEmail();
        new Phone().playGame();

        new Phone().price = 1999;
        new Phone().showPrice();; // 0.0

        // *****************************
        PhoneMall mall = new PhoneMall();
        // 匿名对象的使用
        mall.show(new Phone());

    }
}

class Phone{
    double price;

    public void setEmail(){
        System.out.println("发送邮件");
    }

    public void playGame(){
        System.out.println("玩游戏");
    }
    public void showPrice(){
        System.out.println("手机价格为：" + price);
    }
}

class PhoneMall{
    public void show(Phone phone){
        phone.setEmail();
        phone.playGame();
    }
}