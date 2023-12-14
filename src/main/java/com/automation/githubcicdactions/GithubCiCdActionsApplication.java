package com.automation.githubcicdactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class GithubCiCdActionsApplication {


	@GetMapping("/get")
	public String welcome() {
		return "Welcome to Github CI/CD Actions";
	}
	public static void main(String[] args) {
		SpringApplication.run(GithubCiCdActionsApplication.class, args);
	}

}
