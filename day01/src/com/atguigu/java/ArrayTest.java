package com.atguigu.java;

public class ArrayTest {

    public static void main(String[] args) {
        // 1、一维数组的声明和初始化
        int num;   // 声明
        num = 10;   // 初始化
        int id = 1024;   // 声明+初始化

        int[] ids;   // 以为数组初始化
        // 1.1  静态初始化：数组的初始化和数组元素的复制操作同时进行
        ids = new int[]{1001, 1002, 1003, 1004};
        //1.2 动态初始化：数组的初始化和数组元素的复制操作分开进行
        String[] names = new String[5];

        int[] arr4 = {1, 2, 3, 4}; // 类型推断

        // 总结：  数组一旦初始化完成，其长度就确定了
        // 2 如何调用数组的指定位置的元素：通过角标的方式调用
        // 数组的角标（或索引）从0开始的，到数组的长度-1结束
        names[0] = "张三";
        names[1] = "里斯";
        names[2] = "王五";
        names[3] = "王二麻子";
        names[4] = "憨憨";

        //3  获取数组的长度
        // 属性：  length
        System.out.println(names.length);   // 5
        System.out.println(ids.length);  // 4
        System.out.println(names[3].charAt(0));  // 获取第一个字符
        System.out.println("=============================");

        // 4 遍历数组
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }



    }
}
