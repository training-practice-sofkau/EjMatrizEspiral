package co.com.sofkau.tl;

import java.util.Scanner;

public class MatrizEspiral {
    // TODO: 2/02/2022 método para recorrer fila izq-der
    // TODO: 2/02/2022 método para recorrer fila der-izq
    // TODO: 2/02/2022 método para recorrer columna desc
    // TODO: 2/02/2022 método para recorrer columna asc
    // TODO: 2/02/2022 método para solicitar tamaño de matriz a llenar
    // TODO: 2/02/2022 método para integrar todas las funcionalidades anteriores por medio de un menú que se comunique con el usuario

    /**
     * Crea una matriz de tamaño nxm solicitando los datos al usuario.
     *
     * @return int[][] Una matriz de enteros vacía.
     */
    public static int[][] crearMatriz() {
        Scanner lector = new Scanner(System.in);
        int filas;
        int columnas;

        System.out.println("Tamaño de la matriz");
        System.out.println("- Filas:");
        do {
            filas = lector.nextInt();
        } while (filas > 50 || filas < 1);

        System.out.println("- Columnas:");
        do {
            columnas = lector.nextInt();
        } while (columnas > 50 || columnas < 1);

        lector.close();

        return new int[filas][columnas];
    }

    /**
     * Método que llena las columnas de una matriz de izquierda a derecha
     * @param matriz
     * @param row
     * @param number
     * @return
     */

    public static int[][] fromLeftToRight(int[][] matriz, int row, int number){
        for (int i = 0; i < matriz[row].length; i++){
            if(matriz[row-1][i] == 0 ){
                matriz[row-1][i] = number;
                number+=1;
            } 
        }
        return matriz;
    }
}
