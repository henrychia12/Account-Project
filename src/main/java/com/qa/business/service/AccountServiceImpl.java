package com.qa.business.service;


import java.util.HashMap;

import javax.inject.Inject;

import com.google.gson.Gson;
import com.qa.persistence.domain.Account;
import com.qa.persistence.repository.AccountRepository;
import com.qa.util.JSONUtil;

public class AccountServiceImpl implements AccountService{
	
	@Inject
	private AccountRepository repo;
	private JSONUtil util;
	
	@Override
	public String getAllAccounts() {
		// TODO Auto-generated method stub
		return repo.getAllAccounts();
	}
	@Override
	public String addAccount(String account) {
		// TODO Auto-generated method stub
		return repo.createAccount(account);
	}
	@Override
	public String deleteAccount(Long id) {
		// TODO Auto-generated method stub
		return repo.deleteAccount(id);
	}
	@Override
	public String updateAccount(Long id, String willUpdateAccount) {
		// TODO Auto-generated method stub
		return repo.updateAccount(id, willUpdateAccount);
	}
	
	public void setRepo(AccountRepository repo) {
		this.repo = repo;
	}

}