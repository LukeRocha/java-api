package com.example.java_user_api.entity;

import jakarta.persistence.*;
import lombok.*;

import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "accounts")
public class AccountEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    private String userName;

    private String email;

    private String password;
}
