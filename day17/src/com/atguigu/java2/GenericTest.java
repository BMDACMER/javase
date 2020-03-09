package com.atguigu.java2;

import com.atguigu.java.Person;
import com.atguigu.java1.Student;
import org.junit.Test;

import javax.print.DocFlavor;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericTest {

    @Test
    public void test1() {
        Object obj = null;
        String str = null;
        obj = str;

        Object[] arr1 = null;
        String[] arr2 = null;
        arr1 = arr2;

        List<Object> list1 = null;
        List<String> list2 = new ArrayList<>();

        show(list1);
        show1(list2);
    }

    public void show1(List<String> list) {

    }

    public void show(List<Object> list) {

    }

    @Test
    public void test2() {
        AbstractList<String> list1 = null;
        List<String> list2 = null;
        ArrayList<String> list3 = null;

        list1 = list3;
        list2 = list3;

        List<String> list4 = new ArrayList<>();

    }

    /*
   2. 通配符的使用
      通配符：?

      类A是类B的父类，G<A>和G<B>是没有关系的，二者共同的父类是：G<?>
    */
    @Test
    public void test3() {
        List<Object> list1 = null;
        List<String> list2 = null;

        List<?> list = null;

        list = list1;
        list = list2;

        print(list1);
        print(list2);

        ArrayList<Object> list3 = new ArrayList<>();
        list3.add("AA");
        list3.add("BB");
        list3.add("CC");
        list = list3;
        list.add(null);

        Object o = list.get(1);
        System.out.println(o);
    }

    public void print(List<?> list) {
        Iterator<?> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    /*
  3.有限制条件的通配符的使用。
      ? extends A:
              G<? extends A> 可以作为G<A>和G<B>的父类，其中B是A的子类

      ? super A:
              G<? super A> 可以作为G<A>和G<B>的父类，其中B是A的父类

   */
    @Test
    public void test4() {

        List<? extends Person> list1 = null;
        List<? super Person> list2 = null;

        List<Student> list3 = new ArrayList<>();
        List<Person> list4 = new ArrayList<>();
        List<Object> list5 = new ArrayList<>();

        list1 = list3;
        list1 = list4;
//        list1 = list5;

//        list2 = list3;
        list2 = list4;
        list2 = list5;
        //读取数据：
        list1 = list3;
        Person p = list1.get(0);
        //编译不通过
        //Student s = list1.get(0);

        list2 = list4;
        Object obj = list2.get(0);
        ////编译不通过
//        Person obj = list2.get(0);

        //写入数据：
        //编译不通过
//        list1.add(new Student());

        //编译通过
        list2.add(new Person());
        list2.add(new Student());
    }
}
