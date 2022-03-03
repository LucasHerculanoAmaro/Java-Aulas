package br.com.generation.herança;

import java.util.Scanner;

public class TesteTadoMundo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o nome do Funcionário: ");
		String nome = entrada.next();
		System.out.println("Digite a idade do Funcionário: ");
		int idade = entrada.nextInt();
				
		System.out.println("Digite o salário do Funcionário: ");
		double salario = entrada.nextInt();
		
		Professor pf1 = new Professor();
		
			pf1.setNome("Cortella");
			pf1.setIdade(50);
			pf1.setEndereço("Rua 2 de Julho, 30");
			pf1.setDisciplina("História");
			pf1.setSalario(1000.0);
			
			System.out.println("Nome: " + pf1.getNome());
			System.out.println("Idade: " + pf1.getIdade());
			System.out.println("Endereço: " + pf1.getEndereço());
			System.out.println("Disciplina: " + pf1.getDisciplina());
			System.out.println("" + pf1.getSalario());
		
	}

}
