package com.atguigu.exer;

public class AccountTest {

    public static void main(String[] args) {
        Account account1 = new Account();
        Account account2 = new Account("qwerty",2000);

        Account.setInterestRate(0.012);
        Account.setMinMoney(100);

        System.out.println(account1);
        System.out.println(account2);

        System.out.println(account1.getInterestRate());
        System.out.println(account1.getMinMoney());
    }
}
