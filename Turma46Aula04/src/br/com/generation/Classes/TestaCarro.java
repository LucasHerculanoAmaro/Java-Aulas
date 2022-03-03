package br.com.generation.Classes;

public class TestaCarro {

	public static void main(String[] args) {

		Carro c1 = new Carro();
		
		c1.modelo = "Corolal";
		c1.marca = "Toyota";
		c1.anoFabricacao = 2003;
		c1.velocidade = 0;
		//c1.parada =0;
		
		c1.acelerar(120);
			System.out.println("O carro está acelerando..." + c1.velocidade + " Km/h");
		
		c1.freiar(60);
		System.out.println("\nO carro rediziu a velocidade..." + c1.velocidade + " Km/h" );
		
	}

}
