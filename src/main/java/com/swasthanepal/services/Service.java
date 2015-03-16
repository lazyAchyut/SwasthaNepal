
package com.swasthanepal.services;

import com.swasthanepal.dao.DiseaseDao;
import com.swasthanepal.model.Disease;
import com.swasthanepal.model.Person;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/disease/")
public class Service {
     private DiseaseDao diseaseDao = new DiseaseDao();
    
     
     
     
    @GET
    @Path("/getDiseaseByLocation/{location}/{temperature}")
    @Produces(MediaType.APPLICATION_JSON)
    public List <Disease> getDiseaseByLocation(@PathParam("location") String location, @PathParam("temperature") float temperature)
    {
        return diseaseDao.getDiseasesByLocation(location,temperature);
    }
   
    
    @GET
    @Path("/getAllDiseasesInJSON")
    @Produces(MediaType.APPLICATION_JSON)
    public List <Disease> getAll()
    {
        return diseaseDao.getAllDiseases();
    }
    
    
   @POST
   @Path("/saveDisease")
   @Consumes(MediaType.APPLICATION_JSON)
   @Produces(MediaType.APPLICATION_JSON)
   public String saveDisease(Disease disease)
   {
       return null;
   }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
