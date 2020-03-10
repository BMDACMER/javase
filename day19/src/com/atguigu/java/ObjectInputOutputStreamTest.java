package com.atguigu.java;

import org.junit.Test;

import java.io.*;

public class ObjectInputOutputStreamTest {
    @Test
    public void test1() {
        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new FileOutputStream("object.txt"));
            oos.writeObject(new String("我爱北京天安门"));
            oos.flush();

            oos.writeObject(new Person("過好", 23));
            oos.flush();

            oos.writeObject(new Person("張學良",45,1002,new Account(5000)));
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(oos != null){
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    @Test
    public void test2(){
        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(new FileInputStream("object.dat"));

            Object obj = ois.readObject();
            String str = (String) obj;

            Person p = (Person) ois.readObject();
            Person p1 = (Person) ois.readObject();

            System.out.println(str);
            System.out.println("P------> 姓名：" + p.getName() + "年龄：" + p.getAge());
            System.out.println("P1----------> 姓名：" + p1.getName() + " 年龄：" + p1.getAge() + " id： " + p1.getId() + " 账户余额：" + p1.getAcct());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
