package common.service;

import common.dao.AccountDao;
import common.validation.AccountValidator;

public class AccountServiceImpl implements AccountService {

    private final AccountValidator accountValidation;
    private final AccountDao accountDao;

    public AccountServiceImpl(AccountValidator accountValidator, AccountDao accountDao) {
        this.accountValidation = accountValidator;
        this.accountDao = accountDao;
    }
}
