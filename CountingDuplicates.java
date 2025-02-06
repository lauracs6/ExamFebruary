//Debemos implementar una función que cuente el número de caracteres alfabéticos
// en mayúsculas y minúsculas y dígitos numéricos distintos
// que aparecen más de una vez en una cadena de entrada.

import java.util.HashMap;

public class CountingDuplicatesHashmap {
    public static int countRepeatedCharacters(String caracteres) {
        // Crear un HashMap para rastrear caracteres y si están repetidos
        HashMap<Character, Boolean> contarDuplicados = new HashMap<>();

        // Recorrer cada carácter en la cadena
        for (char c : caracteres.toCharArray()) {   //bucle for tradicional: for (int i = 0; i < caracteres.length(); i++){ char c = caracteres.charAt(i);}
            // Verificar si el carácter es alfabético o un dígito
            if (Character.isLetterOrDigit(c)) {
                if (contarDuplicados.containsKey(c)) {
                    // Si el carácter ya está en el mapa, marcarlo como repetido
                    contarDuplicados.put(c, true);
                } else {
                    // Si no está en el mapa, añadirlo con valor false
                    contarDuplicados.put(c, false);
                }
            }
        }

        // Contar los caracteres que tienen valor true (repetidos)
        int totalRepetidos = 0;
        for (boolean seRepite : contarDuplicados.values()) {
            if (seRepite) {
                totalRepetidos++;
            }
        }
        return totalRepetidos;
    }

    public static void main(String[] args) {
        String caracteres1 = "aabbcc12345abc!";
        int resultado = countRepeatedCharacters(caracteres1);
        System.out.println("Número de caracteres repetidos: " + resultado);
    }
}
