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
        int matriz[][] = solicitarTamaño();
    }

    /**
     * Solicita por consola las medida de la matriz y la crea usando esos mismos parametros
     *
     * @return
     */
    public static int[][] solicitarTamaño() {
        Scanner teclado = new Scanner(System.in);
        int x = 0;
        do {
            System.out.println("Ingrese valor x, maximo 50");
            x = teclado.nextInt();
        } while (x > 50 && x < 1);

        int y = 0;
        do {
            System.out.println("Ingrese valor y, maximo 50");
            y = teclado.nextInt();
        } while (y > 50 && y < 1);

        int matriz[][] = new int[x][y];

        System.out.println("Se creo exitosamente una matriz de " + x + " por " + y + ".");

        return matriz;
    }
}
