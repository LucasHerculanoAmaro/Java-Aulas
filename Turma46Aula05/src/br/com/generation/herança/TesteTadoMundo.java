package br.com.generation.heran�a;

import java.util.Scanner;

public class TesteTadoMundo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o nome do Funcion�rio: ");
		String nome = entrada.next();
		System.out.println("Digite a idade do Funcion�rio: ");
		int idade = entrada.nextInt();
				
		System.out.println("Digite o sal�rio do Funcion�rio: ");
		double salario = entrada.nextInt();
		
		Professor pf1 = new Professor();
		
			pf1.setNome("Cortella");
			pf1.setIdade(50);
			pf1.setEndere�o("Rua 2 de Julho, 30");
			pf1.setDisciplina("Hist�ria");
			pf1.setSalario(1000.0);
			
			System.out.println("Nome: " + pf1.getNome());
			System.out.println("Idade: " + pf1.getIdade());
			System.out.println("Endere�o: " + pf1.getEndere�o());
			System.out.println("Disciplina: " + pf1.getDisciplina());
			System.out.println("" + pf1.getSalario());
		
	}

}
