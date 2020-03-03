package com.atguigu.java1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest1 {


    public static void main(String[] args) {


        method3();
    }

    public static void method3(){
        try {
            method2();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void method2() throws IOException{
        method1();
    }

    public static void method1() throws FileNotFoundException,IOException{
        File file = new File("E:\\dev\\javaweb\\IDEA\\javase\\day10\\src\\com\\atguigu\\java1\\hello.txt");
        FileInputStream fis = new FileInputStream(file);

        int data = fis.read();
        while (data != -1){
            System.out.print((char)data);
            data = fis.read();
        }

        fis.close();
        System.out.println("\nhahaha!");
    }
}
