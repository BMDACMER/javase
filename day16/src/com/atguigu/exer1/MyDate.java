package com.atguigu.exer1;

import java.util.Comparator;

/**
 * MyDate类包含:
 * private成员变量year,month,day；并为每一个属性定义 getter, setter 方法；
 */
public class MyDate implements Comparable {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public MyDate() {
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }


    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }


    @Override
    public boolean equals(Object obj) {
        return false;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof MyDate) {
            MyDate m = (MyDate) o;

            int minusYear = this.getYear() - m.getYear();
            if (minusYear != 0) {
                return minusYear;
            }

            int minusMonth = this.getMonth() - m.getMonth();
            if (minusMonth != 0) {
                return minusMonth;
            }

//            int minusDay = this.getDay() - m.getDay();
//            if (minusDay != 0) {
//                return minusDay;
//            }
            return this.getDay() - m.getDay();
        }
        throw new RuntimeException("传入的数据类型不一致！");

    }
}
