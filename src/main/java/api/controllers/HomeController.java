package api.controllers;


import api.models.Home;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Simple controller class
 * Created by ericreis on 9/25/16.
 */
@Path("/home")
@RequestScoped
public class HomeController
{
    @GET
    @Path("/get")
    @Produces(MediaType.APPLICATION_JSON)
    public Home get()
    {
        return new Home("Welcome to your amazing application!");
    }
}