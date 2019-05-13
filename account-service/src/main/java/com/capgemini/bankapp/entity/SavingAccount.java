package com.capgemini.bankapp.entity;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
@Entity
public class SavingAccount extends BankAccount {

private float salary;

public SavingAccount() {
	super();
}

public SavingAccount(String accountName,float accountBalance,String accountType,float salary) {
	super(accountName,accountBalance,accountType);
	this.salary = salary;
}

public float getSalary() {
	return salary;
}

public void setSalary(float salary) {
	this.salary = salary;
}

@Override
public String toString() {
	return "SavingAccount [salary=" + salary + "]";
}





}
