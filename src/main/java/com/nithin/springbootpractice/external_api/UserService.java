package com.nithin.springbootpractice.external_api;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {
    private static final String API_URL = "https://jsonplaceholder.typicode.com/users";

    private RestTemplate restTemplate;

    public UserService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public User getUserById(Long userId) {
        String apiUrl = API_URL + "/" + userId;
        return restTemplate.getForObject(apiUrl, User.class);
    }
}
