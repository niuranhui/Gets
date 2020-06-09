package com.bx.kh.khprovider.dao;

import com.bx.entity.Customer;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CustomerDao {

    int addCust(Customer customer);

}
