package com.example.tree.controller;

import com.example.tree.model.user;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.Text;

import java.util.Date;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/v1")
@Scope("prototype")
public class greeting {


    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greating")
    public user Greeting(@RequestParam(value = "userFName", defaultValue = "Jack") String userFName,
                         @RequestParam(value = "userLName", defaultValue = "Nguyen") String userLName,
                         @RequestParam(value = "userEmail", defaultValue = "huy@gmail.com") String userEmail,
                         @RequestParam(value = "userPhone",defaultValue = "0931438803") Integer userPhone,
                         @RequestParam(value = "userAddress",defaultValue = "null") String userAddress,
                         @RequestParam(value = "userBirthday", defaultValue = "#{new java.util.Date()}") Date userBD,
                         @RequestParam(value = "userAvartar", defaultValue = "https://images.unsplash.com/photo-1709290608385-e6b029804f9d?q=80&w=1170&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D")
                             String userAvatar,
                         @RequestParam(value = "userCreated", defaultValue = "#{new java.util.Date()}") Date createdAt,
                         @RequestParam(value = "userUpdate", defaultValue = "#{new java.util.Date()}") Date updatedAt
    ) {
        return user.builder()
                .id(counter.incrementAndGet())
                .fistname(userFName)
                .lastname(userLName)
                .email(userEmail)
                .phone(userPhone)
                .address(userAddress)
                .birthday(userBD)
                .Avatar(userAvatar)
                .createdAt(createdAt)
                .updatedAt(updatedAt)
                .build();
    }
}
