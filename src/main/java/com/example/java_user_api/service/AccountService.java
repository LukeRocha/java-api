package com.example.java_user_api.service;

import com.example.java_user_api.dto.AccountDto;
import com.example.java_user_api.dto.AccountResponseDto;

import java.util.List;

public interface AccountService {
    AccountResponseDto createAccount(AccountDto accountDto);

    List<AccountResponseDto> listAccounts();

    AccountResponseDto listAccount(Long accountId);

    Boolean deleteAccount(Long accountId);

    AccountResponseDto updateAccount(AccountDto accountDto, Long accountId);
}
