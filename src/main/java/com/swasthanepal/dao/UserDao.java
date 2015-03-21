
package com.swasthanepal.dao;

import com.swasthanepal.model.User;
import com.swasthanepal.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class UserDao {
   SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
   
   public User verifyUser(String user_id)
   {
    
       Session session = null;
       User user = null;

       
       try{
           session = sessionFactory.openSession();
           session.beginTransaction();
           user = (User)session.createQuery("from User U where U.user_id = :USER_ID group by U.user_id").setParameter("USER_ID", user_id).uniqueResult();
           session.getTransaction().commit();
       }catch(Exception e){
            if(session != null)
                session.getTransaction().rollback();         
        }finally{
           if(session!=null)
               session.close();
       }
    return user;
   
   }
   
   
   
    public boolean saveUser(User user)
    {
        Session session = null;
         try{
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(user);
            session.getTransaction().commit();
           }
        catch(Exception E)
        {
            if(session != null)
               session.getTransaction().rollback();
            return false;
        }
        finally
        {
            if(session!=null)
                session.close();
        }
        return true;
    }
   
   
   
}
