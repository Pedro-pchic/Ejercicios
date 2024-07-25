package Lambdas;

	import java.util.ArrayList;
	import java.util.Comparator;
	import java.util.List;
	import java.util.Optional;

	public class ejercicio2 {
	    public static void main(String[] args) {
	        List<Integer> numeros = new ArrayList<>();
	        numeros.add(10);
	        numeros.add(3);
	        numeros.add(5);
	        numeros.add(8);
	        numeros.add(2);

	        Optional<Integer> max = numeros.stream()
	                                       .max(Comparator.comparingInt(n -> n));
	        Optional<Integer> min = numeros.stream()
	                                       .min(Comparator.comparingInt(n -> n));

	        max.ifPresent(valorMax -> System.out.println("Valor máximo: " + valorMax));
	        min.ifPresent(valorMin -> System.out.println("Valor mínimo: " + valorMin));
	    }
	}
