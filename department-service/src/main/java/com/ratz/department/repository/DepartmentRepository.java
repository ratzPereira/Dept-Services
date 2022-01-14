package com.ratz.department.repository;

import com.ratz.department.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository <Department, Long> {
  Department findByDepartmentId(Long departmentId);
}
