package com.fitness.activityservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDatabaseFactory;

@Configuration
public class MongoDbDebugConfig {

    @Bean
    CommandLineRunner mongoDbNamePrinter(MongoDatabaseFactory factory) {
        return args -> {
            System.out.println(">>> MongoDB database in use: "
                    + factory.getMongoDatabase().getName());
        };
    }
}
