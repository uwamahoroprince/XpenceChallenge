package com.example.expenceApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.expenceApp.Entity.Account;
import com.example.expenceApp.Service.AccountService;

@RestController
public class AccountController {

    @Autowired
    private AccountService acountService;

    @PostMapping("/Account")
    public Account postAccount(@RequestBody Account account) {

	return acountService.postAccount(account);
    }

    @GetMapping("/Accounts")
    public List<Account> getAccounts() {
	return acountService.getAccounts();
    }

}
