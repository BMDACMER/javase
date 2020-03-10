package com.atguigu.java;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * * 一、流的分类：
 * 1.操作数据单位：字节流、字符流
 * 2.数据的流向：输入流、输出流
 * 3.流的角色：节点流、处理流
 *
 * 二、流的体系结构
 * 抽象基类         节点流（或文件流）                               缓冲流（处理流的一种）
 * InputStream     FileInputStream   (read(byte[] buffer))        BufferedInputStream (read(byte[] buffer))
 * OutputStream    FileOutputStream  (write(byte[] buffer,0,len)  BufferedOutputStream (write(byte[] buffer,0,len) / flush()
 * Reader          FileReader (read(char[] cbuf))                 BufferedReader (read(char[] cbuf) / readLine())
 * Writer          FileWriter (write(char[] cbuf,0,len)           BufferedWriter (write(char[] cbuf,0,len) / flush()
 *
 */
public class FileReaderWriterTest {
    public static void main(String[] args) {
        File file = new File("hello.txt");
        System.out.println(file.getAbsoluteFile());
        System.out.println("**********************");
        File file1 = new File("day18\\hello.txt");
        System.out.println(file1.getAbsoluteFile());
    }

    @Test
    public void testFileReader(){
        FileReader fr = null;

        try {
            // 1 实例化File类的对象，指明要操作的文件
            File file = new File("hello.txt");
            // 2 提供具体的流
            fr = new FileReader(file);

            int data;
            while ((data = fr.read()) != -1){
                System.out.print((char)data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
           if (fr != null){
               try {
                   fr.close();
               } catch (IOException e) {
                   e.printStackTrace();
               }
           }
        }
    }

    @Test
    public void testFileReader1(){
        FileReader fr =null;
        try {
            File file = new File("hello.txt");
            fr = new FileReader(file);

            char[] cbuf = new char[5];
            int len;
            while ((len = fr.read(cbuf))!=-1){
                String str = new String(cbuf,0,len);
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void testFileWriter(){
        FileWriter fiw = null;

        try {
            File file = new File("hello.txt");
            fiw = new FileWriter(file,false);

            fiw.write("I have a dream\n");
            fiw.write("you need to have a dream");
            System.out.println("写入成功");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fiw != null){
                try {
                    fiw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void testFileReaderFileWriter(){
        FileReader fr = null;
        FileWriter fw = null;

        try {
            File srcFile = new File("hello.txt");
            File destFile = new File("hello2.txt");

            fr = new FileReader(srcFile);
            fw = new FileWriter(destFile);

            char[] cbuf = new char[5];
            int len;
            while ((len = fr.read(cbuf))!=-1){
                fw.write(cbuf,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fw != null)
                    fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
