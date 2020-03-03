package com.atguigu.java2;

/**
 * public interface Comparable<T>此接口强行对实现它的每个类的对象进行整体排序。
 * 这种排序被称为类的自然排序，类的 compareTo 方法被称为它的自然比较方法。
 */
public class InnerClassTest1 {

    // 开发中很少见
    public void method(){
        // 局部类
        class AA{

        }
    }

    // 返回一个实现了Comparable接口的类的对象
    public Comparable getComparable(){
        //创建一个实现了Comparable接口的类:局部内部类
        //方式一：
//		class MyComparable implements Comparable{
//
//			@Override
//			public int compareTo(Object o) {
//				return 0;
//			}
//
//		}
//
//		return new MyComparable();

        // 方式二：
        return new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
    }
}
