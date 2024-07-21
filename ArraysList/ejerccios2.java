package ArraysList;
import java.util.ArrayList;
import java.util.List;


import java.util.Arrays;

public class ejerccios2 {
 public static void main (String [] args) {
	 List<String> Personas = Arrays.asList("Pedro", "Carlos", "Benito", "Alvaro", "Mendez");
	 
	 //vamos a utilizar for para llamar la lista de nombres 
	 for(String name: Personas) {
		 System.err.println(name);
	 }
 }
}
