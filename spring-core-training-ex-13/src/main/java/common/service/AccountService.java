package common.service;

import common.model.Account;

import java.util.List;

public interface AccountService {
    Account findAccount(String number);
    List<Account> findAllAccounts();
}
