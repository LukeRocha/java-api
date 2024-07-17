package com.example.java_user_api.controller;

import com.example.java_user_api.dto.AccountDto;
import com.example.java_user_api.entity.AccountEntity;
import com.example.java_user_api.service.AccountService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping("/create")
    public ResponseEntity<String> createAccount(@RequestBody AccountDto accountDto) {
        AccountEntity accountEntity = accountService.createAccount(accountDto);
        return ResponseEntity.ok("Account has been created: " + accountEntity);
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<String> getAccount(@PathVariable Long id) {
        // Implement your logic to fetch account details by id
        return ResponseEntity.ok("Here is your account for id: " + id);
    }

    @GetMapping("/users")
    public ResponseEntity<String> getAccountsList() {
        // Implement your logic to fetch list of accounts
        return ResponseEntity.ok("Here is the list of all accounts");
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> editAccount(@PathVariable Long id, @RequestBody AccountDto accountDto) {
        // Implement your logic to update account details
        return ResponseEntity.ok("Account has been updated for id: " + id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAccount(@PathVariable Long id) {
        // Implement your logic to delete an account
        return ResponseEntity.noContent().build();
    }
}
