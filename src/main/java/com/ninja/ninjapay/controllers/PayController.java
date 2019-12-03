package com.ninja.ninjapay.controllers;


import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ninja.ninjapay.api.FfdcApi;
import com.ninja.ninjapay.models.Payment;
import com.ninja.ninjapay.models.User;
import com.ninja.ninjapay.repositories.UserRepository;

@RestController
@RequestMapping("api/ninja/pay")
public class PayController {
    @Autowired
    private UserRepository userRepository;

    @Autowired
	private FfdcApi api;
    
    @GetMapping("/r/{mobile}")
    public HashMap<String, String> getMobile(@PathVariable("mobile") String mobile) {
        User user = userRepository.findByMobile(mobile);
        HashMap<String, String> msgs = new HashMap<String, String>();
        
        if (user != null && user.getMobileLink() ) {
            msgs.put("Status", "Active");
            msgs.put("Name", user.getFullname());
            msgs.put("Mobile", user.getMobile());
            msgs.put("Message", "Mobile number is Ninja Pay Ready.");
        } else if (user != null && !user.getMobileLink() ) {
            msgs.put("Status", "No");
            msgs.put("Name", user.getFullname());
            msgs.put("Mobile", user.getMobile());
            msgs.put("Message", "Mobile number owner had not link an account as Ninja Pay Ready.");
        } else {
            msgs.put("Status", "No");
            msgs.put("Message", "Mobile number is not yet Ninja Pay Ready - use the link below to signup.");
            msgs.put("Link", "http://localhost:8080/ninja/signup");
        }
        return msgs;
    }
    
    @PostMapping (consumes = "application/json", produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public String initiatePay(@RequestBody String body) throws JsonMappingException, JsonProcessingException {
    	JsonNode root = new ObjectMapper().readTree(body);
    	User user = userRepository.findByMobile(root.findValue("mobile").textValue());
//    	System.out.println(user.getMobile());
    	Payment pay = new Payment(user, root.findValue("amount").textValue(), root.findValue("ccy").textValue());
    	System.out.println(pay.initiate(api));
        return "";
    }
    
}