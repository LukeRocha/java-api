package com.example.java_user_api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@ToString
public class AccountDto
{
  @JsonProperty("accountId")
  Long id;

  @JsonProperty("accountUserName")
  String username;

  @JsonProperty("accountEmail")
  String email;
}
