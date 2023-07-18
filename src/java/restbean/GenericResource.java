/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/GenericResource.java to edit this template
 */
package restbean;

import ejbbean.SessionBeanLocal;
import javax.ejb.EJB;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author amrit
 */

@Path("generic")
public class GenericResource {
    @EJB
    SessionBeanLocal bean;

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
    public GenericResource() {
    }

    /**
     * Retrieves representation of an instance of Rest.GenericResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of GenericResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
    @POST
    @Path("Registration/{aname}/{email}/{password}/{phonno}/{address}/{city}/{state}/{cpin}/{type}")
    public void registration(@PathParam("aname") String aname,@PathParam("email") String email,@PathParam("password") String password,@PathParam("phonno") String phonno,@PathParam("address") String address,@PathParam("city") String city,@PathParam("state") String state,@PathParam("cpin") String cpin,@PathParam("type") String type) {
        //TODO return proper representation object
        bean.registration(aname,email,password,phonno,address,city,state,cpin,type);
    
    }
    @POST
    @Path("signup/{name}/{eml}/{pass}/{pic}")
    public void signup(@PathParam("name") String name,@PathParam("eml") String email,@PathParam("pass") String pass,@PathParam("pic") String pic) {
        //TODO return proper representation object
      bean.signup(name, email, pass, pic);
    }
}
