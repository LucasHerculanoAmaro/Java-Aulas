package br.com.generation.interfacee;

public class Preguica implements Animal{

	@Override
	public void somAnimal() {
		System.out.println("A pregui�a est� gritando: AAAAAAAAAhhhh!");		
	}

	@Override
	public void dormir() {
		System.out.println("A pregui�a esta�com pregui�a, dormindo...");		
	}
	
	@Override
	public void comer() {
		System.out.println("Pregui�a comendo...");
	}

}
