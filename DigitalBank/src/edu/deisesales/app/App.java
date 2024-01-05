package edu.deisesales.app;

import edu.deisesales.entity.Client;
import edu.deisesales.model.CheckingAccount;
import edu.deisesales.model.SavingsAccount;

public class App {

	public static void main(String[] args) {
		
		Client client1 = new Client();
		client1.setName("Deise");		
		
		CheckingAccount cc = new CheckingAccount(client1);
		SavingsAccount cp = new SavingsAccount(client1);
		
		cc.deposit(100);
		cc.printBankStatement();
		cc.transference(50, cp);
		cc.printBankStatement();
		cp.printBankStatement();

	}

}
