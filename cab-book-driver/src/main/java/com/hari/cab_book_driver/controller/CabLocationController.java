package com.hari.cab_book_driver.controller;


import com.hari.cab_book_driver.service.CabLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/location")
public class CabLocationController {

    @Autowired
    CabLocationService cabLocationService;

    @PutMapping
    public ResponseEntity<?> updateLocation() throws InterruptedException {

        int range = 5;
        while (range > 0) {
            //System.out.println(Math.random() + " , " + Math.random());
            cabLocationService.updateLocation(Math.random() + " , " + Math.random());
            Thread.sleep(10000);


            range--;
        }

        return new ResponseEntity<>(Map.of("Message", "Location Update"), HttpStatus.OK);


    }


}
