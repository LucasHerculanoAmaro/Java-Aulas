package br.com.generation.exercicios;

import java.util.Scanner;

public class TestaAnimais {
	
	public static void main(String [] args){
					
		Cavalo pocoto = new Cavalo();
		Preguica flash = new Preguica();
		Cachorro dog = new Cachorro();
		
		pocoto.getNome();
			System.out.println("O nome do Cavalo é " + pocoto.getNome() + ".");
		pocoto.getIdade();
			System.out.println("A Idade do Cavalo é " + pocoto.getIdade() + ".\n");
		
		flash.getNome();
			System.out.println("O nome da Preguiça é " + flash.getNome() + ".");
		flash.getIdade();
			System.out.println("A idade da Preguiça é " + flash.getIdade() + ".\n");
			
		dog.getNome();
			System.out.println("O nome do Cavalo é " + dog.getNome() + ".");
		dog.getIdade();
			System.out.println("A Idade do Cavalo é " + dog.getIdade() + ".\n");
	}
}
