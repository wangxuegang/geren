package com.wangxuegang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan("com.wangxuegang.dao")
@EnableCaching
public class GerenApplication {

	public static void main(String[] args) {
		SpringApplication.run(GerenApplication.class, args);
	}
}
