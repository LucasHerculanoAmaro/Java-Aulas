package br.com.generation.repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import br.com.generation.model.Caminhao;
import br.com.generation.model.Motorista;
import br.com.generation.model.Seguro;

public class Motoristas {
	
	private Map<String, Optional<Motorista>> motoristas = new HashMap<>();
	
	public Motoristas() {
		
		Seguro seguro = new Seguro("Parcial - n�o cobre roubo!", 5000.00);
		Caminhao caminhao = new Caminhao("Mercedez Benz", Optional.ofNullable(seguro));
		
		Optional<Motorista> motoristaJoao = Optional.of(new Motorista("Jo�o", 40, Optional.ofNullable(caminhao)));
		Optional<Motorista> motoristaJose = Optional.of(new Motorista("Jos�", 25, Optional.ofNullable(null))); 
		
		motoristas.put("Jo�o", motoristaJoao);
		motoristas.put("Jos�", motoristaJose);
	}
	public Optional<Motorista> porNome(String nome) {
		return motoristas.get(nome);
	}

}
