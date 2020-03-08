package com.atguigu.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Collection接口中声明的方法的测试
 * 结论：
 * 向collection接口的实现类的对象中添加数据obj时，要求obj所在类要重写equals()
 */
public class CollectionTest {

    @Test
    public void test1(){
        Collection coll = new ArrayList();
        System.out.println("coll---------->" + coll);
        coll.add(123);
        coll.add(456);
        coll.add("789");
        coll.add(new java.lang.String("Tom"));
        boolean add = coll.add(new Person("Jerry",20));
        System.out.println("add----》" + add);
        coll.add(add);

        boolean contains = coll.contains(123);
        System.out.println("是否包含123: " + contains);
        System.out.println(coll.contains(new Person("Jerry",20)));  // 会输出5个Person equals()....  因为要跟上面的5个元素进行比较，最后一个先比较hashcode发现相同 就不比较equals了

        System.out.println("*******************************");
        Collection coll1 = Arrays.asList(123,456);
        System.out.println(coll1.contains(coll1));  // false
        System.out.println(coll1.containsAll(coll1));  // true

    }

    @Test
    public void test2(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry",20));
        coll.add(new String("Tom"));
        coll.add(false);

        coll.remove(1234);
        System.out.println(coll);    // [123, 456, Person{name='Jerry', age=20}, Tom, false]

        coll.remove(new Person("Jerry",20));
        System.out.println(coll);  // 比较三次的Person equals() 输出 [123, 456, Tom, false]

        Collection coll1 = Arrays.asList(123,456);
        coll.removeAll(coll1);
        System.out.println(coll); // [Tom, false]

    }

    @Test
    public void test3(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry",20));
        coll.add(new String("Tom"));
        coll.add(false);


//        Collection coll1 = Arrays.asList(123,456,789);
//        coll.retainAll(coll1);
//        System.out.println(coll);   // [123, 456]

        Collection coll2 = new ArrayList();
        coll2.add(456);
        coll2.add(123);
        coll2.add(new Person("Jerry",20));
        coll2.add(new String("Tom"));
        coll2.add(false);
        System.out.println("--------------------------");
        System.out.println("coll : " + coll);
        System.out.println("coll2 : " + coll2);
        System.out.println(coll.equals(coll2));  // false

    }

    @Test
    public void test4(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry",20));
        coll.add(new String("Tom"));
        coll.add(false);

        //7.hashCode():返回当前对象的哈希值
        System.out.println(coll.hashCode());  // -1200490100

        //8.集合 --->数组：toArray()
        Object[] arr = coll.toArray();
        for(int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }
        //拓展：数组 --->集合:调用Arrays类的静态方法asList()
        List<String> list = Arrays.asList(new String[]{"AA", "BB", "CC"});
        System.out.println(list);

        List arr1 = Arrays.asList(new int[]{123, 456});
        System.out.println(arr1.size());//1

        List arr2 = Arrays.asList(new Integer[]{123, 456});
        System.out.println(arr2.size());//2

        //9.iterator():返回Iterator接口的实例，用于遍历集合元素。放在IteratorTest.java中测试

    }
}


