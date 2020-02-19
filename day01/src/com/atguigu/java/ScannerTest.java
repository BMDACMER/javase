package com.atguigu.java;

import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {
        // 1 Scanner实例化
        Scanner scan = new Scanner(System.in);

        // 2 调用Scanner类的相关方法
        System.out.println("请输入您的姓名：");
        String name = scan.next();
        System.out.println("您的名字是：" + name);

        System.out.println("请输入您的芳龄：");
        int age = scan.nextInt();
        System.out.println(age);

        System.out.println("请输入您的体重：");
        double weight = scan.nextDouble();
        System.out.println(weight);

        System.out.println("您是否相中我了？（treu/false）");
        boolean isLove = scan.nextBoolean();
        System.out.println(isLove);

        // 对于char型的获取，Scanner没有提供相关的方法。只能获取一个字符串
        System.out.println("请输入您的性别：（男/女）");
        String gender = scan.next();   // "男"
        char genderCahr = gender.charAt(0);   // 获取索引为0位置上的字符
        System.out.println(genderCahr);

    }
}
