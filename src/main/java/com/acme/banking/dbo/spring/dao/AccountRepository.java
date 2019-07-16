package com.acme.banking.dbo.spring.dao;

import com.acme.banking.dbo.spring.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

/** In production will be used code-generated implementation by Spring-data-jpa module */
@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
    Collection<Account> findByEmail(String email);
    /** TODO Intro to Optional class */

    ResponseEntity<List<String>> getAllAccountsRE();
}
