package com.lyj.springinaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SpringinactionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringinactionApplication.class, args);
	}
}
