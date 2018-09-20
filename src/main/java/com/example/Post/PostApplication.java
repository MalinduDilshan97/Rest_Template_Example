package com.example.Post;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

@SpringBootApplication
public class PostApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostApplication.class, args);
		testMethod();
	}

	public static void testMethod() {

		RestTemplate restTemplate = new RestTemplate();

		String url = "http://viz-api.cyrupdev.net/api/sensors";
		ArrayList resource = restTemplate.postForObject(url, null, ArrayList.class);

		for (int i = 0; i <= resource.size() - 1; i++) {
			System.out.println(resource.get(i).toString());
		}

	}
}
