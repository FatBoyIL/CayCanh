package com.example.tree.model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class user {
    private long id;
    private String fistname;
    private String lastname;
    private String email;
    private Integer phone;
    private String address;
    private Date birthday;
    private String Avatar;
    private Date createdAt;
    private Date updatedAt;

}
