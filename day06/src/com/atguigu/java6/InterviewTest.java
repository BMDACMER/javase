package com.atguigu.java6;

import com.atguigu.java5.AnimalTest;

import java.util.Random;

// 面试题：多态是编译时行为还是运行时行为？
// 证明如下：
public class InterviewTest {

    public static Animal getInstance(int key) {
        switch (key){
            case 0:
                return new Cat();
            case 1:
                return new Dog();
            default:
                return new Sheep();
        }
    }

    public static void main(String[] args) {
        int key = new Random().nextInt(3);

        System.out.println(key);
        Animal animal = getInstance(key);
        animal.eat();
    }
}

class Animal {
    protected void eat(){
        System.out.println("animal eat food");
    }
}

class Cat extends Animal{
    protected void eat(){
        System.out.println("cat eat fish");
    }
}

class Dog extends Animal{
    public void eat(){
        System.out.println("Dog eat bone");
    }
}

class Sheep extends Animal{
    public void eat(){
        System.out.println("Sheep eat grass");
    }
}
