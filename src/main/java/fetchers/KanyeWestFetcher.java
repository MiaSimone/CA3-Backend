/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fetchers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dto.KanyeWestDTO;
import dto.StandartDTO;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import utils.HttpUtils;

/**
 *
 * @author Selina A.S.
 */


public class KanyeWestFetcher {
  private static final String FACT_SERVER = "https://api.kanye.rest";
  private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    
 
  public static String responseFromExternalServerParrallel(ExecutorService threadPool, final Gson gson) throws Exception{
  long start = System.nanoTime();
        
    Callable<KanyeWestDTO> factTask = new Callable<KanyeWestDTO>(){
               
    @Override
    public KanyeWestDTO call() throws IOException {
       String kanyeWestAPI = HttpUtils.fetchData(FACT_SERVER);
       KanyeWestDTO kwDTO = GSON.fromJson(kanyeWestAPI, KanyeWestDTO.class);
       return kwDTO;
        
            
    }
   };
    
     Future<KanyeWestDTO> futureFact = threadPool.submit(factTask);
        
        KanyeWestDTO kanyeFact = futureFact.get(2, TimeUnit.SECONDS);
        
        long end = System.nanoTime(); 
        String time = "Time Parallel: " + ((end-start)/1_000_000) + " ms.";
        
        StandartDTO sDTO = new StandartDTO(time, kanyeFact);
        
        String standartJSON = gson.toJson(sDTO);
          
        return standartJSON;
    }
}
