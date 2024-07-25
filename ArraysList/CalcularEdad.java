package ArraysList;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CalcularEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definir el formato esperado para la fecha
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Solicitar fecha de nacimiento al usuario
        System.out.print("Ingrese su fecha de nacimiento (DD/MM/AAAA): ");
        String fechaNacimientoInput = scanner.nextLine();

        // Convertir la entrada en un objeto LocalDate usando el formato especificado
        LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoInput, formatter);

        // Obtener la fecha actual
        LocalDate fechaActual = LocalDate.now();

        // Calcular la edad
        Period edad = Period.between(fechaNacimiento, fechaActual);

        // Mostrar la edad
        System.out.println("Tu edad es: " + edad.getYears() + " años, " + edad.getMonths() + " meses y " + edad.getDays() + " días.");
        
        scanner.close();
    }
}
