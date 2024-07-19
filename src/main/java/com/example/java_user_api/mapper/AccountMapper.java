package com.example.java_user_api.mapper;

import com.example.java_user_api.dto.AccountDto;
import com.example.java_user_api.dto.AccountResponseDto;
import com.example.java_user_api.entity.AccountEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AccountMapper {

    AccountEntity DtoToEntity(AccountDto accountDto);

    AccountDto entityToDto(AccountEntity accountEntity);

    AccountResponseDto entityToResponseDto(AccountEntity accountEntity);


}
