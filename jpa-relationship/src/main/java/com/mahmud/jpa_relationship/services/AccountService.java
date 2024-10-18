package com.mahmud.jpa_relationship.services;

import com.mahmud.jpa_relationship.models.Account;
import com.mahmud.jpa_relationship.repositories.AccountRepository;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }
}
