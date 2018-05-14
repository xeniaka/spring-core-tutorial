package common.service;

import common.dao.AccountDao;
import common.validation.AccountValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    private final AccountValidator accountValidation;
    private final AccountDao accountDao;

    @Autowired
    public AccountServiceImpl(AccountValidator accountValidator, AccountDao accountDao) {
        this.accountValidation = accountValidator;
        this.accountDao = accountDao;
    }
}
