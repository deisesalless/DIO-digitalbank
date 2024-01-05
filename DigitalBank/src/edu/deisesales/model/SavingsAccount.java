package edu.deisesales.model;

import edu.deisesales.entity.Account;
import edu.deisesales.entity.Client;

public class SavingsAccount extends Account {
	
	public SavingsAccount(Client client) {
		super(client);
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

	// Método de depósito: Valida se o valor a ser depositado é maior que 0
	@Override
	public void deposit(double value) {
		if (value > 0) {
			balance += value;
			System.out.println("Valor R$ " + value + " depositado com sucesso em sua conta poupança.");
		} else {
			System.out.println("Saldo insuficiente para saque de R$ " + value);
		}
	}
	
	// Método para imprimir o extrato
	@Override
	public void printBankStatement() {
		System.out.println("----- Extrato da Conta Poupança -----");
		System.out.println(String.format("Titular: %s", this.client.getName()));
		System.out.println(String.format("Agência: %d", this.agency));
		System.out.println(String.format("Conta poupança: %d", this.number));
		System.out.println(String.format("Saldo: %.2f", this.balance));
		
	}
}
