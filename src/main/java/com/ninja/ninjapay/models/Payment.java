package com.ninja.ninjapay.models;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ninja.ninjapay.api.FfdcApi;


public class Payment {

    private User user;
    private BigInteger amount;
    private String ccy;
    private String status;
    private String msg;
    private String scheme;
    private String paymentID;
    
    
    public Payment(User user, String amount, String ccy) {
    	this.user = user;
    	this.amount = new BigInteger(amount);
    	this.ccy = ccy;
    }
    
    public String initiate(FfdcApi api) {
    	setScheme(api.getSchemeAPI());
    	
    	return api.getSchemeAPI();
    }
    
    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }
    /**
     * @return the amount
     */
    public BigInteger getAmount() {
        return amount;
    }
    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }
    /**
     * @return the msg
     */
    public String getMsg() {
        return msg;
    }
    /**
     * @return the scheme
     */
    public String getScheme() {
        return scheme;
    }
    /**
     * @return the paymentID
     */
    public String getPaymentID() {
        return paymentID;
    }
    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }
    /**
     * @param amount the amount to set
     */
    public void setAmount(BigInteger amount) {
        this.amount = amount;
    }
    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
    /**
     * @param msg the msg to set
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }
    /**
     * @param scheme the scheme to set
     */
    public void setScheme(String scheme) {
        this.scheme = scheme;
    }
    /**
     * @param paymentID the paymentID to set
     */
    public void setPaymentID(String paymentID) {
        this.paymentID = paymentID;
    }
    
    
    

}
