package com.ratz.user.service;

import com.ratz.user.entity.User;
import com.ratz.user.pojo.ResponseTemplatePOJO;

public interface UserService {
  User saveUser(User user);
  ResponseTemplatePOJO getUserWithDepartment(Long userId);
}
