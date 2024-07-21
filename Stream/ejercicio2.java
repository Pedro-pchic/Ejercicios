package Stream;
		
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

	public class ejercicio2 {
	    public static void main(String[] args) {
	        List<String> palabras = Arrays.asList("manzana", "banana", "cereza", "dátil", "kiwi");

	        Map<Integer, List<String>> agrupadasPorLongitud = palabras.stream()
	                                                                  .collect(Collectors.groupingBy(String::length));

	        System.out.println("Palabras agrupadas por longitud: " + agrupadasPorLongitud);
	    }
	}

