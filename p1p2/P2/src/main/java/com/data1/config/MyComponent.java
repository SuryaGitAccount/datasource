package com.data1.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    private final Environment environment;

    @Autowired
    public MyComponent(Environment environment) {
        this.environment = environment;
    }

    public void someMethod() {
        String url = environment.getProperty("url");
        String username = environment.getProperty("username");
        String password = environment.getProperty("password");

        // Use the properties as needed
    }
}
