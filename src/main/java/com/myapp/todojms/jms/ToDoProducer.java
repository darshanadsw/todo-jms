package com.myapp.todojms.jms;

import com.myapp.todojms.domain.ToDo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class ToDoProducer {

    private final JmsTemplate jmsTemplate;

    public void sendTo(String destination, ToDo todo){
        this.jmsTemplate.convertAndSend(destination,todo);
        log.info("Producer >> Message Sent");
    }

}
