package edu.deisesales.entity;

public abstract class Account {
	
	private static final int STANDARD_AGENCY = 1;
	private static final int SEQUENTIAL = 1;
	
	protected int agency;
	protected int number;
	protected double balance;
	
	public Account() {
		this.agency = Account.STANDARD_AGENCY;
		this.number = Account.SEQUENTIAL;
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
}
