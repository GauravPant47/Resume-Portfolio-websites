package net.resume.service;

import java.util.Optional;

import net.resume.model.Account;

public interface AccountService {
	Account save(Account account);

	Optional<Account> findOneByEmail(String email);
}
