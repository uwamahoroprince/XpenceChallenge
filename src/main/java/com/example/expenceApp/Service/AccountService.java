package com.example.expenceApp.Service;

import java.util.List;

import com.example.expenceApp.Entity.Account;

public interface AccountService{
     public Account postAccount(Account account);

    public List<Account> getAccounts();

} 
