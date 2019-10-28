package com.expenses.account.repository;

import com.expenses.account.domain.Account;
import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<Account, String>{

	Account findByName(String name);
	
}
