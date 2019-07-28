package com.myapp.todojms.jms;

import com.myapp.todojms.domain.ToDo;
import com.myapp.todojms.repositories.ToDoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.validation.Valid;

@Slf4j
@Component
@RequiredArgsConstructor
public class ToDoConsumer {

    private final ToDoRepository toDoRepository;

    @JmsListener(destination = "${todo.jms.destination}", containerFactory = "jmsFactory")
    public void processToDo(@Valid ToDo todo){
        log.info("Consumer >> {}",todo);
        log.info("ToDo created >> {}",toDoRepository.save(todo));
    }

}
