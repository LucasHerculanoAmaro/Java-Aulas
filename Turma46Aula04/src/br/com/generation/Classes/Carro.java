package br.com.generation.Classes;

public class Carro {
	
	//Atributos - vari�vel
	String marca;
	String modelo;
	int anoFabricacao;
	int velocidade;
	int parada;

	
	//M�todos - verbos
	void acelerar(int aceleracao) {
		velocidade = velocidade + aceleracao;
		
	}
	void freiar(int reducao) {
		velocidade =  velocidade - reducao;
	}
}
