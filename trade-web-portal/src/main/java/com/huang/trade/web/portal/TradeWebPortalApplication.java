package com.huang.trade.web.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages = {"com.huang"})

@SpringBootApplication
public class TradeWebPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(TradeWebPortalApplication.class, args);
	}

}
