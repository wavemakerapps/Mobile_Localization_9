/*Generated by WaveMaker Studio*/
package com.mobile_localization.hrdb.models.query;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

import com.wavemaker.runtime.data.annotations.ColumnAlias;

public class HrdbUserDataResponse implements Serializable {


    @ColumnAlias("USER_ID")
    private BigInteger userId;

    @ColumnAlias("USERNAME")
    private String username;

    @ColumnAlias("PASSWORD")
    private String password;

    @ColumnAlias("ROLE")
    private String role;

    @ColumnAlias("TENANT_ID")
    private BigInteger tenantId;

    public BigInteger getUserId() {
        return this.userId;
    }

    public void setUserId(BigInteger userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public BigInteger getTenantId() {
        return this.tenantId;
    }

    public void setTenantId(BigInteger tenantId) {
        this.tenantId = tenantId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HrdbUserDataResponse)) return false;
        final HrdbUserDataResponse hrdbUserDataResponse = (HrdbUserDataResponse) o;
        return Objects.equals(getUserId(), hrdbUserDataResponse.getUserId()) &&
                Objects.equals(getUsername(), hrdbUserDataResponse.getUsername()) &&
                Objects.equals(getPassword(), hrdbUserDataResponse.getPassword()) &&
                Objects.equals(getRole(), hrdbUserDataResponse.getRole()) &&
                Objects.equals(getTenantId(), hrdbUserDataResponse.getTenantId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserId(),
                getUsername(),
                getPassword(),
                getRole(),
                getTenantId());
    }
}