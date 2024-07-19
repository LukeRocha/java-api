package com.example.java_user_api.implementations;

import com.example.java_user_api.dto.AccountResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;

import com.example.java_user_api.dto.AccountDto;
import com.example.java_user_api.entity.AccountEntity;
import com.example.java_user_api.mapper.AccountMapper;
import com.example.java_user_api.service.AccountService;
import com.example.java_user_api.repository.AccountRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountMapper accountMapper;

    @Autowired
    private AccountRepository accountRepository;

    @Override
    @Transactional
    public AccountResponseDto createAccount(AccountDto accountDto){
        if(accountDto == null){
            return null;
        }

        AccountEntity accountEntity = accountMapper.DtoToEntity(accountDto);
        accountRepository.save(accountEntity);

        AccountResponseDto accountResponseDto = accountMapper.entityToResponseDto(accountEntity);

        return accountResponseDto;
    };

    public List<AccountResponseDto> listAccounts(){
        List <AccountEntity> accountList = accountRepository.findAll();
        return accountList.stream().map(accountMapper::entityToResponseDto).collect(Collectors.toList());
    }

    public AccountResponseDto listAccount(Long accountId){
        if(accountId == null){
            return null;
        }

        Optional<AccountEntity> account = accountRepository.findById(accountId);
        return accountMapper.entityToResponseDto(account.orElse(null));
    }

    public Boolean deleteAccount(Long accountId){
        if(accountId == null){
            return null;
        }

        accountRepository.deleteById(accountId);
        return true;
    }

    public AccountResponseDto updateAccount(AccountDto accountDto, Long accountId){
        if(accountDto == null){
            return null;
        }

        Optional<AccountEntity> updateAccount = accountRepository.findById(accountId);

        if (updateAccount.isPresent()) {
            AccountEntity accountEntity = updateAccount.get();
            accountEntity.setUserName(accountDto.getUserName());
            accountEntity.setEmail(accountDto.getEmail());
            accountEntity.setPassword(accountDto.getPassword());

            accountRepository.save(accountEntity);

            return accountMapper.entityToResponseDto(accountEntity);
        } else {

            return null;
        }

    }
}
