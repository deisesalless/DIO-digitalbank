package edu.deisesales.model;

import edu.deisesales.entity.Account;
import edu.deisesales.entity.Client;

public class CheckingAccount extends Account {
	
	public CheckingAccount(Client client) {
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

	// Método de depósito: Valida se o valor solicitado é menor ou igual ao saldo disponível
	@Override
	public void deposit(double value) {
		if (value > 0.0) {
			balance += value;
			System.out.println("Valor R$ " + value + " depositado com sucesso em sua conta corrente.");
		} else {
			System.out.println("Não é possível depositar o valor de R$ " + value);
		}
	}

	// Método para imprimir o extrato
	@Override
	public void printBankStatement() {
		System.out.println("----- Extrato da Conta Corrente -----");
		System.out.println(String.format("Titular: %s", this.client.getName()));
		System.out.println(String.format("Agência: %d", this.agency));
		System.out.println(String.format("Conta corrente: %d", this.number));
		System.out.println(String.format("Saldo: %.2f", this.balance));
		
	}
}
