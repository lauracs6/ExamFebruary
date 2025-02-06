import java.util.*;

public class secuenciaNumeros {
    public static void main(String[] args) {
        String resultado1 = secuenciaCompleta("1 3 4 6");
        System.out.println(resultado1);
    }

    public static String secuenciaCompleta(String texto) {
        // Convertimos el texto en una lista de números enteros
        String[] miArray = texto.split(" ");
        List<Integer> numeros = new ArrayList<>();

        for (String num : miArray) {
            numeros.add(Integer.parseInt(num)); // Convertimos cada elemento a entero
        }

        // Encontramos el mínimo y el máximo de la secuencia
        int min = Collections.min(numeros);
        int max = Collections.max(numeros);

        // Buscar los números faltantes en la secuencia
        List<Integer> faltantes = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            if (!numeros.contains(i)) {
                faltantes.add(i);
            }
        }

        // Convertimos la lista de faltantes en una cadena de texto
        return faltantes.isEmpty() ? "No hay números faltantes" : faltantes.toString();
    }
}
