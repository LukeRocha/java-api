package com.example.java_user_api.controller;

import com.example.java_user_api.dto.AccountResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import com.example.java_user_api.dto.AccountDto;
import com.example.java_user_api.mapper.AccountMapper;
import com.example.java_user_api.service.AccountService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @Autowired
    private AccountMapper accountMapper;

    @PostMapping("/")
    public ResponseEntity<AccountResponseDto> createAccount(@RequestBody AccountDto accountDto) {
        AccountResponseDto accountResponseDto = accountService.createAccount(accountDto);

        return ResponseEntity.ok(accountResponseDto);
    }

    @GetMapping("/{accountId}")
    public ResponseEntity<AccountResponseDto> getAccount(@PathVariable Long accountId) {
        AccountResponseDto account = accountService.listAccount(accountId);

        return ResponseEntity.ok(account);
    }

    @GetMapping("/accounts")
    public ResponseEntity<List<AccountResponseDto>> getAccountsList() {
        List<AccountResponseDto> accountList = accountService.listAccounts();

        return ResponseEntity.ok(accountList);
    }

    @PutMapping("/update/{accountId}")
    public ResponseEntity<AccountResponseDto> updateAccount(@PathVariable Long accountId, @RequestBody AccountDto accountDto) {
        AccountResponseDto updatedAccount = accountService.updateAccount(accountDto, accountId);


        return ResponseEntity.ok(updatedAccount);
    }

    @DeleteMapping("/{accountId}")
    public ResponseEntity<Void> deleteAccount(@PathVariable Long accountId) {
        accountService.deleteAccount(accountId);

        return ResponseEntity.noContent().build();
    }
}
