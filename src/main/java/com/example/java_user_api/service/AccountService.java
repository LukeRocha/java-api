package com.example.java_user_api.service;

import com.example.java_user_api.dto.AccountDto;
import com.example.java_user_api.entity.AccountEntity;

public interface AccountService {
    AccountEntity createAccount(AccountDto accountDto);
}
