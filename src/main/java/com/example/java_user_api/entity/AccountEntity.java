package com.example.java_user_api.entity;

import jakarta.persistence.*;
import lombok.*;

import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class AccountEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    private String userName;

    private String email;

    private String password;
}
