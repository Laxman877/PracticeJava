package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com")
public class AppConfig {
	@Bean("basicInfo")
	public BasicInfo setData() {
		return new BasicInfo(10, "laxman");
	}
	@Bean("addressInfo")
	public AddressInfo setAddress() {
		return new AddressInfo("baroda", "457869");
	}
}
