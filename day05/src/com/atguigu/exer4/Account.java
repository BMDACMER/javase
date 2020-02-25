package com.atguigu.exer4;

public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

   // 取钱
    public void withdraw(double amt){
        if (balance >= amt){
            balance -= amt;
            System.out.println("取了" + amt + "块钱，取钱成功！");
        } else {
            System.out.println("余额不足");
        }
    }

    // 存钱
    public void deposit(double amt){
        if (amt > 0){
            balance += amt;
            System.out.println("存了" + amt + "快钱，交易成功！");
        } else{
            System.out.println("输入不合法，必须存入大于0的数字");
        }
    }
}
