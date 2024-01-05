package edu.deisesales.model;

import edu.deisesales.entity.Account;

public class CheckingAccount extends Account implements Transactions {
	
	public CheckingAccount() {
		
	}
	
	// Método para sacar: Valida se o valor solicitado é menor ou igual ao saldo disponível
	@Override
	public void withdraw(double value) {
		if (value <= balance) {
			balance -= value;
			System.out.println("Valor R$ " + value + " sacado com sucesso.");
		} else {
			System.out.println("Saldo insuficiente para saque de R$ " + value);
		}
	}

	// Método de depósito: Valida se o valor solicitado é menor ou igual ao saldo disponível
	@Override
	public void deposit(double value) {
		if (value <= balance) {
			balance -= value;
			System.out.println("Valor R$ " + value + " sacado com sucesso.");
		} else {
			System.out.println("Saldo insuficiente para saque de R$ " + value);
		}
	}

	// Método de transferência entre contas
	@Override
	public void transference(double value, CheckingAccount targetAccount) {
		withdraw(value);
		targetAccount.deposit(value);
	}

	// Método para imprimir o extrato
	@Override
	public void printBankStatement() {
		System.out.println("----- Extrato da Conta Corrente -----");
		System.out.println(String.format("Agência: %d", this.agency));
		System.out.println(String.format("Conta corrente: %d", this.number));
		System.out.println(String.format("Saldo: %d", this.balance));
		
	}
}
