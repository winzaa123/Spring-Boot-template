package com.xeb.thana;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiThanaApplication {

	private static String jEnv = System.getenv("JAVA_ENV");
	public static void main(String[] args) {
		
		System.out.println(jEnv);
		if(jEnv == "production") System.setProperty("spring.devtools.restart.enabled", "false");
		
		SpringApplication.run(ApiThanaApplication.class, args);
	}

}
