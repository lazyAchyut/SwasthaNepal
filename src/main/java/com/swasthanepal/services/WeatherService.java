
package com.swasthanepal.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



@Path("/weatherAPI")
public class WeatherService {
    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public float getWeather()
    {
           return ((float)(Math.random() * 3 + 34));    
    }   
}
