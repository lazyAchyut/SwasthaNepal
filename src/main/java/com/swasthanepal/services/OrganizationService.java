
package com.swasthanepal.services;

import com.swasthanepal.dao.OrganizationDao;
import com.swasthanepal.model.Organization;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



//this services is for organizational client
@Path("/organization/")
public class OrganizationService {
    OrganizationDao organizationDao = new OrganizationDao();
    
    
    // returns organizational details   
    @GET
    @Path("/getinformation/{org_code}")
    @Produces(MediaType.APPLICATION_JSON)
    public Organization getInformation(@PathParam("org_code") String org_code)
    {
        return organizationDao.getInformation(org_code);

    }
    
    //update organization profile    
    @POST
    @Path("/updateOrganization")
    @Consumes(MediaType.APPLICATION_JSON)
    
    public String updateOrganization(Organization organization)
    {
        return organizationDao.updateOrganization(organization);
    }
    
}
