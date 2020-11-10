
package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dto.CatFactDTO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;
import utils.HttpUtils;

/**
 *
 * @author miade
 */
@Path("catfacts")
public class CatFactResource {
    
    
    @Context
    private UriInfo context;
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

   
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getRandomFacts() throws IOException {
        
        String randomCatFact = HttpUtils.fetchData("https://cat-fact.herokuapp.com/facts/random");
        
        CatFactDTO catFactDTO = GSON.fromJson(randomCatFact, CatFactDTO.class);
        
        return GSON.toJson(catFactDTO);

    }
    
    
}
