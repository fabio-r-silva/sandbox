package com.frog.sandbox.user.domain;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import lombok.Data;

@Data
public class User {

  private UUID id;
  private String name;
  private LocalDate birthDate;
  private Address address;
  private List<Preference> preferences;
}
