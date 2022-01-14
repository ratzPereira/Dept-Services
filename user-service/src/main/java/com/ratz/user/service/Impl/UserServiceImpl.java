package com.ratz.user.service.Impl;

import com.ratz.user.entity.User;
import com.ratz.user.pojo.Department;
import com.ratz.user.pojo.ResponseTemplatePOJO;
import com.ratz.user.repository.UserRepository;
import com.ratz.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

  @Autowired
  private UserRepository repository;

  @Autowired
  private RestTemplate restTemplate;

  @Override
  public User saveUser(User user) {
    log.info("Inside {}, saving user {}",UserServiceImpl.class.toGenericString(), user.getUserId());
    return repository.save(user);
  }

  @Override
  public ResponseTemplatePOJO getUserWithDepartment(Long userId) {

    log.info("Inside {}, get user with department {}",UserServiceImpl.class.toGenericString(), userId);

    ResponseTemplatePOJO pojo = new ResponseTemplatePOJO();
    User user = repository.findByUserId(userId);

    Department department = restTemplate.getForObject("http://localhost:9091/departments/" + user.getDepartmentId() , Department.class);

    pojo.setUser(user);
    pojo.setDepartment(department);

    return pojo;
  }
}
