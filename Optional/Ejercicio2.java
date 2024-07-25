package Optional;

import java.util.Optional;

public class Ejercicio2 {
    public static void main(String[] args) {
        // 1. Crear  un valor no nulo
        Optional<String> texto = Optional.of("texto de ejemplo");

        // 2. Usar map para transformar el valor a mayúsculas
        Optional<String> textoMayusculas = texto.map(String::toUpperCase);
        textoMayusculas.ifPresent(System.out::println); // Imprime "TEXTO DE EJEMPLO"

        // 3. Usar filter para mantener el valor solo si cumple una condición específica
        Optional<String> textoFiltrado = texto.filter(t -> t.contains("ejemplo"));
        textoFiltrado.ifPresent(System.out::println); // Imprime "texto de ejemplo"
    }
}

