package com.example.Post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

@RestController
@RequestMapping("/controller")
public class PostController {

    public RestTemplate restTemplate;


    @PostMapping("/method")
    public void testMethod() {

        restTemplate = new RestTemplate();

        String url = "http://viz-api.cyrupdev.net/api/sensors";
        ArrayList resource = restTemplate.postForObject(url, null, ArrayList.class);

        for (int i = 0; i <= resource.size() - 1; i++) {
            System.out.println(resource.get(i).toString());
        }

    }


}
