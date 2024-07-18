package com.example.java_user_api.mapper;

import com.example.java_user_api.dto.AccountDto;
import com.example.java_user_api.entity.AccountEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface AccountMapper {
    AccountEntity DtoToEntity(AccountDto accountDto);
    AccountDto toDto(AccountEntity accountEntity);
}
