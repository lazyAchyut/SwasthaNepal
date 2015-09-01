
package com.swasthanepal.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

//welcome screen
@Path("/")
public class Welcome {
    
    @GET
    @Path("/")
    public String welcomeScreen()
    {
        return "<h1 align='center'> Welcome To Swastha Nepal Web Service </h1>"
                + "<h2 align='center'>By: Achyut Pokhrel & Anush Shrestha </h2>"
                + "<h4 align='center'> Try: /disease/getDiseaseByName/Anemia </h6>";
    }
    
}
