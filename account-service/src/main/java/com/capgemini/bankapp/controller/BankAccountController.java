package com.capgemini.bankapp.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.bankapp.entity.BankAccount;
import com.capgemini.bankapp.service.BankAccountService;

@RestController
public class BankAccountController {

	@Autowired
	private BankAccountService service;

	@PostMapping("/account")
	public ResponseEntity<BankAccount> addNewAccount(@RequestBody BankAccount account) {
		account = service.add(account);
		return new ResponseEntity<BankAccount>(account, HttpStatus.CREATED);

	}

	@GetMapping("/account")
	public ResponseEntity<List<BankAccount>> getAllAccount() {
		List<BankAccount> account = service.getAllAccount();
		return new ResponseEntity<List<BankAccount>>(account, HttpStatus.OK);

	}
	
	@GetMapping("/account/{id}")
	public ResponseEntity<BankAccount> getAccountById(@PathVariable("id") int id) {
		Optional<BankAccount> account = service.getAccountById(id);
		if (!account.isPresent()) {
			return new ResponseEntity<BankAccount>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<BankAccount>(account.get(), HttpStatus.OK);

	}

	@PutMapping("/account/{id}")
	public ResponseEntity<BankAccount> updateAccount(@RequestBody BankAccount account) {

		if (!service.update(account)) {
			return new ResponseEntity<BankAccount>(HttpStatus.NOT_FOUND);

		}
		return new ResponseEntity<BankAccount>(account, HttpStatus.OK);
	}

	

	@DeleteMapping("account/{id}")
	public ResponseEntity<BankAccount> deleteAccount(@PathVariable("id") int id) {
		if (!service.deleteById(id)) {
			return new ResponseEntity<BankAccount>(HttpStatus.NOT_FOUND);

		}
		return new ResponseEntity<BankAccount>(HttpStatus.OK);

	}
}
