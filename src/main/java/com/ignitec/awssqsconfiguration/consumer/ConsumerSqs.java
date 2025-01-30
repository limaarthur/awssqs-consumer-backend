package com.ignitec.awssqsconfiguration.consumer;

import io.awspring.cloud.sqs.annotation.SqsListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerSqs {

    @SqsListener("minha-fila")
    public void listen(MyMessage message) {
        System.out.println("Message received: " + message.content());
    }
}
