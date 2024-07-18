package com.example.java_user_api;

import com.example.java_user_api.mapper.AccountMapper;
import com.example.java_user_api.mapper.AccountMapperImpl;
import com.example.java_user_api.service.AccountService;
import com.example.java_user_api.implementations.AccountServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public AccountService accountService(){
        return new AccountServiceImpl();
    }

    @Bean
    public AccountMapper accountMapper(){
        return new AccountMapperImpl();
    }
}
