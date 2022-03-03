package br.com.generation.TestaMetodo;

public class MetodoFora {
		
		public static String metodo6(int i, int f) {
			String numeroString = "";
			
			for(int c = i; c <= f; c++) {
				numeroString += c + " - "; 
			}
			
			return numeroString;
		}
	}

