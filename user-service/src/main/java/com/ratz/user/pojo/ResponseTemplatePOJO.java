package com.ratz.user.pojo;

import com.ratz.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplatePOJO {

  private User user;
  private Department department;
}
