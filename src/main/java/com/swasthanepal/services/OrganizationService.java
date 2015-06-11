
package com.swasthanepal.services;

import com.swasthanepal.dao.DiseaseDao;
import com.swasthanepal.dao.OrganizationDao;
import com.swasthanepal.model.Disease;
import com.swasthanepal.model.Organization;
import java.util.List;
import javax.print.DocFlavor;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/organization/")
public class OrganizationService {
    OrganizationDao organizationDao = new OrganizationDao();
    
     @GET
     @Path("/")
     public String sdf()
     {
         return "200k";
     }
    
    
    
    @GET
    @Path("/getinformation/{org_code}")
    @Produces(MediaType.APPLICATION_JSON)
    public Organization getInformation(@PathParam("org_code") String org_code)
    {
        return organizationDao.getInformation(org_code);

    }
    
    @POST
    @Path("/updateOrganization")
    @Consumes(MediaType.APPLICATION_JSON)
    
    public String updateOrganization(Organization organization)
    {
        return organizationDao.updateOrganization(organization);
    }
    
}
