package com.liudonghua.tutorials.dataway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import net.hasor.spring.boot.EnableHasor;
import net.hasor.spring.boot.EnableHasorWeb;

@EnableHasor
@EnableHasorWeb
@SpringBootApplication
public class DatawayApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatawayApplication.class, args);
	}

}
