package com.capgemini.bankapp.service;

import java.util.List;
import java.util.Optional;

import com.capgemini.bankapp.entity.BankAccount;

public interface BankAccountService {
	

	public BankAccount add(BankAccount account);
	public Optional<BankAccount> getAccountById(long id);
	public List<BankAccount>  getAllAccount();
	public boolean deleteById(long id);
	public boolean update(BankAccount account);
	

}
