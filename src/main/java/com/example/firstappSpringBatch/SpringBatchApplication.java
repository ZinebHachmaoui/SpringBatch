package com.example.firstappSpringBatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringBatchApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    SpringApplication.run(SpringBatchApplication.class, args);
	}

}
