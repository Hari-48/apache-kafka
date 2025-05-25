package com.hari.cab_book_user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class CabBookUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(CabBookUserApplication.class, args);
	}

}
