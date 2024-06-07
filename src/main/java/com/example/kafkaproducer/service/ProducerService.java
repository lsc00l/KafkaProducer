package com.example.kafkaproducer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

    String topicName = "fastcampus";

    private KafkaTemplate<String, Object> kafkaTemplate;

    @Autowired
    public ProducerService(KafkaTemplate kafkaTemplate){
        this.kafkaTemplate = kafkaTemplate;
    }

    public void pub(String msg){
        kafkaTemplate.send(topicName, msg);

    }
}
