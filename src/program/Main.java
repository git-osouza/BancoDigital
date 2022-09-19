package program;

import application.Cliente;
import application.Conta;
import application.ContaCorrente;
import application.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Ederson Souza");
		Cliente cliente2 = new Cliente("Ederson Rodrigues");
		
		Conta cc = new ContaCorrente(cliente);
		cc.depositar(100);
		Conta cp = new ContaPoupanca(cliente2);
		cp.depositar(50);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		
	}
}
