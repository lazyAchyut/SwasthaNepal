
package com.swasthanepal.services;

import com.swasthanepal.dao.UserDao;
import com.swasthanepal.model.User;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

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
        {
//            return Response.ok().entity("User Already Exists").build();
             return "TRUE";
        }
            
        else
            return "FALSE";
//             return Response.status(Status.BAD_REQUEST).build();
        
    }
    
    @POST
    @Path("/saveUser")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String saveuser(User user)
    {
       User users = new User();
       users.setUser_id("Achyutpokhrel");
      return userDao.saveUser(users);
           
       
        
    }
    
}
