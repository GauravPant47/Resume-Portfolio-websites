package net.resume.service;

import java.util.Optional;

import net.resume.model.Account;

public interface AccountService {
	Account savedata(Account account);
	
	Optional<Account> findByEmail(String email);
	
	
}
