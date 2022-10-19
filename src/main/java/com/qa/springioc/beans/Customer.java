package com.qa.springioc.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@AllArgsConstructor
@Getter
@ToString
public class Customer {
    private int id;
    private String name;
    private String email;
    private String contactNo;
    private List<Order> ordersList;

    public void init() {
        System.out.println("Init method of Customer Bean");
    }

    /*
     * Will be called only for singleton instances
     */
    public void destroy() {
        System.out.println("Destroy method of Customer Bean");
    }
}
