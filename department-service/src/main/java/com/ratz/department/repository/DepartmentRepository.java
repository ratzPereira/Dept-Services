package com.ratz.department.repository;

import com.ratz.department.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository <Long, Department> {
}
