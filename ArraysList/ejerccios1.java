package ArraysList;

import java.util.ArrayList;
import java.util.List;

public class ejerccios1 {
		public static void main(String [] args) {
			List<String> name = new ArrayList<>();
			name.add("Perro");
			name.add("Gato");
			name.add("Vaca");
			name.add("Raton");
			name.add("Pez");
			name.add("Tiburo");
			name.add("Lagarto");
			name.add("Elefante");
			
			int contador = 0;
			while(contador < name.size()) {
				System.err.println(" El nombre es  :"+name.get(contador));
				contador++;
			}
		}
}
