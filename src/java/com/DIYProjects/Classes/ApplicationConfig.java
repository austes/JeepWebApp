package com.DIYProjects.Classes;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author root
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(com.DIYProjects.Classes.JeepControlResource.class);
        resources.add(com.DIYProjects.Classes.JeepControlsResource.class);
    }
    
}
