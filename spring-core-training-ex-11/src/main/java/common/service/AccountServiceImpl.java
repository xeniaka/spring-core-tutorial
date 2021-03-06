package common.service;

import common.aspect.Loggable;
import common.dao.AccountDao;
import common.model.Account;
import common.validation.AccountValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    private final AccountValidator accountValidation;
    private final AccountDao accountDao;

    @Autowired
    public AccountServiceImpl(AccountValidator accountValidator, AccountDao accountDao) {
        this.accountValidation = accountValidator;
        this.accountDao = accountDao;
    }

    @Loggable
    public Account findAccount(String number) {
        System.out.println("findAccount() called");
        return null;
    }

    @Loggable
    public List<Account> findAllAccounts() {
        return null;
    }
}
