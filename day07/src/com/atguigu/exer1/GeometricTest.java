package com.atguigu.exer1;

/**
 * * 定义一个测试类GeometricTest，
 * 编写equalsArea方法测试两个对象的面积是否相等（注意方法的参数类型，利用动态绑定技术），
 * 编写displayGeometricObject方法显示对象的面积（注意方法的参数类型，利用动态绑定技术）。
 */
public class GeometricTest {
    public static void main(String[] args) {
        GeometricTest test = new GeometricTest();
        Circle c1 = new Circle(3.3, "白色", 1.0);
        Circle c2 = new Circle(3.3,"白色",1.0);
        System.out.println("c1和c2的面积是否相等：" + test.equalsArea(c1,c2));
        System.out.println("C1的面积为：");
        test.displayGeometricObject(c1);
        System.out.println("C2的面积为：");
        test.displayGeometricObject(c2);

        System.out.println("===================================");

        MyRectangle myRectangle = new MyRectangle(2.1,3.4,"红色",2.0);
        test.displayGeometricObject(myRectangle);
    }

    public boolean equalsArea(GeometricObject o1, GeometricObject o2) {
        return o1.findArea() == o2.findArea();
    }

    public void displayGeometricObject(GeometricObject o) {
        System.out.println("面积为：" + o.findArea());
    }
}
