package com.kgc.util;

import java.text.ParseException;
import java.util.Date;

/***
 * 生成token的工具类
 */
public class TokenUtils {

    public static String createToken(String prifix,String tail){
        String token= null;
        try {
            String timestemp=DateUtil.format(new Date(),"YYYY-MM-dd hh:mm:ss");
            String source=prifix+tail+timestemp;
            token= MD5.getMd5(source,16);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return token;
    }


    /**
     * 生成保单编号
     * @param prefix
     * @param enterpriseCode
     * @return
     */
    public static String createPolicyId(String prefix,String enterpriseCode){
        String token = null;
        try {

            String timestemp=DateUtil.format(new Date(),"YYYY-MM-dd hh:mm:ss");
            token = SecurityUtils.md5Hex(
                    prefix+timestemp+enterpriseCode);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return token;
    }

    /**
     * 生成客户编号
     * @param prefix
     * @param cName
     * @return
     */
    public static String createCustomerCode(String prefix,String cName){
        String token = null;
        try {

            String timestemp=DateUtil.format(new Date(),"YYYY-MM-dd hh:mm:ss");
            token = SecurityUtils.md5Hex(
                    prefix+cName+timestemp);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return token;
    }

}
