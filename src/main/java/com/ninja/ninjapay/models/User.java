package com.ninja.ninjapay.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "user")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)    
    private Long id;
    
    private String uname;
    private String fname;
    private String lname;
    private String mobile;
    private String email;
    private String password;
    @Column(name = "baccount")
    private String bankAccount;
    @Column(name = "validated")
    private Boolean validBankAccount;
    @Column(name = "linked")
    private Boolean mobileLink;
    
//    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
//    @Column(name = "created")
//    private Timestamp accountCreated;
//    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
//    @Column(name = "modifiedon")
//    private Timestamp lastModified;
    
    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }
    /**
     * @return the uname
     */
    public String getUname() {
        return uname;
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
     * @return the password
     */
    public String getPassword() {
        return password;
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
//    /**
//     * @return the accountCreated
//     */
//    public Timestamp getAccountCreated() {
//        return accountCreated;
//    }
//    /**
//     * @return the lastModified
//     */
//    public Timestamp getLastModified() {
//        return lastModified;
//    }
    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }
    /**
     * @param uname the uname to set
     */
    public void setUname(String uname) {
        this.uname = uname;
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
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
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
//    /**
//     * @param accountCreated the accountCreated to set
//     */
//    public void setAccountCreated(Timestamp accountCreated) {
//        this.accountCreated = accountCreated;
//    }
//    /**
//     * @param lastModified the lastModified to set
//     */
//    public void setLastModified(Timestamp lastModified) {
//        this.lastModified = lastModified;
//    }    
    
    public String getFullname() {
        return getFname() + " " + getLname();
    }

}
