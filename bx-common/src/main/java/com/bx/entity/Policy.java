package com.bx.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Policy)实体类
 *
 * @author makejava
 * @since 2020-06-04 23:36:53
 */
public class Policy implements Serializable {
    private static final long serialVersionUID = -25215617747711290L;
    /**
    * 保单编号
    */
    private String policyid;
    /**
    * 投保险人编号
    */
    private String policyholderid;
    /**
    * 被保险人编号
    */
    private String insuredid;
    /**
    * 受益人编号
    */
    private String benefid;
    /**
    * 保险险种产品编号
    */
    private Integer productid;
    /**
    * 保险险种套餐编号
    */
    private Integer packageid;
    /**
    * 本年度保险的缴费金额
    */
    private Object policymoney;
    /**
    * 缴费年限
    */
    private Integer paymentdate;
    /**
    * 保单状态：0：未审核；1：正在进行一级审核；2：一级审核驳回；3：一级审核审核通过；4：二级审核正在进行；5：二级审核驳回:6：二级审核通过；默认：0
    */
    private Integer status;
    /**
    * 保单的创建时间
    */
    private Date createtiem;
    /**
    * 保单审核通过扣款之后的生效日期
    */
    private Date policystarttime;
    /**
    * 保单审核通过扣款之后的合同编号
    */
    private String contractid;
    /**
    * 保单下次扣费日期
    */
    private Object policynexttime;
    /**
    * 保险保单到期日期
    */
    private Object policyendtime;
    /**
    * 维护保单的员工编号
    */
    private String staffid;
    /**
    * 保单缴费使用银行卡的编号
    */
    private String bankid;


    public String getPolicyid() {
        return policyid;
    }

    public void setPolicyid(String policyid) {
        this.policyid = policyid;
    }

    public String getPolicyholderid() {
        return policyholderid;
    }

    public void setPolicyholderid(String policyholderid) {
        this.policyholderid = policyholderid;
    }

    public String getInsuredid() {
        return insuredid;
    }

    public void setInsuredid(String insuredid) {
        this.insuredid = insuredid;
    }

    public String getBenefid() {
        return benefid;
    }

    public void setBenefid(String benefid) {
        this.benefid = benefid;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public Integer getPackageid() {
        return packageid;
    }

    public void setPackageid(Integer packageid) {
        this.packageid = packageid;
    }

    public Object getPolicymoney() {
        return policymoney;
    }

    public void setPolicymoney(Object policymoney) {
        this.policymoney = policymoney;
    }

    public Integer getPaymentdate() {
        return paymentdate;
    }

    public void setPaymentdate(Integer paymentdate) {
        this.paymentdate = paymentdate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreatetiem() {
        return createtiem;
    }

    public void setCreatetiem(Date createtiem) {
        this.createtiem = createtiem;
    }

    public Date getPolicystarttime() {
        return policystarttime;
    }

    public void setPolicystarttime(Date policystarttime) {
        this.policystarttime = policystarttime;
    }

    public String getContractid() {
        return contractid;
    }

    public void setContractid(String contractid) {
        this.contractid = contractid;
    }

    public Object getPolicynexttime() {
        return policynexttime;
    }

    public void setPolicynexttime(Object policynexttime) {
        this.policynexttime = policynexttime;
    }

    public Object getPolicyendtime() {
        return policyendtime;
    }

    public void setPolicyendtime(Object policyendtime) {
        this.policyendtime = policyendtime;
    }

    public String getStaffid() {
        return staffid;
    }

    public void setStaffid(String staffid) {
        this.staffid = staffid;
    }

    public String getBankid() {
        return bankid;
    }

    public void setBankid(String bankid) {
        this.bankid = bankid;
    }

}