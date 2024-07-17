package com.example.java_user_api.repository;

import com.example.java_user_api.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<AccountEntity, Long> {
    // Aqui você pode adicionar métodos adicionais específicos, se necessário
}