package com.example;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class ExampleResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }
    @GET
    @Path("345")
    @Produces(MediaType.TEXT_PLAIN)
    public String helloo() {
        return "Hello from RESTEasy ReactiveKHanfar1234567";
    }
}
