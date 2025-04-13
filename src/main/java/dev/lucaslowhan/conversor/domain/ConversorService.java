package dev.lucaslowhan.conversor.domain;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversorService {
    private final String key = "46a745c5e2e8c61bd0289ffe";
    public String getKey() {
        return key;
    }
    public Conversion conversorService(String currencyA, String currencyB , double value){
        URI adress = URI.create("https://v6.exchangerate-api.com/v6/" + getKey()+ "/pair/"+ currencyA + "/" + currencyB + "/" +value);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(adress)
                .GET()
                .build();
        try{
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request,HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(),Conversion.class);
        }catch (Exception e){
            throw new RuntimeException("Valor informado incorretamente.");
        }
    }
}
