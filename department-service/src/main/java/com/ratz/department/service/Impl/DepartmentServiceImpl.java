package com.ratz.department.service.Impl;

import com.ratz.department.entity.Department;
import com.ratz.department.repository.DepartmentRepository;
import com.ratz.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentServiceImpl implements DepartmentService {

  @Autowired
  private DepartmentRepository repository;

  @Override
  public Department saveDepartment(Department department) {
    log.info("Inside {}, saving department {}",DepartmentServiceImpl.class.toGenericString(), department.getDepartmentName());
    return repository.save(department);
  }

  @Override
  public Department getDepartmentById(Long departmentId) {
    log.info("Inside {}, get department by ID {}",DepartmentServiceImpl.class.toGenericString(), departmentId);
    return repository.findByDepartmentId(departmentId);
  }
}
