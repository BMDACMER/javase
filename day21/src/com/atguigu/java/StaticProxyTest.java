package com.atguigu.java;

interface clothFactory{

    void produceCloth();

}

// 被代理类
class NikeClothFactory implements clothFactory{

    @Override
    public void produceCloth() {
        System.out.println("Nike 工厂生产一批运动服");
    }
}

// 代理类
class ProxyClothFactory implements clothFactory{

    private clothFactory factory;   // 用被代理类对象进行实例化

    public ProxyClothFactory(clothFactory factory){
        this.factory = factory;
    }
    @Override
    public void produceCloth() {
        System.out.println("代理工厂做一些准备工作");
        factory.produceCloth();
        System.out.println("代理工厂做一些收尾工作");
    }
}

public class StaticProxyTest {
    public static void main(String[] args) {
        // 创建被代理类的对象
        clothFactory nike = new NikeClothFactory();
        // 创建代理类的对象
        ProxyClothFactory proxyClothFactory = new ProxyClothFactory(nike);
        proxyClothFactory.produceCloth();
    }
}
