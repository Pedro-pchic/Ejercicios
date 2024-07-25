package HashMap;

import java.util.HashMap;
import java.util.Map;

public class ejercicio1 {
	public static void main (String [] args) {
		HashMap<Integer, String> empleado = new HashMap<>();
		empleado.put(5600, "Carlos");
		empleado.put(1500, "Paola");
		empleado.put(2500, "Vicente");
		empleado.put(1789, "Rodrigo");
		empleado.put(1589, "Felipe");
		empleado.put(4500, "Maria");
		empleado.put(3500, "Edgar");
		empleado.put(4120, "Elizabeth");
		System.out.println(empleado);
		
		System.out.println("Sueldo y empleado ");
		for(Map.Entry<Integer, String> entry :empleado.entrySet()) {
			System.out.println("Q "+entry.getKey()+ " Empleado " +entry.getValue());	
		}
		
	
	}
}