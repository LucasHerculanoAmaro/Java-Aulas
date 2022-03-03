package br.com.generation.interfacee;

public class Preguica implements Animal{

	@Override
	public void somAnimal() {
		System.out.println("A preguiça está gritando: AAAAAAAAAhhhh!");		
	}

	@Override
	public void dormir() {
		System.out.println("A preguiça esta´com preguiça, dormindo...");		
	}
	
	@Override
	public void comer() {
		System.out.println("Preguiça comendo...");
	}

}
