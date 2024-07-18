package com.example.java_user_api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@ToString
public class AccountDto
{
  @JsonProperty("accountId")
  Long id;

  @NotBlank(message = "O nome não pode estar em branco")
  @Size(min = 3, max = 50, message = "O nome deve ter entre 3 e 50 caracteres")
  @JsonProperty("accountUserName")
  String userName;

  @NotBlank(message = "O campo de e-mail não pode estar em branco")
  @Email(message = "O e-mail deve estar em um formato válido")
  @JsonProperty("accountEmail")
  String email;

  @NotBlank(message = "A senha não pode estar em branco")
  @Size(min = 6, message = "A senha deve ter pelo menos 6 caracteres")
  @JsonProperty("accountPassword")
  String password;
}
