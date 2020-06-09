package com.bx.kh.khprovider.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.bx.entity.Customer;
import com.bx.entity.Customerinfo;
import com.bx.entity.ResponseResult;

import com.bx.kh.khprovider.dao.CustomerDao;
import com.bx.kh.khprovider.dao.CustomerinfoDao;
import com.bx.service.CustomerinfoService;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.Random;

@Component
@Service(interfaceClass=CustomerinfoService.class)
public class CustomerinfoServiceImpl implements CustomerinfoService {



    @Resource
    private CustomerinfoDao customerinfoDao;

    @Resource
    private CustomerDao customerDao;

    @Override
    public ResponseResult addinfo(Customerinfo customerinfo) {
          ResponseResult rs=new ResponseResult();
          if(StringUtils.isEmpty(customerinfo)){
              rs.setFlag(0);
              rs.setData("传参为空");

          }
          if(StringUtils.isEmpty(customerinfo.getUserId())){
            rs.setFlag(1);
            rs.setData("用户编码为空");
        }
        if(StringUtils.isEmpty(customerinfo.getUserName())){
            rs.setFlag(2);
            rs.setData("姓名为空");
        }
        if(StringUtils.isEmpty(customerinfo.getBirthday())){
            rs.setFlag(3);
            rs.setData("生日为空");
        }
        if(StringUtils.isEmpty(customerinfo.getPhone())){
            rs.setFlag(4);
            rs.setData("手机号为空");
        }
        if(StringUtils.isEmpty(customerinfo.getAddress())){
            rs.setFlag(5);
            rs.setData("地址为空");
        }
        if(StringUtils.isEmpty(customerinfo.getSex())){
            rs.setFlag(6);
            rs.setData("性别为空");
        }
        if(StringUtils.isEmpty(customerinfo.getEmail())){
            rs.setFlag(7);
            rs.setData("电子邮箱为空");
        }
        if(StringUtils.isEmpty(customerinfo.getIdentityCard())){
            rs.setFlag(8);
            rs.setData("身份证号为空");
        }
         if(StringUtils.isEmpty(customerinfo.getType())){
              customerinfo.setType(3);
         }
        int flag=customerinfoDao.addinfo(customerinfo);
        System.out.println(flag);

        char b = (char) (Math.random()*26+'A');
        String a = "";
        Random random = new Random();
        for(int i=0;i<4;i++){
            String charOrNum = "num";
            a+=String.valueOf(random.nextInt(10));
        }
          String c=b+a;

          if(flag>0){
              Customer cu=new Customer();
              cu.setCid(c);
              cu.setUid(customerinfo.getUserId());
              cu.setCreateorId("1");
              cu.setSource(0);
              cu.setStateus(0);
              int  st=customerDao.addCust(cu);
              rs.setFlag(9);
              rs.setData("添加成功");
          }

        return rs;
    }


}
