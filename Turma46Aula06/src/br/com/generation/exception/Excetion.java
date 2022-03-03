package br.com.generation.exception;

public class Excetion {

	public static void main(String[] args) {

		int[] vetor = new int[4];
		System.out.println("Antes da Excepition!");
		
		try {
		vetor[4] = 10;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("excepition consertada!");
				vetor[3] = 10;
					System.out.println(vetor[3]);
			
		}
	}

}
