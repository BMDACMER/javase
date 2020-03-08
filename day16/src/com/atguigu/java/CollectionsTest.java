package com.atguigu.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *  * Collections:操作Collection、Map的工具类
 *
 *
 * 面试题：Collection 和 Collections的区别？
 *
 */
public class CollectionsTest {

    @Test
    public void test1(){

        List list = new ArrayList();
        list.add(123);
        list.add(43);
        list.add(756);
        list.add(756);
        list.add(765);
        list.add(-97);
        list.add(0);

        System.out.println(list);

//        Collections.reverse(list);
//        Collections.shuffle(list);
//        Collections.sort(list);
//        Collections.swap(list,1,2);  // 1  2 为下标
        int frequency = Collections.frequency(list, 756);

        System.out.println(list);
//        System.out.println(frequency);
    }

    @Test
    public void test2(){
        List list = new ArrayList();
        list.add(123);
        list.add(43);
        list.add(765);
        list.add(-97);
        list.add(0);

        //报异常：IndexOutOfBoundsException("Source does not fit in dest")
//        List dest = new ArrayList();
//        Collections.copy(dest,list);
        //正确的：
        List dest = Arrays.asList(new Object[list.size()]);
        System.out.println(dest.size());//list.size();
        Collections.copy(dest,list);

        System.out.println(dest);


        /*
        Collections 类中提供了多个 synchronizedXxx() 方法，
        该方法可使将指定集合包装成线程同步的集合，从而可以解决
        多线程并发访问集合时的线程安全问题
         */
        System.out.println("*****************************");
        //返回的list1即为线程安全的List
        List list1 = Collections.synchronizedList(list);
        System.out.println(list1);   // 用上 但是是线程安全的
    }

}
