
package com.swasthanepal.services;


import com.swasthanepal.dao.DiseaseDao;
import com.swasthanepal.model.Disease;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


//diseases related services
//used for save, retrieve, view list of diseases
@Path("/disease/")
public class Service {
     private final DiseaseDao diseaseDao = new DiseaseDao();
    
    //returns disease based on location and temperature
    //diseases are ordered on the basis of temperature if requested temperature exits     
    @GET
    @Path("/getDiseaseByLocation/{location}/{temperature}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Disease> getDiseaseByLocation(@PathParam("location") String location, @PathParam("temperature") float temperature)
    {
        return diseaseDao.getDiseasesByLocation(location,temperature);
    }
   
    
    //returns list of 10 diseases 
    @GET
    @Path("/latest")
    @Produces(MediaType.APPLICATION_JSON)
    public List <Disease> getAll()
    {
        return diseaseDao.getLatest();
    }
    
  
    
    //return list of requested diseases by name
    @GET
    @Path("getDiseaseByName/{dname}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Disease> searchByName(@PathParam("dname") String dname)
    {
        return diseaseDao.getDiseaseByName(dname);
    }

   
    
   //to save disease provided by user    
   @POST
   @Path("/saveDisease")
   @Consumes(MediaType.APPLICATION_JSON)
   @Produces(MediaType.TEXT_PLAIN)
   public String saveDisease(Disease disease)
   {             
        return diseaseDao.saveDisease(disease);       
   }
   
   //get disease on the basis of its disease id using post method
   @POST
   @Path("/getDisease")
   @Produces(MediaType.APPLICATION_JSON)
   public Disease getDisease(int d_id)
   {
       return diseaseDao.getDisease(d_id);
   }
   
   
    //get disease on the basis of its disease id using get method
   @GET
   @Path("/getDisease/{d_id}")
   @Produces(MediaType.APPLICATION_JSON)
   public Disease getDisease_GET(@PathParam("d_id") int d_id)
   {
       return diseaseDao.getDisease(d_id);
   }
  
   
   //to update disease
   @POST
   @Path("/updateDisease")
   @Consumes(MediaType.APPLICATION_JSON)
   @Produces(MediaType.TEXT_PLAIN)
   public String updateDisease(Disease disease)
   { 
//               return diseaseDao.updateDisease(disease);     
               return diseaseDao.saveDisease(disease);     
   }
   
   //to delete disease
   //instead of post use DELETE verb
   @POST
   @Path("/deleteDisease")
   public String delete(int id)
   {
       return diseaseDao.deleteDisease(id);
//       return id;
   }
   
   
   
}
