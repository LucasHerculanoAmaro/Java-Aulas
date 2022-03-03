package br.com.generation.Classes;

public class Carro {
	
	//Atributos - variável
	String marca;
	String modelo;
	int anoFabricacao;
	int velocidade;
	int parada;

	
	//Mátodos - verbos
	void acelerar(int aceleracao) {
		velocidade = velocidade + aceleracao;
		
	}
	void freiar(int reducao) {
		velocidade =  velocidade - reducao;
	}
}
