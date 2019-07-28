package com.myapp.todojms.config;

import com.myapp.todojms.domain.ToDo;
import com.myapp.todojms.jms.ToDoProducer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class ToDoSender {

    @Bean
    public CommandLineRunner sendToDos(@Value("${todo.jms.destination}") String destination,
                                       ToDoProducer producer){
        return args -> producer.sendTo(destination,new ToDo("workout tommorow morning!"));
    }
}
