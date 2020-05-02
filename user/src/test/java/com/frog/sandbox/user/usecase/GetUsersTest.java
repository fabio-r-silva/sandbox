package com.frog.sandbox.user.usecase;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;
import com.frog.sandbox.user.domain.User;
import com.frog.sandbox.user.gateway.UserGateway;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GetUsersTest {

  private GetUsers getUsers;

  private UserGateway userGateway;

  @BeforeEach
  void setUp() {
    FixtureFactoryLoader.loadTemplates("com.frog.sandbox.user.templates");

    userGateway = mock(UserGateway.class);
    getUsers = new GetUsers(userGateway);
  }

  @Test
  void shouldGetUsers() {

    // given
    List<User> mockedUsers = Fixture.from(User.class).gimme(2, "new user");
    when(userGateway.getUsers()).thenReturn(mockedUsers);

    // when
    List<User> users = getUsers.execute();

    // then
    assertThat(users.size()).isEqualTo(2);
  }
}
