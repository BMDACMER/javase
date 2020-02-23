package com.atguigu.java;

public class ArrayUtilTest {
    public static void main(String[] args) {
        // 创建对象
        ArrayUtil util = new ArrayUtil();
        int[] arr = new int[]{2,4,3,687,45,10,67,-34,-2,100};
        int max = util.getMax(arr);
        int min = util.getMin(arr);
        int avg = util.getAvg(arr);
        int sum = util.getSum(arr);
        int dist = util.getIndex(arr, 10);

        System.out.println("maxValue:" + max + "\nminValue:" + min + " \navg:" + avg + "" +
                " \nsum:" + sum + " \ndist:" + dist);
        System.out.println("排序前：");
        util.print(arr);
        System.out.println("排序后：");
        util.sort(arr);
        util.print(arr);

    }
}
