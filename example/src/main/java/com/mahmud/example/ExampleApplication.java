package com.mahmud.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExampleApplication {

	public static void main(String[] args) {
		var ctx = SpringApplication.run(ExampleApplication.class, args);

		HelloBean helloBean = ctx.getBean("myBean",HelloBean.class);
		HelloComponent helloComponent = ctx.getBean(HelloComponent.class);
		HelloService helloService = ctx.getBean(HelloService.class);

		System.out.println(helloBean.sayHelloBean());
		System.out.println(helloComponent.sayHelloComponent());
		System.out.println(helloService.sayHelloService());

		// the example given above are spring beans
	}



}
