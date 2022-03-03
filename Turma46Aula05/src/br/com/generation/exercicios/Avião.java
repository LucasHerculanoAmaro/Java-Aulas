package br.com.generation.exercicios;

	public class Avião {
	
//Atributos
		String nome;
		String Marca;
		int ano;
		int velocidade;
		int freiar;
	
//Métodos
		void acelerar(int aceleracao) {
			velocidade +=aceleracao;
		}
		void freiar(int reduzir) {
			velocidade -=reduzir;
		}
}
