package com.frog.sandbox.user.templates;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.TemplateLoader;
import com.frog.sandbox.user.domain.Address;

public class AddressTemplate implements TemplateLoader {

  @Override
  public void load() {
    Fixture.of(Address.class)
        .addTemplate(
            "some address",
            new Rule() {
              {
                add("street", "Sesame Street");
                add("number", "123");
                add("zipCode", "13181-752");
              }
            });
  }
}
