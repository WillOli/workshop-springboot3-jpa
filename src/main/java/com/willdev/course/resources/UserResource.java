package com.willdev.course.resources;

import com.willdev.course.User.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users/")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Maria", "maria@gmail.com", "9999999", "12345");
        User u2 = new User(1L, "luis", "luuis@gmail.com", "99993999", "123425");
        return ResponseEntity.ok().body(u);
    }
}
