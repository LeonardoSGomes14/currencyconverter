package com.currenyconverter.operations;

import com.currenyconverter.format.UsualCurrency;
import com.google.gson.Gson;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Converter {

    public Double exOperations(String baseCurrency, String finalCurrency) {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://v6.exchangerate-api.com/v6/18690fe78845773e8ad5c4f0/pair/" + baseCurrency + "/" + finalCurrency))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                Gson gson = new Gson();
                UsualCurrency result = gson.fromJson(response.body(), UsualCurrency.class);

                return result.conversion_rate();

            } else {
                System.err.println("error in obtaining exchange results" + response.statusCode());
                return null;
            }
        } catch (IOException e) {
            System.err.println("error in API connection" + e.getMessage());
            e.printStackTrace();
            return null;

        } catch (Exception e) {
            System.err.println("unexpected error " + e.getMessage());
            e.printStackTrace();
            return null;

        }

    }
}