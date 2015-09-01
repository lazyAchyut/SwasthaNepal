
package com.swasthanepal.services;

import java.util.Random;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


//this service is used if third party weather server donot response
//of if we do not have internet connection during project demonstration
@Path("/weatherAPI")
public class WeatherService {
    
    //returns virtual temperature using random function
    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public int getWeather()
    {
            Random rand = new Random();
            int max = 41;
            int min = 30;   
            return (int)rand.nextInt((max-min)+1)+min;
    }   
}
