package com.generation.BlogPessoal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.BlogPessoal.model.Tema;
import com.generation.BlogPessoal.repository.TemaRepository;

@RestController
@RequestMapping ("/temas" )
@CrossOrigin(origins = "*", allowedHeaders = "*") 
public class TemaController {
	
	@Autowired
	private TemaRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Tema>> getAll(){
		return ResponseEntity.ok(repository. findAll());
	}
	
	@GetMapping("/{id}") 
	public ResponseEntity<Tema> getById(@PathVariable long id){
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound(). build());
	}
	
	@SuppressWarnings("rawtypes")
	@GetMapping("/nome/{nome}") 
	public ResponseEntity<List> getByName(@PathVariable String nome){
		return ResponseEntity.ok(repository.findAllByDescricaoContainingIgnoreCase(nome));
	}
	
	@PostMapping
	public ResponseEntity<Tema> post (@RequestBody Tema Tema){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(Tema));
	}
	
	@PutMapping
	public ResponseEntity<Tema> put (@RequestBody Tema Tema){
		return ResponseEntity.ok(repository.save(Tema));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
}
