package com.bx.entity;

import java.util.List;

public class CustomerPage extends Page {

    List<Customer> customerList;

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }
}
