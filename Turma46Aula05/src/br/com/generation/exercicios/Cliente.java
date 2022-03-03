package br.com.generation.exercicios;

public class Cliente {
	
	public String nome;
	public int numero;
	public int valor;
	public int dinheiro;
	
	 public void comprar(int pagamento) {
		 dinheiro += pagamento;
	} 
	 public void pegar(int recolhimento) {
		 valor -= recolhimento;
	}
}
