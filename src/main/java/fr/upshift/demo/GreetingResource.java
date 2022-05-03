package fr.upshift.demo;

import javax.inject.Inject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.quarkus.logging.Log;
import io.smallrye.mutiny.Uni;

@Path("/hello")
public class GreetingResource {
    
    @Inject
    GreetingService service;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Uni<String> greet() {
        Log.info("Say hello!");
        return Uni.createFrom().item(service.getGreeting());
    }
}
