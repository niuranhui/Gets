package com.bx.khcomsumer.Controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import com.bx.entity.CustomerPage;
import com.bx.entity.CustomerPartment;
import com.bx.entity.ResponseResult;
import com.bx.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class CustomerController {
    @Reference
    private CustomerService service;
    /**
     * 全查
     * @param
     * @param model
     * @return
     */
    @RequestMapping(value = "/khList",method = RequestMethod.GET)

    public String getVipList(CustomerPartment partment, Model model) {
        CustomerPage page = service.CustomerList(partment);
        model.addAttribute("page",page);
        return JSON.toJSONString(page);
    }
}
