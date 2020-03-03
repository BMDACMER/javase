package com.atguigu.java8;

public class SuperClassTest {

    public static void main(String[] args) {
        SubClass s = new SubClass();
//知识点1：接口中定义的静态方法，只能通过接口来调用。
        CompareA.method1();
//知识点2：通过实现类的对象，可以调用接口中的默认方法。
        //如果实现类重写了接口中的默认方法，调用时，仍然调用的是重写以后的方法
        s.method2();


    }
}

class SubClass extends SuperClass implements CompareA, CompareB{

    public void method2(){
        System.out.println("SubClass: 上海");
    }

    public void method3(){
        System.out.println("SubClass: 深圳");
    }
    //知识点5：如何在子类(或实现类)的方法中调用父类、接口中被重写的方法
    public void myMethod(){
        method3();//调用自己定义的重写的方法
        super.method3();//调用的是父类中声明的
        //调用接口中的默认方法
        CompareA.super.method3();
        CompareB.super.method3();
    }
}