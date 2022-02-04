package co.com.sofkau.tl;

import java.util.Scanner;

public class MatrizEspiral {
    // TODO: 2/02/2022 método para recorrer fila izq-der
    // TODO: 2/02/2022 método para recorrer fila der-izq
    // TODO: 2/02/2022 método para recorrer columna desc
    // TODO: 2/02/2022 método para recorrer columna asc
    // TODO: 2/02/2022 método para solicitar tamaño de matriz a llenar
    // TODO: 2/02/2022 método para imprimir la matriz
    // TODO: 2/02/2022 método para integrar todas las funcionalidades anteriores por medio de un menú que se comunique con el usuario

    // parámetros: matriz, nro fila o columna, el nro en el que comienza

    public static void main(String[] args) {
        int[][] matrizCreada = crearMatriz();
        llenarDerIzq(matrizCreada);
    }

    /**
    * Metodo que crea una matriz bidimensional a partir de dos parametros solicitdos al usuario
    * correspondiente a las filas y columnas.
    *
    */
    public static int[][] crearMatriz() {
        int[][] matriz;
        Scanner captura = new Scanner(System.in);
        int col;
        int fil;

        System.out.println("Ingrese el numero de columnas: ");
        do {
            col = captura.nextInt();
        } while (col > 50 || col < 0); // Validación de tamaño de columnas dentro del rango valido

        System.out.println("Ingrese el numero de filas: ");
        do {
            fil = captura.nextInt();
        } while (fil > 50 || fil < 0); // Validación de tamaño de filas dentro del rango valido

        matriz = new int[fil][col];

        return matriz;
    }

    /**
     * Metodo que rellena cada columna de una fila especificada por el usuario a partir
     * de un numero proporcionado e incrementadolo en 1 hasta recorrer todas las columnas.
     *
     * @param matriz - Matriz a rellenar
     */
    public static void llenarDerIzq(int[][] matriz) {
        Scanner captura = new Scanner(System.in);
        int fils = matriz.length;
        int cols = matriz[1].length;

        System.out.println("Ingrese la fila donde quiere iniciar ");
        int ini;
        do {
            ini = captura.nextInt();
        } while (ini > fils || ini < 0); // Validación de tamaño de filas dentro del rango valido

        System.out.println("Ingrese el numero por el cual quiere iniciar ");
        int num = captura.nextInt();

        for (int posCol = cols - 1; posCol >= 0; posCol--) {
            if (matriz[ini - 1][posCol] == 0) {
                matriz[ini - 1][posCol] = num;
                num++;
            }
        }

        for (int[] ints : matriz) {
            for (int j = 0; j < cols; j++) {
                System.out.print(ints[j] + "\t");
            }
            System.out.println(" ");
        }
    }
}