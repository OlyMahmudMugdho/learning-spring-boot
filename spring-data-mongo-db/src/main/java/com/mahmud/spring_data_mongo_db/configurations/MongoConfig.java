package com.mahmud.spring_data_mongo_db.configurations;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
public class MongoConfig {
    @Bean
    public MongoClient mongoClient() {
        ConnectionString connectionString = new ConnectionString("mongodb://localhost:27017/test");
        MongoClientSettings clientSettings = MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .build();
        return MongoClients.create(clientSettings);
    }

    @Bean
    public MongoTemplate mongoTemplate() throws Exception {
        return new MongoTemplate(mongoClient(), "test");
    }
}
