package com.atguigu.java;

public class WindowTest1 {
    public static void main(String[] args) {
       Window1 t1 =  new Window1();
       Window1 t2 = new Window1();
       Window1 t3 = new Window1();

       t1.setName("窗口1");
       t2.setName("窗口2");
       t3.setName("窗口3");

       t1.start();
       t2.start();
       t3.start();
    }
}

class Window1 extends Thread{

    private static int ticket = 100;

    @Override
    public void run() {
        while (true) {
            if (ticket > 0) {
                System.out.println(getName() + ": 买票，票号为：" + ticket);
                ticket--;
            }else {
                break;
            }
        }
    }
}
