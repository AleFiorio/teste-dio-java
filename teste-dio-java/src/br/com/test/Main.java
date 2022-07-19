package br.com.test;

public class Main {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		p1.idade = 19;
		p1.nome = "fulano";
		
		Conta c1 = new Conta();
		c1.numero = 1;
		c1.saldo = 100;
		c1.Deposito(200);
	}

}
