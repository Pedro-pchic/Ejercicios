package Optional;

import java.util.Optional;

public class Ejercicio1 {
    public static void main(String[] args) {
        // 1. creamos un valor es que nulo
        Optional<String> saludo = Optional.of("¡Hola, Mundo!");

        // 2. Verificar si el Optional contiene un valor
        if (saludo.isPresent()) {
            System.out.println("El Optional contiene: " + saludo.get());
        } else {
            System.out.println("El Optional está vacío");
        }

        // 3. Obtener el valor del Optional de manera segura
        String valor = saludo.orElse("Valor por defecto");
        System.out.println("Valor: " + valor);
    }
}
