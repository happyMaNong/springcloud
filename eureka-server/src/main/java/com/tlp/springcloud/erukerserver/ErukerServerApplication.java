package com.tlp.springcloud.erukerserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ErukerServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ErukerServerApplication.class, args);
	}

}
