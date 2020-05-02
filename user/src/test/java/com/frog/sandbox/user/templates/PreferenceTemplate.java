package com.frog.sandbox.user.templates;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.TemplateLoader;
import com.frog.sandbox.user.domain.Preference;

public class PreferenceTemplate implements TemplateLoader {

  @Override
  public void load() {

    Fixture.of(Preference.class)
        .addTemplate(
            "pref 1",
            new Rule() {
              {
                add("key", "bla");
                add("value", "1");
              }
            })
        .addTemplate(
            "pref 2",
            new Rule() {
              {
                add("key", "test");
                add("value", "x");
              }
            });
  }
}
