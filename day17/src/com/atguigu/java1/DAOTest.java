package com.atguigu.java1;

import org.junit.Test;

import java.util.List;

public class DAOTest {
    @Test
    public void test(){
        CustomerDAO dao1 = new CustomerDAO();

        dao1.add(new Customer());
        List<Customer> list = dao1.getForList(10);

        StudentDAO dao2 = new StudentDAO();
        dao2.add(new Student());
        List<Student> forList = dao2.getForList(5);
    }
}
