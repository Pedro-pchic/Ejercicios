package linkedList;
import java.util.LinkedList;
import java.util.Scanner;

public class ejercicio2 {
	   public static void main(String[] args) {
	        LinkedList<String> cola = new LinkedList<>();
	        Scanner scanner = new Scanner(System.in);
	        String cliente;

	        while (true) {
	            System.out.println("1. Agregar cliente a la cola");
	            System.out.println("2. Atender cliente");
	            System.out.println("3. Mostrar cola de espera");
	            System.out.println("4. Salir");
	            int opcion = scanner.nextInt();
	            scanner.nextLine(); // Consumir la nueva línea

	            switch (opcion) {
	                case 1:
	                    System.out.println("Introduce el nombre del cliente: ");
	                    cliente = scanner.nextLine();
	                    cola.add(cliente);
	                    break;
	                case 2:
	                    if (!cola.isEmpty()) {
	                        cliente = cola.poll();
	                        System.out.println("Atendiendo a: " + cliente);
	                    } else {
	                        System.out.println("No hay clientes en la cola.");
	                    }
	                    break;
	                case 3:
	                    System.out.println("Cola de espera: ");
	                    for (int i = 0; i < cola.size(); i++) {
	                        System.out.println((i + 1) + ". " + cola.get(i));
	                    }
	                    break;
	                case 4:
	                    System.exit(0);
	                    break;
	                default:
	                    System.out.println("Opción no válida.");
	            }
	        }
	    }
	}