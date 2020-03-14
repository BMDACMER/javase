package com.atguigu.java2;

import com.atguigu.java1.Person;
import org.junit.Test;

import java.beans.Customizer;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class OtherTest {
    /*
    获取构造器结构
     */
    @Test
    public void test1(){
        Class<Person> personClass = Person.class;
        // getConstructors(): 获取当前运行时类中声明为public的构造器
        Constructor[] constructors = personClass.getConstructors();
        for (Constructor c : constructors){
            System.out.println(c);
        }

        System.out.println();
        // getDeclaredConsturctors(): 获取当前运行时类中声明的所有的构造器
        Constructor<?>[] declaredConstructors = personClass.getDeclaredConstructors();
        for (Constructor c : declaredConstructors){
            System.out.println(c);
        }
    }

    /**
     * 获取运行时类的父类
     */
    @Test
    public void test2(){
        Class<Person> personClass = Person.class;

        Class<? super Person> superclass = personClass.getSuperclass();
//        Class superclass = personClass.getSuperclass();
        System.out.println(superclass);
    }


    /*
    获取运行时类的带泛型的父类

     */
    @Test
    public void test3(){
        Class clazz = Person.class;

        Type genericSuperclass = clazz.getGenericSuperclass();
        System.out.println(genericSuperclass);
    }

    /*
    获取运行时类的带泛型的父类的泛型


    代码：逻辑性代码  vs 功能性代码
     */
    @Test
    public void test4(){
        Class clazz = Person.class;

        Type genericSuperclass = clazz.getGenericSuperclass();
        ParameterizedType paramType = (ParameterizedType) genericSuperclass;
        //获取泛型类型
        Type[] actualTypeArguments = paramType.getActualTypeArguments();
//        System.out.println(actualTypeArguments[0].getTypeName());
        System.out.println(((Class)actualTypeArguments[0]).getName());  // java.lang.String
    }

    /*
   获取运行时类实现的接口
    */
    @Test
    public void test5(){
        Class clazz = Person.class;

        Class[] interfaces = clazz.getInterfaces();
        for(Class c : interfaces){
            System.out.println(c);
        }

        System.out.println();
        //获取运行时类的父类实现的接口
        Class[] interfaces1 = clazz.getSuperclass().getInterfaces();
        for(Class c : interfaces1){
            System.out.println(c);
        }

    }

    /*
       获取运行时类所在的包

    */
    @Test
    public void test6(){
        Class clazz = Person.class;

        Package pack = clazz.getPackage();
        System.out.println(pack);   // package com.atguigu.java1
    }

    /*
        获取运行时类声明的注解
     */
    @Test
    public void test7(){
        Class clazz = Person.class;

        Annotation[] annotations = clazz.getAnnotations();
        for(Annotation annos : annotations){
            System.out.println(annos);   // @com.atguigu.java1.MyAnnotation(value=hi)
        }
    }
}
