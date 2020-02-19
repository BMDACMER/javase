package com.atguigu.java;


/**
 * * 算法的考查：求数值型数组中元素的最大值、最小值、平均数、总和等
 *
 * 定义一个int型的一维数组，包含10个元素，分别赋一些随机整数，
 * 然后求出所有元素的最大值，最小值，和值，平均值，并输出出来。
 * 要求：所有随机数都是两位数。
 *
 * [10,99]
 * 公式：(int)(Math.random() * (99 - 10 + 1) + 10)
 */
public class ArrayTest1 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * (99-10+1) + 10);
        }

        // 遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        // 求数组元素的最大值
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>maxValue){
                maxValue = arr[i];
            }
        }

        // 求数组元素的最小值
        int minValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue){
                minValue = arr[i];
            }
        }

        // 总和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        // 平均数
        int average;
        average = sum / arr.length;

        System.out.print("最大值为：" + maxValue + "\n最小值为：" + minValue + "\n总和为：" + sum + "\n平均数为：" + average);
    }
}




