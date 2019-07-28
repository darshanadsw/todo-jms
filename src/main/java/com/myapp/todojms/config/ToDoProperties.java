package com.myapp.todojms.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "todo.jms")
public class ToDoProperties {

    private String destination;



}
