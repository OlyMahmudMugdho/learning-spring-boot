package com.mahmud.configuration;

import com.mahmud.configuration.chotpoti.ChotpotiConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConfigurationApplication implements CommandLineRunner {

	ChotpotiConfig chotpotiConfig;

	ConfigurationApplication(ChotpotiConfig chotpotiConfig){
		this.chotpotiConfig = chotpotiConfig;
	}

	private static final Logger log = LoggerFactory.getLogger(ConfigurationApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ConfigurationApplication.class, args);
	}

	@Override
	public void run(String... args) {
		// final ChotpotiConfig chotpotiConfig = new ChotpotiConfig("simple","chilli","sweet");
		log.info(
				String.format("I want a %s chotpoti with %s sauce and %s spice",
						chotpotiConfig.getFlavour(),
						chotpotiConfig.getSauce(),
						chotpotiConfig.getSpice()
						)
		);
	}
}
