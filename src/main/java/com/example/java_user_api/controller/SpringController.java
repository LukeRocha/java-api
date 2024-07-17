package com.example.java_user_api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")
public class SpringController {

    @PostMapping("/create")
    public ResponseEntity<String> createAccount(/* your Account DTO here */) {
        return ResponseEntity.status(HttpStatus.CREATED).body("Account has been created");
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<String> getAccount(@PathVariable("id") Long id) {
        return ResponseEntity.ok("Here is your account");
    }

    @GetMapping("/users")
    public ResponseEntity<String> getAccountsList() {
        return ResponseEntity.ok("Here is all accounts ->");
    }

    /* your Account DTO here below */
    @PutMapping("/update/{id}")
    public ResponseEntity<String> editAccount(@PathVariable("id") Long id) {
        return ResponseEntity.ok("Account has been updated");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAccount(@PathVariable("id") Long id) {
        // Your logic to delete an account
        return ResponseEntity.noContent().build();
    }
}