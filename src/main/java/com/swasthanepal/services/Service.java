
package com.swasthanepal.services;


import com.swasthanepal.dao.DiseaseDao;
import com.swasthanepal.model.Disease;
import com.swasthanepal.pojo.DiseasePojo;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.hibernate.Session;


@Path("/disease/")
public class Service {
     private final DiseaseDao diseaseDao = new DiseaseDao();
    
     
     @GET
     @Path("/")
     public String sdf()
     {
         return "200k";
     }
     
    @GET
    @Path("/getDiseaseByLocation/{location}/{temperature}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Disease> getDiseaseByLocation(@PathParam("location") String location, @PathParam("temperature") float temperature)
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
    
  
    
    
    @GET
    @Path("getDiseaseByName/{dname}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Disease> searchByName(@PathParam("dname") String dname)
    {
        return diseaseDao.getDiseaseByName(dname);
    }
    
    
        
   @POST
   @Path("/saveDisease")
   @Consumes(MediaType.APPLICATION_JSON)
   @Produces(MediaType.TEXT_PLAIN)
   public String saveDisease(DiseasePojo diseasePojo)
   {
               Disease disease = new Disease();
               
               disease.setD_name(diseasePojo.getD_name());
               disease.setD_symptom(diseasePojo.getD_symptom());
               disease.setD_description(diseasePojo.getD_description());
               disease.setD_treatment(diseasePojo.getD_treatment());
               disease.setD_date(diseasePojo.getD_date());
               disease.setD_location(diseasePojo.getD_location());
               disease.setD_temperature(diseasePojo.getD_temperature());
               disease.setOrg_code(diseasePojo.getOrg_code());
               disease.setUser_id(diseasePojo.getUser_id());
               disease.setTrust_flag(diseasePojo.getTrust_flag());
               
               return diseaseDao.saveDisease(disease);
          
       
   }
 
    
}
