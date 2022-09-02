package com.xperlean.projet_kafka.controller;

import com.xperlean.projet_kafka.model.camion;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class kafkaComsumer {


    @KafkaListener(id= "my-topic",topics="my-topic", groupId = "group_json",
            containerFactory = "userKafkaListenerFactory")
    public void consumeJson(String c) {

        System.out.println("Consumed JSON Message: " + c);
    }

}
