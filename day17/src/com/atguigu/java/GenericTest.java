package com.atguigu.java;

import org.junit.Test;

import java.util.*;

public class GenericTest {

    @Test
    public void test1() {
        ArrayList list = new ArrayList();

        list.add(78);
        list.add(98);
        list.add(89);
        list.add(88);

        for (Object score : list) {
            int stuScore = (Integer) score;

            System.out.println(stuScore);
        }
    }

    @Test
    public void test2() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(78);
        list.add(98);
        list.add(89);
        list.add(88);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test3() {
        Map<String, Integer> map = new HashMap<>();

        map.put("TOM", 87);
        map.put("Jerry", 87);
        map.put("Jack", 56);
        map.put("hhhh", 222);
        map.put("qq", 34);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> next = iterator.next();
            String key = next.getKey();
            Integer value = next.getValue();
            System.out.println(key + "-------------->" + value);
        }
    }



}
