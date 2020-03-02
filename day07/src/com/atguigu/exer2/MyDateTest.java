package com.atguigu.exer2;

import java.util.Objects;

public class MyDateTest {

    public static void main(String[] args) {
        MyDate m1 = new MyDate(14,3,1976);
        MyDate m2 = new MyDate(14,3,1976);
        if (m1 == m2){
            System.out.println("m1==m2");
        } else {
            System.out.println("m1!=m2"); // 引用类型 比较的是地址，因为两个对象地址不同 故 m1!=m2
        }

        if (m1.equals(m2)) {
            System.out.println("m1 is equal to m2"); // 引用对象重写equals后比较的是值 m1 is equal to m2
        } else {
            System.out.println("m1 is not equal to m2");
        }

        if (m1.hashCode() == m2.hashCode()){
            System.out.println("m1 hashCode equals m2");  // m1 hashCode equals m2
        } else {
            System.out.println("m1 hashCode not equals m2");
        }
    }
}

class MyDate{
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyDate)) return false;
        MyDate myDate = (MyDate) o;
        return getDay() == myDate.getDay() &&
                getMonth() == myDate.getMonth() &&
                getYear() == myDate.getYear();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getDay(), getMonth(), getYear());
    }
}
