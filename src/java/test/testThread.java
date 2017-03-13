/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;

/**
 * REST Web Service
 *
 * @author giuseppe
 */
@Path("testThread")
public class testThread {

    @Context
    private UriInfo context;
    private manager m=new manager();
    /**
     * Creates a new instance of testThread
     */
    public testThread() {
    }

    /**
     * Retrieves representation of an instance of test.testThread
     * @return an instance of java.lang.String
     */
    @Path("/{fednet_id}")
    @Produces("application/json")
    public String getXml(@PathParam("fednet_id") String fednet_id) {
       m.createThread(fednet_id);
       return "{\"asnwer\":\""+fednet_id+"\"}";
    }

    /**
     * PUT method for updating or creating an instance of testThread
     * @param content representation for the resource
     */
    @PUT
    @Consumes(javax.ws.rs.core.MediaType.APPLICATION_XML)
    public void putXml(String content) {
    }
}
