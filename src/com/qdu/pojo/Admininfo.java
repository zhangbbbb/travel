package com.qdu.pojo;
// Generated 2019-4-9 19:55:57 by Hibernate Tools 4.3.1



/**
 * Admininfo generated by hbm2java
 */
public class Admininfo  implements java.io.Serializable {


     private String adminId;
     private String adminPassword;

    public Admininfo() {
    }

    public Admininfo(String adminId, String adminPassword) {
       this.adminId = adminId;
       this.adminPassword = adminPassword;
    }
   
    public String getAdminId() {
        return this.adminId;
    }
    
    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }
    public String getAdminPassword() {
        return this.adminPassword;
    }
    
    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }




}


