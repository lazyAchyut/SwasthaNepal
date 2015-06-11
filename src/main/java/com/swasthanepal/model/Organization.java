
package com.swasthanepal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Organization")
public class Organization {
    
    @Id
    @Column(name="org_code")
    private String org_code;
    
    @Column(name="org_name")
    private String org_name;
    
    @Column(name="org_address")
    private String org_address;
    
    @Column(name="org_description")
    private String org_description;
    
    @Column(name="org_contact")
    private String org_contact;

    public Organization() {
    }

    public Organization(String org_code, String org_name, String org_address, String org_description, String org_contact) {
        this.org_code = org_code;
        this.org_name = org_name;
        this.org_address = org_address;
        this.org_description = org_description;
        this.org_contact = org_contact;
    }

    public Organization(String org_name, String org_address, String org_description, String org_contact) {
        this.org_name = org_name;
        this.org_address = org_address;
        this.org_description = org_description;
        this.org_contact = org_contact;
    }

    public String getOrg_code() {
        return org_code;
    }

    public void setOrg_code(String org_code) {
        this.org_code = org_code;
    }

    public String getOrg_name() {
        return org_name;
    }

    public void setOrg_name(String org_name) {
        this.org_name = org_name;
    }

    public String getOrg_address() {
        return org_address;
    }

    public void setOrg_address(String org_address) {
        this.org_address = org_address;
    }

    public String getOrg_description() {
        return org_description;
    }

    public void setOrg_description(String org_description) {
        this.org_description = org_description;
    }

    public String getOrg_contact() {
        return org_contact;
    }

    public void setOrg_contact(String org_contact) {
        this.org_contact = org_contact;
    }

    
    
    
}
