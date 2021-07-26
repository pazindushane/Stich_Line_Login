package com.stichline.stichline.controller;


import com.stichline.stichline.entity.User;
import com.stichline.stichline.service.UserService;
import com.stichline.stichline.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public ResponseEntity saveUser(@RequestBody User user){
    userService.saveUser(user);
        return new ResponseEntity(new StandardResponse("200","Done",user), HttpStatus.CREATED);
    }

    @GetMapping("/get")
    public ResponseEntity getAll(){
        List<User> all= userService.getAllUsers();
        return new ResponseEntity(new StandardResponse("200","Done",all), HttpStatus.CREATED);
    }

    @GetMapping("/onebyuserName/{userName}")
    public User getOneuserByuserName(@PathVariable String userName) {
        return userService.getOneuserByuserName(userName);
    }



}
