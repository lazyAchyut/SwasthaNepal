
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
            disease = session.createQuery("from Disease where d_location LIKE :LOC ORDER BY CASE d_temperature WHEN :TEMPr THEN d_temperature END DESC, CASE WHEN d_temperature != :TEMPr THEN d_location END asc").setParameter("TEMPr", tempr).setParameter("LOC",location ).list();
            session.getTransaction().commit();

        }catch(Exception ex){
            
            if(session != null){
                session.getTransaction().rollback();
            }

        }finally{
            if(session != null){
                session.close();
            }
        }
        return disease;
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
    
    
    public List<Disease> getDiseaseByName(String name)
    {
        Session session = null;
        List<Disease> disease = null;
        
        try{
            session = sessionFactory.openSession();
            session.beginTransaction();
            disease = session.createQuery("from Disease D where D.d_name LIKE :NAME").setParameter("NAME",  name).list();
            session.getTransaction().commit();
           }
        catch(Exception E)
        {
            if(session != null)
                session.getTransaction().rollback();
        }
        finally
        {
            if(session!=null)
                session.close();
        }
       return disease;
    }
  
    
    public String saveDisease(Disease disease)
    {
        Session session = null;
         try{
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.saveOrUpdate(disease);
            session.getTransaction().commit();
           }
        catch(Exception E)
        {
            if(session != null)
               session.getTransaction().rollback();
            return E.toString();
        }
        finally
        {
            if(session!=null)
                session.close();
        }
        return "TRUE";
    }
    
    public List<Disease> getMyContribution(String user_id)
    {
        Session session = null;
        List<Disease> disease = null;
        
        try{
            session = sessionFactory.openSession();
            session.beginTransaction();
            disease = session.createQuery("select d_name, d_symptom, d_description, d_treatment, d_date, d_temperature, d_location from Disease D where user_id = :ID").setParameter("ID", user_id).list();
            session.getTransaction().commit();
        }catch(Exception Ex)
        {
            if(session != null)
                session.getTransaction().rollback();
            return null;
        }finally
        {
            if(session != null)
                session.close();                           
        }
        return disease;
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
