package com.example;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

public class HelloWorldApplication extends Application<HelloWorldConfiguration> {

    public static void main(String[] args) throws Exception {
        new HelloWorldApplication().run(args);
    }

    @Override
    public void initialize(Bootstrap<HelloWorldConfiguration> bootstrap) {
        // Optional initialization logic
    }

    @Override
    public void run(HelloWorldConfiguration configuration, Environment environment) {
        environment.jersey().register(new HelloWorldResource());
    }

    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public static class HelloWorldResource {
        @GET
        public String sayHello(@Context HttpServletRequest request) {
            return "Hello, World!";
        }
    }
}