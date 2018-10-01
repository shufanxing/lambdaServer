package my.service.resource;

import javax.ws.rs.*;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/lambdatest")
public class MyService {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.WILDCARD)
    public Response getStatus() {
        return Response.status(200).entity("alive!").build();
    }

    @POST
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    public int postText(String content) {
        return content.length();
    }
}