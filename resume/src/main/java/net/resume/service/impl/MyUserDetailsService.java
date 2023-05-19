package net.resume.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;


import net.resume.model.Account;
import net.resume.service.AccountService;

public class MyUserDetailsService implements UserDetailsService{

	
	@Autowired
	private AccountService accountService;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Optional<Account> optional = accountService.findByEmail(username);
		
		if(!optional.isPresent()) {
			throw new UsernameNotFoundException("Account Not Found");
		}
		
		Account account = optional.get();
		
		List<GrantedAuthority> grantedAuthorities = account
				.getAuthorities()
				.stream()
				.map(authority -> new SimpleGrantedAuthority(authority.getName()))
				.collect(Collectors.toList());
		
		return new org.springframework.security.core.userdetails.User(account.getEmail(), account.getPassword(),
				grantedAuthorities);
	}

}
