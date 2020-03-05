package com.atguigu.java;

/**
 * 多线程创建方式一：  继承于Thread类
 * 1、创建一个继承于Thread类的子类
 * 2、重写Thread类的run()方法   ------>  将此线程执行的操作声明在run()中
 * 3、创建Thread类的子类的对象
 * 4、通过此对象调用start()
 * <p>
 *     例子：  遍历100以内的所有的偶数
 * </p>

 *
 * 注意： 不能调用t1.run()方法
 *   同一线程在启动一线程，不可以还让已经start()的线程去执行。会报IllegalThreadStateException错误
 */
public class ThreadTest {
    public static void main(String[] args) {
        // 3、创建Thread类的子类的对象
        MyThread t1 = new MyThread();

        // 4、通过此对象调用start()
        t1.start();
        //问题一：我们不能通过直接调用run()的方式启动线程。
//        t1.run();

        //问题二：再启动一个线程，遍历100以内的偶数。不可以还让已经start()的线程去执行。会报IllegalThreadStateException
//        t1.start();
        MyThread t2 = new MyThread();
        t2.start();

        // 如下操作实是在main方法中执行的
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + "*************************" + i);
            }
        }
    }

}

//1、创建一个继承于Thread类的子类
class MyThread extends Thread{
    //2、重写Thread类的run()方法   ------>  将此线程执行的操作声明在run()中


    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}