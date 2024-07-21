package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

	public class ejercicio3 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Introduce un texto: ");
	        String texto = scanner.nextLine();

	        // Eliminamos puntuación y convertimos a minúsculas
	        texto = texto.replaceAll("[^a-zA-Z0-9\\s]", "").toLowerCase();

	        String[] palabras = texto.split("\\s+");

	        Map<String, Integer> frecuencia = new HashMap<>();

	        for (String palabra : palabras) {
	            frecuencia.put(palabra, frecuencia.getOrDefault(palabra, 0) + 1);
	        }

	        for (Map.Entry<String, Integer> entrada : frecuencia.entrySet()) {
	            System.out.println(entrada.getKey() + ": " + entrada.getValue());
	        }
	    }
	}
