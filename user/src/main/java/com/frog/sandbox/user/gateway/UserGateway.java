package com.frog.sandbox.user.gateway;

import com.frog.sandbox.user.domain.User;
import java.util.List;

public interface UserGateway {

  User saveUser(User user);

  List<User> getUsers();
}
