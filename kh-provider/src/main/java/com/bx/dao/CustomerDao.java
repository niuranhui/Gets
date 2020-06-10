package com.bx.dao;

import com.bx.entity.Customer;
import com.bx.entity.CustomerPartment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * (Customer)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-05 22:19:09
 */
@Mapper
public interface CustomerDao {

    /**
     * 客户信息查询
     * @param partment
     * @return
     */
    List<Customer> CustomerList( CustomerPartment partment);

    /**
     * 查询数据
     * @param
     * @return
     */
    int CountCustomer(CustomerPartment partment);
    /**
     * 通过ID查询单条数据
     *
     * @param
     * @return 实例对象
     */
    //Customer queryById( );

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    //List<Customer> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param customer 实例对象
     * @return 对象列表
     */
    //List<Customer> queryAll(Customer customer);

    /**
     * 新增数据
     *
     * @param customer 实例对象
     * @return 影响行数
     */
    //int insert(Customer customer);

    /**
     * 修改数据
     *
     * @param customer 实例对象
     * @return 影响行数
     */
    //int update(Customer customer);

    /**
     * 通过主键删除数据
     *
     * @param
     * @return 影响行数
     */
    //int deleteById( );

}