package com.SpringPropertiesBuild;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SpringPropertiesBuildApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringPropertiesBuildApplication.class, args);

		log.info("Application loaded and about to be ended ..........................................");
		System.exit(0);
	}

}
