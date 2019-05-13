package com.capgemini.bankapp.entity;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
@Entity
public class CurrentAccount extends BankAccount {

private float odLimit;

public CurrentAccount() {
	super();
}

public CurrentAccount( String accountHolderName, float accountBalance,String accountType,float odLimit) {
	super( accountHolderName, accountBalance,accountType);
	this.odLimit=odLimit;
}

public float getOdLimit() {
	return odLimit;
}

public void setOdLimit(float odLimit) {
	this.odLimit = odLimit;
}

@Override
public String toString() {
	return "CurrentAccount [odLimit=" + odLimit + "]";
}






}
