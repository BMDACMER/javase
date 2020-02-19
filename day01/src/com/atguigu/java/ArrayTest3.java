package com.atguigu.java;

public class ArrayTest3 {
    public static void main(String[] args) {

        int[][] arr = new int[4][3];
        System.out.println(arr[0]);
        System.out.println(arr[0][0]); // 0

        System.out.println("*************************************");
        float[][] arr1 = new float[4][3];
        System.out.println(arr1[0]);  // 地址值
        System.out.println(arr1[0][0]);  // 0.0

        System.out.println("==================================");
        String[][] arr2 = new String[4][2];
        System.out.println(arr2[1]);  // 地址值
        System.out.println(arr2[1][1]);  // null

        System.out.println("*******************************");
        double[][] arr3 = new double[4][];
        System.out.println(arr3[1]);   // null
//        System.out.println(arr3[1][10]); // 报错  java.lang.NullPointerException
    }
}
