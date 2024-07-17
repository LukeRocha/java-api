package com.example.java_user_api.mapper;

import com.example.java_user_api.dto.AccountDto;
import com.example.java_user_api.entity.AccountEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AccountMapper {
    // Assinaturas dos métodos de mapeamento
    AccountEntity DtoToEntity(AccountDto accountDto);
    AccountDto toDto(AccountEntity accountEntity);
}


//Resumo
//@Component: Para qualquer Bean genérico.
//@Service: Para classes de serviço (lógica de negócios).
//@Repository: Para classes que interagem com o banco de dados.
//@Controller: Para classes que lidam com requisições HTTP (web MVC).
//@RestController: Para classes que lidam com APIs REST.
//@Autowired: Para injeção de dependências automática.
//Essas anotações ajudam o Spring a gerenciar os objetos e suas dependências de forma automática, facilitando muito o desenvolvimento e a manutenção do código.