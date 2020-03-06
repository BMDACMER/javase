package com.atguigu.exer;

/**
 * String是不可变的，数组是可以变得  char[] 是数组 改变之后
 */
public class StringTest {
    String str = new String("good");
    char[] ch = {'t','e','s','t'};

    public void change(String str, char ch[]){
        str = "tesk ok";
        ch[0] = 'b';
    }

    public static void main(String[] args) {
        StringTest ex = new StringTest();
        ex.change(ex.str, ex.ch);
        System.out.println(ex.str);   //  good
        System.out.println(ex.ch);  // best
    }

}


