package com.ygor.dev.loja;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class LojaProdutoRedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(LojaProdutoRedisApplication.class, args);
	}

}
