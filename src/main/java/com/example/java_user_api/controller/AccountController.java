package com.example.java_user_api.controller;

import com.example.java_user_api.dto.AccountDto;
import com.example.java_user_api.entity.AccountEntity;
import com.example.java_user_api.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/")
    public ResponseEntity<String> createAccount(@RequestBody AccountDto accountDto) {
        AccountEntity accountEntity = accountService.createAccount(accountDto);
        return ResponseEntity.ok("Account has been created: " + accountEntity);
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<String> getAccount(@PathVariable Long id) {
        return ResponseEntity.ok("Here is your account for id: " + id);
    }

    @GetMapping("/users")
    public ResponseEntity<String> getAccountsList() {
        return ResponseEntity.ok("Here is the list of all accounts");
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> editAccount(@PathVariable Long id, @RequestBody AccountDto accountDto) {
        return ResponseEntity.ok("Account has been updated for id: " + id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAccount(@PathVariable Long id) {
        return ResponseEntity.noContent().build();
    }
}
