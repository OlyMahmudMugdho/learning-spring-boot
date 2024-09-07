package com.mahmud.spring_core;

import com.mahmud.spring_core.config.PrinterConfig;
import com.mahmud.spring_core.printer.Printer;
import com.mahmud.spring_core.printer.impl.BlackPrinter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringCoreApplication {

	private Printer printer;

	public SpringCoreApplication(@Qualifier("defaultPrinter") Printer printer) {
		this.printer = printer;
	}

	public static void main(String[] args) {
		ApplicationContext context =  new AnnotationConfigApplicationContext(PrinterConfig.class);
		// Printer printer = context.getBean(Printer.class);
		Printer redPrinter = context.getBean("redPrinter", Printer.class);
		Printer bluePrinter = context.getBean("bluePrinter", Printer.class);
		redPrinter.print("name");
		bluePrinter.print("name");

		Printer printer = context.getBean(Printer.class);
		printer.print("name");
		printer.print("name");
	}

}
