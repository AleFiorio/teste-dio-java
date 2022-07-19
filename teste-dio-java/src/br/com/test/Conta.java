package br.com.test;

public class Conta {

	
	double saldo;
	int numero;
	String titular;
	
	void Deposito(double valor) {
		saldo += valor;
	}
}
