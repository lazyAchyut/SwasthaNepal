
package com.swasthanepal.services;

import com.swasthanepal.dao.UserDao;
import com.swasthanepal.model.User;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("user")
public class UserService {
    
   
    
    @GET
    @Path("/")
    public String output()
    {
        return "fine";
    }
    
    
    UserDao userDao = new UserDao();
   
    @GET
    @Path("/checkUser/{user_id}")
    @Produces(MediaType.TEXT_PLAIN)
    public String checkUser(@PathParam("user_id") String user_id)
    {
       
        if(userDao.verifyUser(user_id)!= null)
             return "TRUE";
        else
            return "FALSE";
        
//        return userDao.verifyUser(user_id);
    }
    
    
}
