package com.atguigu.java1;

/**
 * 使用同步机制将单例模式中的懒汉式改写为线程安全的
 */
public class BankTest {

}

class Bank {
    private Bank() {
    }

    private static Bank instance = null;

    private static Bank getInstance() {
        // 注意：必須判斷連詞instance
        if (instance == null) {
            synchronized (Bank.class) {
                if (instance == null) {
                    instance = new Bank();
                }
            }
        }
        return instance;
    }

}
