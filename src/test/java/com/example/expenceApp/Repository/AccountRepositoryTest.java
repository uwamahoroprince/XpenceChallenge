package com.example.expenceApp.Repository;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;

import com.example.expenceApp.Entity.Account;


@SpringBootTest
class AccountRepositoryTest {
    @Autowired
   private AccountRepository accountRepo;
    @Test
    public void testFindAllAccountRepository() {
	List<Account> allAccount = accountRepo.findAll();
	
	assertEquals(4, allAccount.size());
    }

}
