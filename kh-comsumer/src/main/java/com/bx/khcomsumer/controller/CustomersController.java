package com.bx.khcomsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import com.bx.entity.Customerinfo;
import com.bx.entity.ResponseResult;
import com.bx.service.CustomerinfoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CustomersController {

    @Reference
    private CustomerinfoService customerinfoService;



    @ResponseBody
    @RequestMapping(value = "/cus",method = RequestMethod.POST)
    public Object addst(Customerinfo customerinfo) {

        ResponseResult rs=customerinfoService.addinfo(customerinfo);
        return JSON.toJSONString(rs);


    }


}
