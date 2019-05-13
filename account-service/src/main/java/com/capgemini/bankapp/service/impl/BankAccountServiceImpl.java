package com.capgemini.bankapp.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.bankapp.dao.BankAccountDao;
import com.capgemini.bankapp.entity.BankAccount;
import com.capgemini.bankapp.service.BankAccountService;

@Service
public class BankAccountServiceImpl implements BankAccountService {
	
	@Autowired
	BankAccountDao dao;
	

	@Override
	public BankAccount add(BankAccount account) {
			
		return dao.save(account);
	}

	@Override
	public Optional<BankAccount> getAccountById(long id) {
		Optional<BankAccount> account=dao.findById(id);
		return account;
	}

	@Override
	public List<BankAccount> getAllAccount() {
		return dao.findAll();
		
	}

	@Override
	public boolean deleteById(long id) {
		dao.deleteById(id);
		return true;
	}

	@Override
	public boolean update(BankAccount account) {
		
		Optional<BankAccount> acc = dao.findById(account.getAccountId());
		if (acc.isPresent()) {
			dao.save(account);
			return true;

		}
		return false;
	}
	}


