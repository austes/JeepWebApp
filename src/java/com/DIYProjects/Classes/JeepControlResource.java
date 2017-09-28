
package com.DIYProjects.Classes;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.core.MediaType;


public class JeepControlResource {

    private String id;

    private JeepControlResource(String id) {
        this.id = id;
    }


    public static JeepControlResource getInstance(String id) {
        // The user may use some kind of persistence mechanism
        // to store and restore instances of JeepControlResource class.
        return new JeepControlResource(id);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }

    @DELETE
    public void delete() {
    }
}
