package com.chanuth.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableJpaAuditing
@SpringBootApplication
public class SocialBookNetworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(SocialBookNetworkApplication.class, args);
	}

}
