package br.com.generation.exercicios;

import java.util.Scanner;

public class TestaAnimais {
	
	public static void main(String [] args){
					
		Cavalo pocoto = new Cavalo();
		Preguica flash = new Preguica();
		Cachorro dog = new Cachorro();
		
		pocoto.getNome();
			System.out.println("O nome do Cavalo � " + pocoto.getNome() + ".");
		pocoto.getIdade();
			System.out.println("A Idade do Cavalo � " + pocoto.getIdade() + ".\n");
		
		flash.getNome();
			System.out.println("O nome da Pregui�a � " + flash.getNome() + ".");
		flash.getIdade();
			System.out.println("A idade da Pregui�a � " + flash.getIdade() + ".\n");
			
		dog.getNome();
			System.out.println("O nome do Cavalo � " + dog.getNome() + ".");
		dog.getIdade();
			System.out.println("A Idade do Cavalo � " + dog.getIdade() + ".\n");
	}
}
