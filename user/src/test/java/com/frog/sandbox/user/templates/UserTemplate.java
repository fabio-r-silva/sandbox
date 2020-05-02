package com.frog.sandbox.user.templates;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.TemplateLoader;
import com.frog.sandbox.user.domain.Address;
import com.frog.sandbox.user.domain.Preference;
import com.frog.sandbox.user.domain.User;
import java.time.LocalDate;
import java.util.UUID;

public class UserTemplate implements TemplateLoader {

  @Override
  public void load() {

    Fixture.of(User.class)
        .addTemplate(
            "new user",
            new Rule() {
              {
                add("name", "New User");
                add("birthDate", LocalDate.of(1984, 7, 27));
                add("address", one(Address.class, "some address"));
                add("preferences", has(2).of(Preference.class, "pref 1", "pref 2"));
              }
            })
        .addTemplate("saved user")
        .inherits(
            "new user",
            new Rule() {
              {
                add("id", UUID.randomUUID());
              }
            });
  }
}
