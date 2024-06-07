package com.example.kafkaproducer.controller;

import com.example.kafkaproducer.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

    ProducerService producer;

    @Autowired
    ProducerController (ProducerService producer){
        this.producer = producer;
    }

    @PostMapping(value = "/message")
    public void publishMessage(@RequestParam String msg){
        producer.pub(msg);
    }
}
