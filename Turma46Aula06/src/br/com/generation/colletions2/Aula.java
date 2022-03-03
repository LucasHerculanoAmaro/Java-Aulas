package br.com.generation.colletions2;

public class Aula {
	
	//Atributos - variáveis
	private String titulo;
	private int tempo;
	
	//Construtor da classe
	public Aula(String titulo, int tempo) {
		super();
		this.titulo = titulo;
		this.tempo = tempo;
	}
	
	//Mátodo de acesso e recuperação
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getTempo() {
		return tempo;
	}
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	
	public String toString() {
		return "\nAula: " + this.titulo + " | " + this.tempo + " minuto";
	}	
	
}
