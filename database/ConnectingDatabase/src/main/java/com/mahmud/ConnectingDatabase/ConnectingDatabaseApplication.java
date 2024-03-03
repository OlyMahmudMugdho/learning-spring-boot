package com.mahmud.ConnectingDatabase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;


@SpringBootApplication
public class ConnectingDatabaseApplication implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(ConnectingDatabaseApplication.class);
	public final DataSource dataSource;

	ConnectingDatabaseApplication(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public static void main(String[] args) {
		SpringApplication.run(ConnectingDatabaseApplication.class, args);
	}

	@Override
	public void run(String... args)  {
		log.info("Datasource : ", dataSource.toString());
		final JdbcTemplate template = new JdbcTemplate(dataSource);
		template.execute("select 1");
	}
}
