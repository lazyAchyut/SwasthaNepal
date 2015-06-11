
package com.swasthanepal.dao;

import com.swasthanepal.model.Organization;
import com.swasthanepal.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class OrganizationDao {
    
    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    
    public Organization getInformation(String org_code)
    {
        Session session = null;
//        List<Organization> organization = null;
        Organization organization = null;
        
        try{
            session = sessionFactory.openSession();
            session.beginTransaction();
            organization =  (Organization) session.createQuery("from Organization WHERE org_code = :CODE").setParameter("CODE",org_code).uniqueResult();
            session.getTransaction().commit();
        }catch(Exception e){
            if(session != null)
                session.getTransaction().rollback();         
        }finally{
           if(session!=null)
               session.close();
       }
    return organization;
    }
    
   
    public String updateOrganization(Organization organization)
    {
        Session session = null;
        
        try{
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.saveOrUpdate(organization);
            session.getTransaction().commit();
        }catch(Exception e)
        {
            if(session!=null)
            {
                session.getTransaction().rollback();
                return "False";
            }
        }
        finally{
            if(session!=null)
                session.close();
        }
        
        return "TRUE";
    }







}
