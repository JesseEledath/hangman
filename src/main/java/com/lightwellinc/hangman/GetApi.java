package com.lightwellinc.hangman;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GetApi {
    public String GetApi() throws IOException, InterruptedException {
        final String regex = "(?<=\\\").+?(?=\\\")";
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://random-words5.p.rapidapi.com/getMultipleRandom?count=1&minLength=2&maxLength=10"))
                .header("X-RapidAPI-Host", "random-words5.p.rapidapi.com")
                .header("X-RapidAPI-Key", "1d5dd50c1amsh7d97474122900dap113e42jsnb83cf3791f45")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        final Matcher matcher = pattern.matcher(response.body());
        String word = "";
        while (matcher.find())
        {
            word = matcher.group(0);
        }
        return word;
    }
}
