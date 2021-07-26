package com.stichline.stichline.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(collection = "user")
public class User {
    @Id
    private String id;
    private String name;
    private String email;
    private String mobileNumber;
    private String address;
    private String userName;
    private String password;
    private String state;
}
