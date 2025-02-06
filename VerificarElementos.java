public class verificarElementos {
    
    public static boolean verificarIguales(int[][] matriz) {
        if (matriz == null || matriz.length == 0) {
            return false; // Retorna false si la matriz está vacía
        }
            
        for (int i = 1; i < matriz.length; i++) { // Recorrer primer elemento de cada fila (forman una columna) desde la segunda posición
            if (matriz[i][0] != matriz[0][0]) { //Comparar el primer elemento de todos con el resto de la misma columna
                return false;
            }
        }
            
        for (int j = 1; j < matriz[0].length; j++) { // Recorrer el primer elemento de cada columna (forman una fila) desde la segunda posición 
            if (matriz[2][j] != matriz[0][0]) { // Comparar el primer elemento de todos con el resto de la segunda fila
                return false;
            }
        }
            
        return true;
    }
        
    public static void main(String[] args) {
        int[][] matriz1 = {{1, 2, 3}, {1, 2, 3}, {1, 1, 1}};
        int[][] matriz2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
            
        System.out.println(verificarIguales(matriz1)); // true
        System.out.println(verificarIguales(matriz2)); // false
    }
}
      
