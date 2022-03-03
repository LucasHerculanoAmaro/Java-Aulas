package br.com.generation.colletions;

import java.util.ArrayList;

public class TestaCollection {

	public static void main(String[] args) {

//Definindo Strings
		String aula1 = "Bloco - I Java";             
		String aula2 = "Bloco II - BackEnd";     
		String aula3 = "Bloco III - FrontEnda"; 
		
//Armazenando as Strings
		ArrayList<String> aulas = new ArrayList<>();
			aulas.add(aula1);
			aulas.add(aula2);
			aulas.add(aula3);
			
//Saída de Dados
	/*	System.out.println(aulas);
			
//Caso queira remover uma Strings
		aulas.remove(1);
			System.out.println(aulas);//--> Mostra as  Strings não eliminadas
			
			//for each
		for(String i: aulas) {
			System.out.println("Aula: " + i);
		} */
		
	//	String primeiraAula = aulas.get(0);
		//	System.out.println(primeiraAula); 
			
			//System.out.println(aulas.get(0));
		
		for(int i = 0; i < aulas.size(); i++) {
			System.out.println((i + 1) + "º Aula: " + aulas.get(i));
		}
	}

}
