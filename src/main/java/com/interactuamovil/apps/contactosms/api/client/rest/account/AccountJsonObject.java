package com.interactuamovil.apps.contactosms.api.client.rest.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.interactuamovil.apps.contactosms.api.utils.JsonDateTimeDeserializer;
import com.interactuamovil.apps.contactosms.api.utils.JsonDateTimeSerializer;
import com.interactuamovil.apps.contactosms.api.utils.JsonObject;

import java.util.Date;

/**
 * Created by javier on 1/02/16.
 * Account json object response
 */
public class AccountJsonObject extends JsonObject {

    @JsonProperty("account_id")
    private Integer accountId;
    @JsonProperty("account_name")
    private String accountName;
    @JsonProperty("sms_short_name")
    private String smsShortName;
    @JsonProperty("account_status")
    private String accountStatus;
    @JsonProperty("created_on")
    private Date createdOn;
    @JsonProperty("current_package")
    private PackageJsonObject currentPackage;


    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getSmsShortName() {
        return smsShortName;
    }

    public void setSmsShortName(String smsShortName) {
        this.smsShortName = smsShortName;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    @JsonSerialize(using = JsonDateTimeSerializer.class)
    public Date getCreatedOn() {
        return createdOn;
    }

    @JsonDeserialize(using = JsonDateTimeDeserializer.class)
    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public PackageJsonObject getCurrentPackage() {
        return currentPackage;
    }

    public void setCurrentPackage(PackageJsonObject currentPackage) {
        this.currentPackage = currentPackage;
    }
}
