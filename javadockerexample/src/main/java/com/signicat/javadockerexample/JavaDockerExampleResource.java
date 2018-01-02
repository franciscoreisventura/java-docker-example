package com.signicat.javadockerexample;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
public class JavaDockerExampleResource {

    @Path("/")
    @GET
    @Produces(MediaType.TEXT_HTML)
    public Response index() {
        return Response.ok("Hello Java Docker Example").build();
    }
}
