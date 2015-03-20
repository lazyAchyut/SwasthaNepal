
package com.swasthanepal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;

@Entity
@Table(name="User")
public class User {
    
    @Id
    @Column(name="user_id")
    private String user_id;   
    
   @XmlElement
    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

   
    
  
   
    
    
    
    
    
}
