package br.com.generation.colletions2;

public class Aula {
	
	//Atributos - vari�veis
	private String titulo;
	private int tempo;
	
	//Construtor da classe
	public Aula(String titulo, int tempo) {
		super();
		this.titulo = titulo;
		this.tempo = tempo;
	}
	
	//M�todo de acesso e recupera��o
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
