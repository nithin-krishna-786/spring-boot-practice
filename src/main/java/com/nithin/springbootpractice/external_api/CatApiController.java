package com.nithin.springbootpractice.external_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/cat")
public class CatApiController {

	private final String catApiUrl = "https://api.thecatapi.com/v1/images/search";
	private final String apiKey = "live_z4tclHp8DTQN9h593gjVpXTPJYH0agXSxsFUXgQBmXDF9cVquU36U2TtTsP6aA3B"; // Replace with your actual API key

	private final RestTemplate restTemplate;

	public CatApiController(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	@GetMapping("/getCatImage")
	public String getCatImage() {
		String apiUrl = catApiUrl + "?api_key=" + apiKey;
		String response = restTemplate.getForObject(apiUrl, String.class);
		return response;
	}
	
}
