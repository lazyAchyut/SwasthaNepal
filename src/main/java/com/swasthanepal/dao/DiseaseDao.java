
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
            disease = session.createQuery("from Disease D where D.d_name = :NAME order by d_date desc").setParameter("NAME",  name).list();
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
    
//    public String updateDisease(Disease disease)
//    {
//        Session session = null;
//         try{
//            session = sessionFactory.openSession();
//            session.beginTransaction();
//            session.update(disease);
//            session.getTransaction().commit();
//           }
//        catch(Exception E)
//        {
//            if(session != null)
//               session.getTransaction().rollback();
//            return E.toString();
//        }
//        finally
//        {
//            if(session!=null)
//                session.close();
//        }
//        return "TRUE";
//    }
    
    public String deleteDisease(int id)
    {
        Session session = null;
         try{
            session = sessionFactory.openSession();
            session.beginTransaction();
//            session.createQuery("Delete from Disease D where D.d_id = :ID").setParameter("ID", id);
            
            Disease disease = new Disease();
            disease.setD_id(id);
            session.delete(disease);
            
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
            disease = session.createQuery("from Disease D where user_id = :ID").setParameter("ID", user_id).list();
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
        
    public List<Disease> getOrgContribution(String org_code)
    {
        Session session = null;
        List<Disease> disease = null;
        
        try{
            session = sessionFactory.openSession();
            session.beginTransaction();
            disease = session.createQuery("from Disease D where org_code = :CODE order by d_date desc").setParameter("CODE", org_code).list();
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
    
    
    
     public List<Disease> getDisease(int d_id)
    {
        Session session = null;
        List<Disease> disease = null;
        
        try{
            session = sessionFactory.openSession();
            session.beginTransaction();
            disease = session.createQuery("from Disease D where D.d_id = :D_ID").setParameter("D_ID", d_id).list();
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
    
    
    
    
    
}
