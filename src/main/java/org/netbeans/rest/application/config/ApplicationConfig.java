/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.rest.application.config;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author dell
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(com.swasthanepal.services.OrganizationService.class);
        resources.add(com.swasthanepal.services.Service.class);
        resources.add(com.swasthanepal.services.UserService.class);
        resources.add(com.swasthanepal.services.WeatherService.class);
        resources.add(com.swasthanepal.services.Welcome.class);
        resources.add(org.codehaus.jackson.jaxrs.JacksonJaxbJsonProvider.class);
        resources.add(org.codehaus.jackson.jaxrs.JacksonJsonProvider.class);
        resources.add(org.codehaus.jackson.jaxrs.JsonMappingExceptionMapper.class);
        resources.add(org.codehaus.jackson.jaxrs.JsonParseExceptionMapper.class);
        resources.add(org.jboss.resteasy.plugins.providers.jackson.JacksonJsonpInterceptor.class);
        resources.add(org.jboss.resteasy.plugins.providers.jackson.ResteasyJacksonProvider.class);
        resources.add(org.jboss.resteasy.plugins.providers.jaxb.CollectionProvider.class);
        resources.add(org.jboss.resteasy.plugins.providers.jaxb.JAXBElementProvider.class);
        resources.add(org.jboss.resteasy.plugins.providers.jaxb.JAXBXmlRootElementProvider.class);
        resources.add(org.jboss.resteasy.plugins.providers.jaxb.JAXBXmlSeeAlsoProvider.class);
        resources.add(org.jboss.resteasy.plugins.providers.jaxb.JAXBXmlTypeProvider.class);
        resources.add(org.jboss.resteasy.plugins.providers.jaxb.MapProvider.class);
        resources.add(org.jboss.resteasy.plugins.providers.jaxb.XmlJAXBContextFinder.class);
        resources.add(org.jboss.resteasy.plugins.providers.jaxb.json.JettisonElementProvider.class);
        resources.add(org.jboss.resteasy.plugins.providers.jaxb.json.JettisonXmlRootElementProvider.class);
        resources.add(org.jboss.resteasy.plugins.providers.jaxb.json.JettisonXmlSeeAlsoProvider.class);
        resources.add(org.jboss.resteasy.plugins.providers.jaxb.json.JettisonXmlTypeProvider.class);
        resources.add(org.jboss.resteasy.plugins.providers.jaxb.json.JsonCollectionProvider.class);
        resources.add(org.jboss.resteasy.plugins.providers.jaxb.json.JsonJAXBContextFinder.class);
        resources.add(org.jboss.resteasy.plugins.providers.jaxb.json.JsonMapProvider.class);
        resources.add(org.jboss.resteasy.plugins.stats.RegistryStatsResource.class);
    }
    
}
