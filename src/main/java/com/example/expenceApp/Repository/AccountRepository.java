package com.example.expenceApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.expenceApp.Entity.Account;
@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

}
