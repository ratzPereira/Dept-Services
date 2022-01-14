package com.ratz.department.service;

import com.ratz.department.entity.Department;

public interface DepartmentService {
  Department saveDepartment(Department department);

  Department getDepartmentById(Long departmentId);
}
