
package com.swasthanepal.pojo;


public class DiseasePojo {
   private String d_name;
   private String d_symptom;
   private String d_description;
   private String d_treatment;
   private String d_date;
   private String d_location;
   private float d_temperature;
   private String org_code;
   private String user_id;
   private int trust_flag;

   DiseasePojo()
   {
       
   }

    public DiseasePojo(String d_name, String d_symptom, String d_description, String d_treatment, String d_date, String d_location, float d_temperature, String org_code, String user_id, int trust_flag) {
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
   
   
   
   
   
    public String getD_name() {
        return d_name;
    }

    public void setD_name(String d_name) {
        this.d_name = d_name;
    }

    public String getD_symptom() {
        return d_symptom;
    }

    public void setD_symptom(String d_symptom) {
        this.d_symptom = d_symptom;
    }

    public String getD_description() {
        return d_description;
    }

    public void setD_description(String d_description) {
        this.d_description = d_description;
    }

    public String getD_treatment() {
        return d_treatment;
    }

    public void setD_treatment(String d_treatment) {
        this.d_treatment = d_treatment;
    }

    public String getD_date() {
        return d_date;
    }

    public void setD_date(String d_date) {
        this.d_date = d_date;
    }

    public String getD_location() {
        return d_location;
    }

    public void setD_location(String d_location) {
        this.d_location = d_location;
    }

    public float getD_temperature() {
        return d_temperature;
    }

    public void setD_temperature(float d_temperature) {
        this.d_temperature = d_temperature;
    }

    public String getOrg_code() {
        return org_code;
    }

    public void setOrg_code(String org_code) {
        this.org_code = org_code;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public int getTrust_flag() {
        return trust_flag;
    }

    public void setTrust_flag(int trust_flag) {
        this.trust_flag = trust_flag;
    }
   
   
}
