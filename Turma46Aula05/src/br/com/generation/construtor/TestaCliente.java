package br.com.generation.construtor;

import br.com.generation.exercicios.Cliente;

public class TestaCliente {

	public static void main(String[] args) {

		Cliente c1 = new Cliente();
		
		c1.nome = "Lucas";
		c1.numero = 250296;
		c1.dinheiro = 100;
		c1.valor = 0;
		
		c1.comprar(0);
			System.out.println("O " + c1.nome +", com o número de flidaelidade " + c1.numero +", comprou uma Calça avaliada em " + c1.dinheiro + " Reais." );
			
		c1.pegar(0);
			System.out.println("O troco a calça é de " + c1.valor +" Reais.\n\nVolte sempre!");
	}
}
