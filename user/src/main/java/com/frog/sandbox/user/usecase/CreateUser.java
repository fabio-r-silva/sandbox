package com.frog.sandbox.user.usecase;

import com.frog.sandbox.user.domain.User;
import com.frog.sandbox.user.gateway.UserGateway;
import org.springframework.stereotype.Component;

@Component
public class CreateUser {

  private final UserGateway userGateway;

  public CreateUser(UserGateway userGateway) {
    this.userGateway = userGateway;
  }

  public User execute(User user) {
    return userGateway.saveUser(user);
  }
}
