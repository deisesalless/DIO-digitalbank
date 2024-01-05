package edu.deisesales.model;

public interface Transactions {
	
	public void withdraw(double value);
	
	public void deposit(double value);
	
	public void transference(double value, CheckingAccount targetAccount);
	
	public void printBankStatement();
	
}
