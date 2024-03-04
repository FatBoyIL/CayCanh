package com.example.tree.controller;

import com.example.tree.model.user;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/v1")
@Scope("prototype")
public class greeting {
    private static final String contentGreat = "Hello, %s %s";
    private static final String contentEmail = "Your email is: %s";
    private static final String contentPhone = "Your phone is: %s";
    private static final String contentAddress = "Your address is: %s";
    private static final String contentBd = "BD is: %s";
    private final AtomicLong counter = new AtomicLong();
    private final Set<Long> usedIds = new HashSet<>();
    private final Random random = new Random();

    @GetMapping("/greating")
    public user Greeting(@RequestParam(value = "userFName", defaultValue = "Jack") String userFName,
                         @RequestParam(value = "userLName", defaultValue = "Nguyen") String userLName
//                         @RequestParam(value = "userEmail", defaultValue = "huy@gmail.com") String userEmail,
//                         @RequestParam(value = "userPhone", defaultValue = "null") Integer userPhone,
//                         @RequestParam(value = "userAddress", defaultValue = "null") String userAddress
//                         @RequestParam(value = "userBirthday", defaultValue = "#{new java.util.Date()}") Date userBD,
//                         @RequestParam(value = "userAvartar", defaultValue = "xxx") String userAvatar,
//                         @RequestParam(value = "userCreated", defaultValue = "#{new java.util.Date()}") Date createdAt,
//                         @RequestParam(value = "userUpdate", defaultValue = "#{new java.util.Date()}") Date updatedAt
    ) {
//        long newId = generateUniqueId();
        return user.builder()
                .id(counter.incrementAndGet())
                .fistname(String.format(contentGreat,userFName,userLName))
//                .email(String.format(contentEmail,userEmail))
//                .phone(Integer.valueOf(contentPhone,userPhone))
//                .address(String.format(contentAddress,userAddress))
//                .birthday(userBD)
//                .Avatar(userAvatar)
//                .createdAt(createdAt)
//                .updatedAt(updatedAt)
                .build();
    }

//    private long generateUniqueId() {
//        long newId;
//        do {
//            newId = random.nextInt(90000000) + 10000000; // Tạo số ngẫu nhiên có 8 chữ số
//        } while (usedIds.contains(newId)); // Kiểm tra xem số này đã được sử dụng chưa
//
//        usedIds.add(newId); // Thêm số này vào danh sách các ID đã sử dụng
//        return newId;
//    }
}
