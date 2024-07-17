package com.example.java_user_api.service;

import com.example.java_user_api.dto.AccountDto;
import com.example.java_user_api.entity.AccountEntity;

public interface AccountService {
    //callout account service implementations
    AccountEntity createAccount(AccountDto accountDto);

}
