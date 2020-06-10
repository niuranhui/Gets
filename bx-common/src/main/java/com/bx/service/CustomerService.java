package com.bx.service;

import com.bx.entity.Customer;
import com.bx.entity.CustomerPage;
import com.bx.entity.CustomerPartment;

import java.util.List;

/**
 * (Customer)表服务接口
 *
 * @author makejava
 * @since 2020-06-06 14:21:42
 */
public interface CustomerService {

    CustomerPage CustomerList(CustomerPartment partment);
}