package com.app.mod;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("com.app.mod")
public class Config {

	@Bean
	@Primary
	public Diff diff() {
		return new Diff();
	}

//	@Bean
//	public Sum sum() {
//		return new Sum(99,9);
//	}

}