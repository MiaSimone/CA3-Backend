package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import utils.EMF_Creator;
import facades.XXXFacade;
import javax.persistence.EntityManagerFactory;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import dto.KanyeWestDTO;
import fetchers.KanyeWestFetcher;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import utils.HttpUtils;

/**
 *
 * @author Selina A.S.
 */

@Path("kanyewest")
public class KanyeWestResource {

    @Context
    private UriInfo context;
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static ExecutorService es = Executors.newCachedThreadPool();
    private static String cachedResponse;
    
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public String getKanyeWest() throws Exception {
        String result = KanyeWestFetcher.responseFromExternalServerParrallel(es, GSON);
        cachedResponse = result;
        return result; 
    }
}
