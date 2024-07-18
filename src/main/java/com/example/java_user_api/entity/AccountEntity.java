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
    @Column(name = "id")
    private Long id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;
}
