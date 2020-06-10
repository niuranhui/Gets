package com.bx.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.bx.dao.CustomerDao;
import com.bx.entity.Customer;
import com.bx.entity.CustomerPage;
import com.bx.entity.CustomerPartment;
import com.bx.service.CustomerService;
import org.springframework.stereotype.Component;


import javax.annotation.Resource;
import java.util.List;

/**
 * (Customer)表服务实现类
 *
 * @author makejava
 * @since 2020-06-06 14:33:02
 */
@Component
@Service(interfaceClass = CustomerService.class)
public class CustomerServiceImpl implements CustomerService {
    @Resource
    private CustomerDao customerDao;

    @Override
    public CustomerPage CustomerList(CustomerPartment partment) {
        int count = customerDao.CountCustomer(partment);
        partment.setPageIndex((partment.getCurPage()-1)*partment.getPageSize());
        List<Customer> list=customerDao.CustomerList(partment);
        CustomerPage page=new CustomerPage();
        page.setTotalCount(count);
        page.setCustomerList(list);
        page.setCurPage(partment.getCurPage());
        page.setPageSize(partment.getPageSize());
        page.setTotalPageCount((count/page.getPageSize())+((count%page.getPageSize())==0?0:1));
        return page;
    }












}