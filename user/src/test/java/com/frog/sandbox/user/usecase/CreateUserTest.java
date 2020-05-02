package com.frog.sandbox.user.usecase;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;
import com.frog.sandbox.user.domain.User;
import com.frog.sandbox.user.gateway.UserGateway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CreateUserTest {

  private CreateUser createUser;

  private UserGateway userGateway;

  @BeforeEach
  void setUp() {
    FixtureFactoryLoader.loadTemplates("com.frog.sandbox.user.templates");

    userGateway = mock(UserGateway.class);
    createUser = new CreateUser(userGateway);
  }

  @Test
  void shouldCreateUser() {

    // given
    User user = Fixture.from(User.class).gimme("new user");
    when(userGateway.saveUser(user)).thenReturn(Fixture.from(User.class).gimme("saved user"));

    // when
    User savedUser = createUser.execute(user);

    // then
    assertThat(savedUser.getId()).isNotNull();
  }
}
