package co.com.sofkau.tl;

public class MatrizEspiral {
    // TODO: 2/02/2022 método para recorrer fila izq-der
    // TODO: 2/02/2022 método para recorrer fila der-izq
    // TODO: 2/02/2022 método para recorrer columna desc
    // TODO: 2/02/2022 método para recorrer columna asc - Tarea elegida
    // TODO: 2/02/2022 método para solicitar tamaño de matriz a llenar
    // TODO: 2/02/2022 método para imprimir la matriz
    // TODO: 2/02/2022 método para integrar todas las funcionalidades anteriores por medio de un menú que se comunique con el usuario

    // parámetros: matriz, nro fila o columna, el nro en el que comienza

    public static void main(String[] args) {
        int n = 5;
        String[][] matriz = new String[n][n];
        int x = 0;
        int y = n - 1;
        int valor = 1;

        for (int j = 0; j < matriz.length; j++) {

            for (int i = y - 1; i >= x + i; i--) {
                matriz[i][x] = valor++ + " ";
                //Esta parte es la que recorre la columna de forma ascendente
            }
            x++;
            y--;
        }

        for (int f = 0; f < matriz.length; f++) {
            for (int i = 0; i < matriz[f].length; i++) {
                System.out.println(matriz[f][i]);
                // Esta parte es para imprimir la matriz
            }

        }

    }
}
