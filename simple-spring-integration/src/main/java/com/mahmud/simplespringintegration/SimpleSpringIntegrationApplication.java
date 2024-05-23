package com.mahmud.simplespringintegration;

import com.mahmud.simplespringintegration.gateway.FileWriterGateway;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleSpringIntegrationApplication implements CommandLineRunner {

    private final FileWriterGateway fileWriterGateway;

    public SimpleSpringIntegrationApplication(FileWriterGateway fileWriterGateway) {
        this.fileWriterGateway = fileWriterGateway;
    }

    public static void main(String[] args) {
        SpringApplication.run(SimpleSpringIntegrationApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        fileWriterGateway.writeToFile("test.txt", "ok");
    }
}
