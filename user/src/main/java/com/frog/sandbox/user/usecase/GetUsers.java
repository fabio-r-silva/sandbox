package com.frog.sandbox.user.usecase;

import com.frog.sandbox.user.domain.User;
import com.frog.sandbox.user.gateway.UserGateway;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class GetUsers {

  private final UserGateway userGateway;

  public GetUsers(UserGateway userGateway) {
    this.userGateway = userGateway;
  }

  public List<User> execute() {
    return userGateway.getUsers();
  }
}
