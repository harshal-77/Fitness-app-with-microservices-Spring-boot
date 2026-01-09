package com.fitness.activityservice.config;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class PropertyDebug {

    @Autowired
    private Environment env;

    @PostConstruct
    public void printMongoProps() {
        System.out.println("spring.data.mongodb.uri = "
                + env.getProperty("spring.data.mongodb.uri"));
        System.out.println("spring.data.mongodb.database = "
                + env.getProperty("spring.data.mongodb.database"));
    }
}
