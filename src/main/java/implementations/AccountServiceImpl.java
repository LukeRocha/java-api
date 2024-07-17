package implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;


import com.example.java_user_api.dto.AccountDto;
import com.example.java_user_api.entity.AccountEntity;
import com.example.java_user_api.mapper.AccountMapper;
import com.example.java_user_api.service.AccountService;
import com.example.java_user_api.repository.AccountRepository;

@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountMapper accountMapper;

    @Autowired
    private AccountRepository accountRepository;

    @Override
    @Transactional
    public AccountEntity createAccount(AccountDto accountDto){
        AccountEntity accountEntity = accountMapper.DtoToEntity(accountDto);

        System.out.println(accountEntity);
        return accountRepository.save(accountEntity);


    };

}
