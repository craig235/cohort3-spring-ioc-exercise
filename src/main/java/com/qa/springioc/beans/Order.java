package com.qa.springioc.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Order {
    private int id;
    private int customerId;
    private double orderValue;
    private String orderDate;

    public void init() {
        System.out.println("Init method of Order Bean");
    }

    /*
     * Will be called only for singleton instances
     */
    public void destroy() {
        System.out.println("Destroy method of Order Bean");
    }
}
