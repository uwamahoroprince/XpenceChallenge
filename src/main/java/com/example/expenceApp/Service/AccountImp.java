package com.example.expenceApp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.expenceApp.Entity.Account;
import com.example.expenceApp.Repository.AccountRepository;

@Service
public class AccountImp implements AccountService {
    @Autowired
    private AccountRepository accountRepository;
    @Override
    public Account postAccount(Account account) {
	// TODO Auto-generated method stub
	return accountRepository.save(account);
    }
    @Override
    public List<Account> getAccounts() {
	// TODO Auto-generated method stub
	return accountRepository.findAll();
    }

}
