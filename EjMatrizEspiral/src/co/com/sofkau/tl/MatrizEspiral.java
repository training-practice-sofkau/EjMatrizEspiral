package co.com.sofkau.tl;

import java.util.Scanner;

public class MatrizEspiral {
    // TODO: 2/02/2022 método para recorrer fila der-izq
    // TODO: 2/02/2022 método para recorrer columna asc
    // TODO: 2/02/2022 método para integrar todas las funcionalidades anteriores por medio de un menú que se comunique con el usuario

    /**
     * Recorre la fila de una matriz de izquierda a derecha, aumentando un número recibido como parámetro.
     *
     * @param matrix       La matriz de enteros a llenar.
     * @param numRow       El número de la fila a recorrer.
     * @param initialValue El número inicial del recorrido.
     * @return int[][] La matriz recorrida.
     */
    public static int[][] fromLeftToRight(int[][] matrix, int numRow, int initialValue) {
        for (int numCol = 0; numCol < matrix[numRow].length; numCol++) {
            if (matrix[numRow - 1][numCol] == 0) {
                matrix[numRow - 1][numCol] = initialValue;
                initialValue++;
            }
        }
        return matrix;
    }

    /**
     * Recorre la columna de una matriz de arriba a abajo, aumentando un número recibido como parámetro.
     *
     * @param matrix       La matriz de enteros a llenar.
     * @param numCol       El número de la columna a recorrer
     * @param initialValue El número inicial del recorrido.
     * @return int[][] La matriz recorrida.
     */
    public static int[][] fromToptoBottom(int[][] matrix, int numCol, int initialValue) {
        for (int numRow = 0; numRow < matrix.length; numRow++) {
            if (matrix[numRow][numCol - 1] == 0) {
                matrix[numRow][numCol - 1] = initialValue;
                initialValue++;
            }
        }
        return matrix;
    }

    /**
     * Crea una matriz de tamaño nxm solicitando los datos al usuario.
     *
     * @return int[n][m] Una matriz de enteros vacía.
     */
    public static int[][] createMatrix() {
        Scanner reader = new Scanner(System.in);
        int rows;
        int columns;

        System.out.println("Tamaño de la matriz");
        System.out.println("- Filas:");
        do {
            rows = reader.nextInt();
        } while (rows > 50 || rows < 1);

        System.out.println("- Columnas:");
        do {
            columns = reader.nextInt();
        } while (columns > 50 || columns < 1);

        reader.close();

        return new int[rows][columns];
    }

}
