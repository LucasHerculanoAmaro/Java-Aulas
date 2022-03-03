package br.com.generation.interfacee;

public class TestaAnimal {

	public static void main(String[] args) {

		AnimalComer ac = new AnimalComer();
		
		ac.fazerAnimalcomer(new Preguica());
		ac.fazerAnimalcomer(new Cavalo());
		ac.fazerAnimalcomer(new Cachorro());
		
		/*Cachorro dog1 = new Cachorro();
			dog1.somAnimal();
			dog1.dormir();
			dog1.comer();
				System.out.println();
			
		Cavalo cav1 = new Cavalo();
			cav1.somAnimal();
			cav1.dormir();
			cav1.comer();
		 		System.out.println();
		 
		 Preguica pre1 = new Preguica();
		 	pre1.somAnimal();
		 	pre1.dormir();
		 	pre1.comer();*/
	}
}
