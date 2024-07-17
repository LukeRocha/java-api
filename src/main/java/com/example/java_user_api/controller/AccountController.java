//note: the java ws dependency, is part of the JAX-RS (Java API for RESTful Web Services) specification, which is a set of APIs to create REST web services in Java.

//Resumo
//@Component: For any generic bean.
//@Service: Services classes (business logic).
//@Repository: For classes that interact with database.
//@Controller: For HTTP req classes (web MVC).
//@RestController: API and REST classes.
//@Autowired: For automatic DI.
//These notations allow spring to manage objects and its dependencies automatically, making development and maintenance easy.

package com.example.java_user_api.controller;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/accounts")
public class AccountController {

    @POST
    @Path("/create")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createAccount(/* your Account DTO here */) {
    //  return Response.status(Response.Status.CREATED).entity(/* created account here */).build();
        return Response.ok("Account has been created").build();
    }

    @GET
    @Path("/user/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAccount(){
        return Response.ok("Here is your account").build();
    }

    @GET
    @Path("/users")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAccountsList(){
        return Response.ok("There is all accounts ->").build();
    }

    @PUT
    @Path("/update/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response editAccount() {
        return Response.ok("account has been updated").build();
    }

    @DELETE
    @Path("/{id}")
    public Response deleteAccount(@PathParam("id") Long id) {
        // Your logic to delete an account
        return Response.noContent().build();
    }
}
