package com.wipro.common.service;

import com.wipro.common.dao.AccountDao;
import com.wipro.common.validation.AccountValidator;

public class AccountServiceImpl implements AccountService {

    private final AccountValidator accountValidation;
    private final AccountDao accountDao;

    public AccountServiceImpl(AccountValidator accountValidator, AccountDao accountDao) {
        this.accountValidation = accountValidator;
        this.accountDao = accountDao;
    }
}
