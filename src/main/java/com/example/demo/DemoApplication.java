package com.example.demo;

import com.example.demo.bakery.CakeBaker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		CakeBaker baker = context.getBean(CakeBaker.class);
		baker.bakeCake();
	}
}
