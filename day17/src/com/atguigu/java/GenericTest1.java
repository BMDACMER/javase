package com.atguigu.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GenericTest1 {

    @Test
    public void test1(){

        Order order = new Order();
        order.setOrderT(1233);
        order.setOrderT("ABC");

        Order<String> orderAA = new Order<>("orderAA", 1001, "order:AA");
        orderAA.setOrderT("AA:hello");
    }

    @Test
    public void test3(){
        ArrayList<String> list1 = null;
        ArrayList<Integer> list2 = new ArrayList<>();

//        list1 = list2;
          Person p1 = null;
          Person p2 = null;
          p2 = p1;
    }

    // 测试泛型方法
    @Test
    public void test4(){
        Order<String> order = new Order<>();
        Integer[] arr = new Integer[]{1,2,3,4};

        List<Integer> list = order.copyFromArrayToList(arr);
        System.out.println(list);
    }
}
