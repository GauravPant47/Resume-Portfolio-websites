package net.resume.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import net.resume.model.Account;
import net.resume.repository.AccountRepository;
import net.resume.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService{
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	@Autowired
	private AccountRepository accountRepository;

	@Override
	public Account savedata(Account account) {
		account.setPassword(passwordEncoder.encode(account.getPassword()));
		return accountRepository.save(account);
	}

	@Override
	public Optional<Account> findByEmail(String email) {
		return accountRepository.findOneByEmail(email);
	}
	
	
}