package br.com.generation.exercicios;

	public class Avi�o {
	
//Atributos
		String nome;
		String Marca;
		int ano;
		int velocidade;
		int freiar;
	
//M�todos
		void acelerar(int aceleracao) {
			velocidade +=aceleracao;
		}
		void freiar(int reduzir) {
			velocidade -=reduzir;
		}
}
