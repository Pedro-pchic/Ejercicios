package Lambdas;

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Comparator;
	import java.util.List;
	
	public class ejercicio1 {
	    public static void main(String[] args) {
	        List<String> lista = new ArrayList<>();
	        lista.add("banana");
	        lista.add("manzana");
	        lista.add("cereza");
	        lista.add("kiwi");
	        lista.add("frambuesa");

	        // Ordenar alfabéticamente
	        Collections.sort(lista, (s1, s2) -> s1.compareTo(s2));
	        System.out.println("Orden alfabético: " + lista);

	        // Ordenar por longitud
	        Collections.sort(lista, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
	        System.out.println("Orden por longitud: " + lista);
	    }
	}
