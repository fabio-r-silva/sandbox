package com.frog.sandbox.user.gateway;

import com.frog.sandbox.user.domain.User;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class UserGatewayImpl implements UserGateway {

  @Override
  public User saveUser(User user) {
    return null;
  }

  @Override
  public List<User> getUsers() {
    return null;
  }
}
