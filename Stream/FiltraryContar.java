package Stream;
import java.util.Arrays;
import java.util.List;

public class FiltraryContar {
	public static void main(String [] args) {
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		
		long cantidadPares = numeros.stream()
									.filter(n -> n % 2 == 0)
									.count();
		
		System.out.println("Cantidad de numeros pares:"+ cantidadPares);
	}
}
