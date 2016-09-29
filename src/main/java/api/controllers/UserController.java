package api.controllers;

import models.User;
import repository.UserRepository;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Simple user controller class
 * Created by ericreis on 9/27/16.
 */
@Path("/user")
@RequestScoped
public class UserController
{
    private UserRepository userRepo = new UserRepository();

    @GET
    @Path("/get/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public User getById(@PathParam("id") int id)
    {
        return userRepo.getUserById(id);
    }
}