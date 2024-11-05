package com.edge51.notesite;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.edge51.notesite.dao")
public class NoteSiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(NoteSiteApplication.class, args);
	}

}
