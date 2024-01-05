package edu.deisesales.entity;

import edu.deisesales.model.Transactions;

public abstract class Account implements Transactions {
	
	private static final int STANDARD_AGENCY = 1;
	private static int SEQUENTIAL = 1;
	
	protected int agency;
	protected int number;
	protected double balance;
	protected Client client;
	
	public Account(Client client) {
		this.agency = Account.STANDARD_AGENCY;
		this.number = SEQUENTIAL++;
		this.client = client;
	}

	public int getAgency() {
		return agency;
	}

	public void setAgency(int agency) {
		this.agency = agency;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	// Método de transferência entre contas
	@Override
	public void transference(double value, Transactions targetAccount) {
		withdraw(value);
		System.out.println(value);
		targetAccount.deposit(value);
	}

}
