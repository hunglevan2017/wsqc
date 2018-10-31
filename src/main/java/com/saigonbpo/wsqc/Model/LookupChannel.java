package com.saigonbpo.wsqc.Model;

import java.util.Date;

public class LookupChannel {
    private Integer id;

    private String ccCode;

    private String channel;

    private String province;

    private String posCode;

    private String posName;

    private String ccName;

    private String ccPassword;

    private String ccRole;

    private Integer parentId;

    private String email;

    private String company;

    private String ccPhonenumber;

    private String deviceModel;

    private String securityKey;

    private Short isAndroid;

    private Date dateOfUserCreation;

    private String creator;

    private Boolean isEnable;

    private Date lastLogin;

    private Date lastPwdChange;

    private Boolean isPwdChanged;

    private Date lastUpdate;

    private String notes;

    private String bcrypt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCcCode() {
        return ccCode;
    }

    public void setCcCode(String ccCode) {
        this.ccCode = ccCode;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPosCode() {
        return posCode;
    }

    public void setPosCode(String posCode) {
        this.posCode = posCode;
    }

    public String getPosName() {
        return posName;
    }

    public void setPosName(String posName) {
        this.posName = posName;
    }

    public String getCcName() {
        return ccName;
    }

    public void setCcName(String ccName) {
        this.ccName = ccName;
    }

    public String getCcPassword() {
        return ccPassword;
    }

    public void setCcPassword(String ccPassword) {
        this.ccPassword = ccPassword;
    }

    public String getCcRole() {
        return ccRole;
    }

    public void setCcRole(String ccRole) {
        this.ccRole = ccRole;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCcPhonenumber() {
        return ccPhonenumber;
    }

    public void setCcPhonenumber(String ccPhonenumber) {
        this.ccPhonenumber = ccPhonenumber;
    }

    public String getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }

    public String getSecurityKey() {
        return securityKey;
    }

    public void setSecurityKey(String securityKey) {
        this.securityKey = securityKey;
    }

    public Short getIsAndroid() {
        return isAndroid;
    }

    public void setIsAndroid(Short isAndroid) {
        this.isAndroid = isAndroid;
    }

    public Date getDateOfUserCreation() {
        return dateOfUserCreation;
    }

    public void setDateOfUserCreation(Date dateOfUserCreation) {
        this.dateOfUserCreation = dateOfUserCreation;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Boolean getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(Boolean isEnable) {
        this.isEnable = isEnable;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public Date getLastPwdChange() {
        return lastPwdChange;
    }

    public void setLastPwdChange(Date lastPwdChange) {
        this.lastPwdChange = lastPwdChange;
    }

    public Boolean getIsPwdChanged() {
        return isPwdChanged;
    }

    public void setIsPwdChanged(Boolean isPwdChanged) {
        this.isPwdChanged = isPwdChanged;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getBcrypt() {
        return bcrypt;
    }

    public void setBcrypt(String bcrypt) {
        this.bcrypt = bcrypt;
    }
}