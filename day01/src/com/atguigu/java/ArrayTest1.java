package com.atguigu.java;

/**
 * 数组元素的默认初始化值
 * 		> 数组元素是整型：0
 * 		> 数组元素是浮点型：0.0
 * 		> 数组元素是char型：0或'\u0000'，而非'0'
 * 		> 数组元素是boolean型：false
 *
 * 		> 数组元素是引用数据类型：null
 */
public class ArrayTest1 {

    public static void main(String[] args) {
        System.out.println("**********int默认值*************");
        // 5  数组元素的默认初始化值
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("***********short默认值************");
        short[] arr1 = new short[4];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        System.out.println("***********float默认值************");
        float[] arr2 = new float[5];
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        System.out.println("***********char默认值************");
        char[] arr3 = new char[5];
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }

        if(arr3[0] == 0){
            System.out.println("您好！");
        }

        System.out.println("***********boolean默认值*******************");
        boolean[] arr4 = new boolean[5];
        System.out.println(arr4[0]);

        System.out.println("***************String默认值*************");
        String[] arr5 = new String[5];
        System.out.println(arr5[0]);
        if(arr5[0] == null){
            System.out.println("今天天气真好");
        }

    }
}
