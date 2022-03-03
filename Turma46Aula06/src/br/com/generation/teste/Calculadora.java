package br.com.generation.teste;

public class Calculadora {
	
	public int somar(int numero1, int numero2) {
		System.out.println("A soma foi realizada com números inteiros.");
			return numero1 + numero2;		
	}

	public double somar(double numero1, double numero2) {
		System.out.println("A soma foi feita com números fracionários.");
			return numero1 + numero2;
	}
}
