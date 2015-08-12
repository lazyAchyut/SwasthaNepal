
package com.swasthanepal.services;

import com.swasthanepal.dao.DiseaseDao;
import com.swasthanepal.dao.UserDao;
import com.swasthanepal.model.Disease;
import com.swasthanepal.model.User;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/user")
public class UserService {
    
      
    
    
    UserDao userDao = new UserDao();
   
    @GET
    @Path("/checkUser/{user_id}")
    @Produces(MediaType.TEXT_PLAIN)
    public String checkUserGET(@PathParam("user_id") String user_id)
    {
       
        if(userDao.verifyUser(user_id)!= null)
        {
             return "TRUE";
        }
            
        else
        {
            User users = new User();
            users.setUser_id(user_id);
            if(userDao.saveUser(users))
                return "FALSE and new user created";
            else
                return "False but could't create new user";
            
        }
    }
    
//    this method must be via post so update ur client side and we will delete get method
    @POST
    @Path("/checkUser")
    @Produces(MediaType.TEXT_PLAIN)
    public String checkUserPOST(String user_id)
    {
       
        if(userDao.verifyUser(user_id)!= null)
        {
             return "TRUE";
        }
            
        else
        {
            User users = new User();
            users.setUser_id(user_id);
            if(userDao.saveUser(users))
                return "FALSE and new user created";
            else
                return "False but could't create new user";
            
        }
    }
    
    @POST
    @Path("/myContribution")
    @Produces(MediaType.APPLICATION_JSON)
    public List <Disease> myContribution(String user_id)
    {
        DiseaseDao diseaseDao = new DiseaseDao();
        return diseaseDao.getMyContribution(user_id);
    }
    
    @POST
    @Path("/orgContribution")
//    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    public List<Disease> orgContribution(String org_code)
    {
        DiseaseDao diseaseDao = new DiseaseDao();
        return diseaseDao.getOrgContribution(org_code);
    }
 
    
}
