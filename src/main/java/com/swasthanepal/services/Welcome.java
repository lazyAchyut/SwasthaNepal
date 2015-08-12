
package com.swasthanepal.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class Welcome {
    
    @GET
    @Path("/")
    public String welcomeScreen()
    {
        return "<h1 align='center'> Welcome To Swastha Nepal Web Service </h1>";
    }
    
}
