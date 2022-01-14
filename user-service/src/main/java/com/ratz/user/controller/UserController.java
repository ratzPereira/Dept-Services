package com.ratz.user.controller;


import com.ratz.user.entity.User;
import com.ratz.user.pojo.ResponseTemplatePOJO;
import com.ratz.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("users")
public class UserController {

  @Autowired
  private UserService service;


  @PostMapping
  public User saveUser(@RequestBody User user){

    log.info("Trying to save user {}", user.getFirstName() + " " + user.getLastName());
    return service.saveUser(user);
  }

  @GetMapping("/{id}")
  public ResponseTemplatePOJO getUserWithDepartment(@PathVariable("id") Long userId){

    log.info("Trying to get user with department with the ID: - {}", userId);
    return service.getUserWithDepartment(userId);
  }

}
