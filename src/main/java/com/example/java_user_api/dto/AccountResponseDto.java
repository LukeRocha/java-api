package com.example.java_user_api.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@ToString
public class AccountResponseDto
{
    @JsonProperty("accountId")
    Long id;

    @JsonProperty("accountUserName")
    String userName;

}
