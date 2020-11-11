/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fetchers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dto.KanyeWestDTO;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import utils.HttpUtils;

/**
 *
 * @author Selina A.S.
 */

//Hjælppp, er lidt lost med denne her klasse


public class KanyeWestFetcher {
    private static final String FACT_SERVER = "https://api.kanye.rest";
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    
    //Hvad er dette, jeg har bare taget det fra Mias Fetcher klasse - haha :D 
    public static String responseFromExternalServerParrallel(ExecutorService threadPool, final Gson gson) throws Exception{
        long start = System.nanoTime();
        
    Callable<KanyeWestDTO> factTask = new Callable<KanyeWestDTO>(){
            
            
    @Override
    public KanyeWestDTO call() throws IOException {
        String kanyeWestAPI = HttpUtils.fetchData(FACT_SERVER);
        KanyeWestDTO kwDTO = GSON.fromJson(kanyeWestAPI, KanyeWestDTO.class);
        return kwDTO;
        
            
    }
    
}
