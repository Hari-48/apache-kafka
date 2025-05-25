package com.hari.cab_book_user.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class LocationService {

    @KafkaListener(topics = "cab-location", groupId = "my-group-hari")
    public void getLocation(String location) {
        System.out.println(location);

    }
}
