package com.atguigu.exer;

/*
 * 在PersonTest类中实例化Person类的对象b，
 * 调用setAge()和getAge()方法，体会Java的封装性。
 *
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.setAge(25);

        System.out.println("年龄为：" + p1.getAge());

        Person p2 = new Person(26,"Tom");
        System.out.println("name = " + p2.getName() + ",age = " + p2.getAge());

    }
}
