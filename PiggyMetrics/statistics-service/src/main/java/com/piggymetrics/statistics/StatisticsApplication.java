package com.piggymetrics.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableDiscoveryClient
//@EnableOAuth2Client
//@EnableFeignClients
// @EnableGlobalMethodSecurity(prePostEnabled = true)
public class StatisticsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StatisticsApplication.class, args);
	}

	// @Configuration
	// static class CustomConversionsConfig {

	// 	@Bean
	// 	public CustomConversions customConversions() {
	// 		return new CustomConversions(Arrays.asList(new DataPointIdReaderConverter(),
	// 				new DataPointIdWriterConverter()));
	// 	}
	// }
}

