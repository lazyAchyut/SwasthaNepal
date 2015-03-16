
package com.swasthanepal.dao;

import com.swasthanepal.model.Disease;
import com.swasthanepal.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class DiseaseDao {
    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    
   public List<Disease> getDiseasesByLocation(String location, float tempr){

       List< Disease> disease = null;
        Session session = null;
        
        try{
            session = sessionFactory.openSession();
            session.beginTransaction();
            disease = session.createQuery("from Disease d where d.d_location LIKE :LOCATION AND d.d_temperature = :TEMPR").setParameter("TEMPR", tempr).setParameter("LOCATION", location).list();
        
            session.getTransaction().commit();

        }catch(Exception ex){
            
            if(session != null){
                session.getTransaction().rollback();
            }
//            return ex.toString();
        }finally{
            if(session != null){
                session.close();
            }
        }
        return disease;
//        return "fine";
    }
   
   
    public List<Disease> getAllDiseases(){
       List< Disease> diseases = null;
        Session session = null;
        
        try{
            session = sessionFactory.openSession();
            session.beginTransaction();
            diseases = session.createQuery("from Disease d").list();
            session.getTransaction().commit();
        }catch(Exception ex){
            if(session != null){
                session.getTransaction().rollback();;
            }
        }finally{
            if(session != null){
                session.close();
            }
        }
        
        
        return diseases;
    }
    
    
    
  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
