package com.qa.springioc;

import com.qa.springioc.beans.Customer;
import com.qa.springioc.beans.Order;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        System.out.println("--- 1 ---");

        Customer cus1 = context.getBean("cus1", Customer.class);
        System.out.println(cus1.toString());


        System.out.println("--- 2 ---");

        Order order1 = context.getBean("order1", Order.class);
        System.out.println(order1.toString());

        System.out.println("--- 3 ---");

        Order order2 = context.getBean("order2", Order.class);
        System.out.println(order2.toString());

        System.out.println("--- 4 ---");
        System.out.println(cus1.getOrdersList().get(0) == order1);
        System.out.println(cus1.getOrdersList().get(1) == order1);
    }
}
