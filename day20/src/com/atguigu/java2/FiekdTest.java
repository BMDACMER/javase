package com.atguigu.java2;

import com.atguigu.java1.Person;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class FiekdTest {
    @Test
    public void test1(){
        Class claszz = Person.class;

        // 获取属性结构
        // getFields(): 获取当前运行时类及其父类中声明为 public 访问权限的属性
        Field[] fields = claszz.getFields();
        for (Field f : fields){
            System.out.println(f);
        }
        System.out.println();

        // getDeclaredFields(): 获取当前运行时类中声明的所有属性。（不包括父类中声明的属性）
        Field[] declaredFiels = claszz.getDeclaredFields();
        for (Field f : declaredFiels){
            System.out.println(f);
        }
    }

    // 权限修改符  数据类型  变量名
    @Test
    public void test2(){
        Class clazz = Person.class;
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field f : declaredFields){
            // 1 权限修饰符
            int modifier = f.getModifiers();
            System.out.print(Modifier.toString(modifier) + "\t");

            // 2 数据类型
            Class type = f.getType();
            System.out.print(type.getName() + "\t");

            // 3 变量名
            String fName = f.getName();
            System.out.println(fName);

            System.out.println();
        }
    }
}
