package com.revnomix.revseed.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestService {
    @PostMapping(value = "/test/{customer}")
    public ResponseEntity createCustomer(@RequestParam("customer") String customer) {


        return new ResponseEntity(customer, HttpStatus.OK);
    }

}
