package com.nithin.springbootpractice.external_api;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RestTemplateExchangeExample {
	   public static void main(String[] args) {
	        String apiUrl = "https://jsonplaceholder.typicode.com/posts/{id}";
	        String postId = "1";

	        HttpHeaders headers = new HttpHeaders();
	        headers.add("User-Agent", "MyApp");

	        HttpEntity<String> requestEntity = new HttpEntity<>(headers);

	        RestTemplate restTemplate = new RestTemplate();

	        ResponseEntity<String> responseEntity = restTemplate.exchange(
	                apiUrl,
	                HttpMethod.GET,
	                requestEntity,
	                String.class,
	                postId
	        );

	        String responseBody = responseEntity.getBody();
	        System.out.println("Response Body: " + responseBody);
	    }
}
