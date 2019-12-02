package com.ninja.ninjapay.models;

import java.sql.Date;

public class User {
    private String id;
    private String uname;
    private String fname;
    private String lname;
    private String mobile;
    private String email;
    private String bankAccount;
    private Boolean validBankAccount;
    private Boolean mobileLink;
    private Date accountCreated;
    private Date lastModified;
    
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }
    /**
     * @return the fname
     */
    public String getFname() {
        return fname;
    }
    /**
     * @return the lname
     */
    public String getLname() {
        return lname;
    }
    /**
     * @return the mobile
     */
    public String getMobile() {
        return mobile;
    }
    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }
    /**
     * @return the bankAccount
     */
    public String getBankAccount() {
        return bankAccount;
    }
    /**
     * @return the validBankAccount
     */
    public Boolean getValidBankAccount() {
        return validBankAccount;
    }
    /**
     * @return the mobileLink
     */
    public Boolean getMobileLink() {
        return mobileLink;
    }
    /**
     * @return the accountCreated
     */
    public Date getAccountCreated() {
        return accountCreated;
    }
    /**
     * @return the lastModified
     */
    public Date getLastModified() {
        return lastModified;
    }
    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
     * @param fname the fname to set
     */
    public void setFname(String fname) {
        this.fname = fname;
    }
    /**
     * @param lname the lname to set
     */
    public void setLname(String lname) {
        this.lname = lname;
    }
    /**
     * @param mobile the mobile to set
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * @param bankAccount the bankAccount to set
     */
    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }
    /**
     * @param validBankAccount the validBankAccount to set
     */
    public void setValidBankAccount(Boolean validBankAccount) {
        this.validBankAccount = validBankAccount;
    }
    /**
     * @param mobileLink the mobileLink to set
     */
    public void setMobileLink(Boolean mobileLink) {
        this.mobileLink = mobileLink;
    }
    /**
     * @param accountCreated the accountCreated to set
     */
    public void setAccountCreated(Date accountCreated) {
        this.accountCreated = accountCreated;
    }
    /**
     * @param lastModified the lastModified to set
     */
    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }    

}
