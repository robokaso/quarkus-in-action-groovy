package org.acme

import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType
import org.eclipse.microprofile.config.inject.ConfigProperty

@Path("/hello")
class GreetingResource {

    @ConfigProperty(name = "greeting")
    String greeting

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    String hello() {
        return greeting
    }
}
