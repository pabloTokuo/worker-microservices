package com.workerms.hrconfigserver;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class HrConfigServerApplication{

	//@Value("${spring.cloud.config.server.git.username}")
	//private String userName;
	public static void main(String[] args) {
		SpringApplication.run(HrConfigServerApplication.class, args);
	}

}
