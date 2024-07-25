package linkedList;



	
import java.util.LinkedList;
import java.util.Scanner;

public class ejercicios1{
	    public static void main(String[] args) {
	        LinkedList<String> tareas = new LinkedList<>();
	        Scanner scanner = new Scanner(System.in);
	        String tarea;

	        while (true) {
	            System.out.println("1. Agregar tarea");
	            System.out.println("2. Eliminar tarea");
	            System.out.println("3. Mostrar tareas");
	            System.out.println("4. Salir");
	            int opcion = scanner.nextInt();
	            scanner.nextLine(); // Consumir la nueva línea

	            switch (opcion) {
	                case 1:
	                    System.out.println("Introduce la tarea: ");
	                    tarea = scanner.nextLine();
	                    tareas.add(tarea);
	                    break;
	                case 2:
	                    System.out.println("Introduce el índice de la tarea a eliminar: ");
	                    int indice = scanner.nextInt();
	                    scanner.nextLine(); // Consumir la nueva línea
	                    if (indice >= 0 && indice < tareas.size()) {
	                        tareas.remove(indice);
	                        System.out.println("Tarea eliminada.");
	                    } else {
	                        System.out.println("Índice no válido.");
	                    }
	                    break;
	                case 3:
	                    System.out.println("Lista de tareas: ");
	                    for (int i = 0; i < tareas.size(); i++) {
	                        System.out.println(i + ". " + tareas.get(i));
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

