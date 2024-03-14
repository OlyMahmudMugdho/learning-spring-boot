package com.mahmud.springcorepractice;

import com.mahmud.springcorepractice.configs.ServiceConfig;
import com.mahmud.springcorepractice.greeter.Greeter;
import com.mahmud.springcorepractice.greeter.impl.MorningGreeter;
// import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
// import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringCorePracticeApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ServiceConfig.class);

		Greeter greeter = context.getBean(MorningGreeter.class);

		greeter.greet();

//		ApplicationContext context = new ClassPathXmlApplicationContext("services.xml");
//		Greeter greeter =  context.getBean("morningGreeter", MorningGreeter.class);
//		Greeter greeter1 = context.getBean("morningGreeter", Greeter.class);
//		greeter1.greet();



	}

}
