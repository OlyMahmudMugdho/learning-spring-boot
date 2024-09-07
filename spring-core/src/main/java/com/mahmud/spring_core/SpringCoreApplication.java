package com.mahmud.spring_core;

import com.mahmud.spring_core.config.PrinterConfig;
import com.mahmud.spring_core.printer.Printer;
import com.mahmud.spring_core.printer.impl.BluePrinter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringCoreApplication {

	public static void main(String[] args) {
		ApplicationContext context =  new AnnotationConfigApplicationContext(PrinterConfig.class);
		// Printer printer = context.getBean(Printer.class);
		Printer printer = context.getBean("redPrinter", Printer.class);
		Printer bluePrinter = context.getBean("bluePrinter", Printer.class);
		printer.print("name");
		bluePrinter.print("name");
	}

}
