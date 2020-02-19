package com.atguigu.java;

/**
 * * 理解：
 * 对于二维数组的理解，我们可以看成是一维数组array1又作为另一个一维数组array2的元素而存在。
 * 其实，从数组底层的运行机制来看，其实没有多维数组。
 */
public class ArrayTest2 {

    public static void main(String[] args) {
        // 1 二维数组的声明和初始化
        int[] arr = new int[]{1, 2, 3};    // 一维数组
        // 静态初始化
        int[][] arr1 = new int[][]{{1, 2, 3}, {4, 5}, {6, 7, 8}};
        // 动态初始化1
        String[][] arr2 = new String[3][2];
        //动态初始化2
        String[][] arr3 = new String[3][];

        int[] arr4[] = new int[][]{{1, 2, 3}, {4, 5, 9, 10}, {6, 7, 8}};
        int[] arr5[] = {{1, 2, 3}, {4, 5}, {6, 7, 8}};

        // 2 如何调用数组的指定位置的元素
        System.out.println(arr1[0][1]);   //2
        System.out.println(arr2[1][1]);  // 默认值为null

        arr3[1] = new String[4];
        System.out.println(arr3);  // [[Ljava.lang.String;@1b6d3586
        System.out.println(arr3[1]);  // [Ljava.lang.String;@4554617c
        System.out.println(arr3[1][0]);  // null

        //3.获取数组的长度
        System.out.println(arr4.length);//3
        System.out.println(arr4[0].length);//3
        System.out.println(arr4[1].length);//4

        // 4 如何遍历二维数组
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }
    }
}
