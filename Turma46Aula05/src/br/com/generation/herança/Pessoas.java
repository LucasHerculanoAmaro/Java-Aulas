package br.com.generation.herança;

public class Pessoas {
	
	//Atributos privados --> para encapsulamento.
	private String nome;
	private int idade;
	private String endereço;
	
	//Setters / Getters --> Métodos de acesso e recuperação.
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}	
}
