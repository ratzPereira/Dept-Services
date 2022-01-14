package com.ratz.department.controller;

import com.ratz.department.entity.Department;
import com.ratz.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

  @Autowired
  private DepartmentService service;


  @PostMapping
  public Department saveDepartment(@RequestBody Department department){

    log.info("Trying to save department {}", department.getDepartmentName());
    return service.saveDepartment(department);
  }


  @GetMapping("/{id}")
  public Department getDepartmentById(@PathVariable("id") Long departmentId){

    log.info("Trying to get department by ID: - {}", departmentId);
    return service.getDepartmentById(departmentId);
  }
}
