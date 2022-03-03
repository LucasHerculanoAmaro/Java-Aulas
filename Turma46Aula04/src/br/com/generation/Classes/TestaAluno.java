package br.com.generation.Classes;

public class TestaAluno {

	public static void main(String[] args) {

		Aluno ali = new Aluno();
		Aluno al2 = new Aluno();
		
		ali.nome = "Lucas";
		ali.idade = 25;
		ali.endereco = "Rua: Batista Locatello - 88";
		
		al2.nome = "Juliana";
		al2.idade = 29;
		al2.endereco = "Rua: Nicolas Bernier - 14";
		
		System.out.println(ali.nome);
		System.out.println(ali.idade);
		System.out.println(ali.endereco);
		ali.estudar();
		ali.fazerProva();
		
		System.out.println(al2.nome);
		System.out.println(al2.idade);
		System.out.println(al2.endereco);
		al2.estudar();
		al2.fazerProva();
		
	}

}
