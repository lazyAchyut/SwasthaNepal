
package com.swasthanepal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;


@Entity
@Table(name="DISEASE")
//@XmlRootElement(name="disease")
//@XmlType(propOrder={"d_id","d_name","d_symptom","d_description","d_treatment","d_date","d_location","d_temperature","org_code","trust_flag","user_id"})

public class Disease {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="d_id")
    private int d_id;
    
    @Column(name="d_name")
    private String d_name;
    
    @Column(name="d_symptom")
    private String d_symptom;
    
    @Column(name="d_description")
    private String d_description;
    
    @Column(name="d_treatment")
    private String d_treatment;
    
   @Column(name="d_date")
    private String d_date;
    
    @Column(name="d_location")
    private String d_location;
    
    @Column(name="d_temperature")
    private float d_temperature;
   
    @Column(name="org_code")
    private String org_code;
    
    @Column(name="trust_flag")
    private int trust_flag;
    
    @Column(name="user_id")
    private String user_id;

        public Disease()
        {
            
        }
       public Disease(int id, String d_name, String d_symptom, String d_description, String d_treatment, String d_date, String d_location, float d_temperature, String org_code, String user_id, int trust_flag) {
        this.d_id = id;
        this.d_name = d_name;
        this.d_symptom = d_symptom;
        this.d_description = d_description;
        this.d_treatment = d_treatment;
        this.d_date = d_date;
        this.d_location = d_location;
        this.d_temperature = d_temperature;
        this.org_code = org_code;
        this.user_id = user_id;
        this.trust_flag = trust_flag;
    }
       
    public Disease(String d_name, String d_symptom, String d_description, String d_treatment, String d_date, String d_location, float d_temperature, String org_code, String user_id, int trust_flag) {
        this.d_name = d_name;
        this.d_symptom = d_symptom;
        this.d_description = d_description;
        this.d_treatment = d_treatment;
        this.d_date = d_date;
        this.d_location = d_location;
        this.d_temperature = d_temperature;
        this.org_code = org_code;
        this.user_id = user_id;
        this.trust_flag = trust_flag;
    }
    
    
       
    
    
   @XmlElement
    public int getD_id() {
        return d_id;
    }

    public void setD_id(int d_id) {
        this.d_id = d_id;
    }

    @XmlElement
    public String getD_description() {
        return d_description;
    }

    public void setD_description(String d_description) {
        this.d_description = d_description;
    }

    @XmlElement
    public String getD_name() {
        return d_name;
    }

    public void setD_name(String d_name) {
        this.d_name = d_name;
    }

    @XmlElement
    public String getD_symptom() {
        return d_symptom;
    }

    public void setD_symptom(String d_symptom) {
        this.d_symptom = d_symptom;
    }

    @XmlElement
    public String getD_treatment() {
        return d_treatment;
    }

    public void setD_treatment(String d_treatment) {
        this.d_treatment = d_treatment;
    }

    @XmlElement
    public String getD_date() {
        return d_date;
    }

    public void setD_date(String d_date) {
        this.d_date = d_date;
    }

    @XmlElement
    public String getD_location() {
        return d_location;
    }

    public void setD_location(String d_location) {
        this.d_location = d_location;
    }

    @XmlElement
    public float getD_temperature() {
        return d_temperature;
    }

    public void setD_temperature(float d_temperature) {
        this.d_temperature = d_temperature;
    }

    @XmlElement
    public String getOrg_code() {
        return org_code;
    }

    public void setOrg_code(String org_code) {
        this.org_code = org_code;
    }

    @XmlElement
    public int getTrust_flag() {
        return trust_flag;
   }

    public void setTrust_flag(int trust_flag) {
        this.trust_flag = trust_flag;
    }

    @XmlElement
    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
 
    
    
    
}
