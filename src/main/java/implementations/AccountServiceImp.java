package implementations;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;


import com.example.java_user_api.dto.AccountDto;
import com.example.java_user_api.entity.AccountEntity;
import com.example.java_user_api.mapper.AccountMapper;
import com.example.java_user_api.service.AccountService;

@Service
public class AccountServiceImp implements AccountService{

    @Autowired
    private AccountMapper accountMapper;

    @Autowired
    private AccountRepositoryImp accountRepository;

    @Override
    @Transactional
    public AccountEntity createAccount(AccountDto accountDto){
        AccountEntity accountEntity = accountMapper.DtoToEntity(accountDto);

        accountRepository.save(accountEntity);

        return null;
    };

}
