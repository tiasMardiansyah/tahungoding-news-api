package dev.tias.boundary;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("news")
@ApplicationScoped
public class NewsBoundary {
    
    @GET
    public Response getNews() {
        return Response.ok("News").build();
    }

    @POST
    public Response createNews() {
        return Response.ok("News created").build();
    }

    @POST
    public Response updateNeResponse() {
        return Response.ok("News updated").build();
    }

    @DELETE
    public Response deleteNews() {
        return Response.ok("News deleted").build();
    }

}
