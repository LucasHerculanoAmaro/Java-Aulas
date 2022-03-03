package br.com.generation.herança;

public class Funcionario extends Pessoas{
	
	private double salario;
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario = (salario * 1.10);
	}

}
