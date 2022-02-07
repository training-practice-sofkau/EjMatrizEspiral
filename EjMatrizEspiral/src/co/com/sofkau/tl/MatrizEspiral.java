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

    /**
     * Este metodo devuelve una matriz de ceros con las dimensiones que el usuario ingrese
     * @return
     */
    public static int[][] getMatriz(){

        Scanner captura = new Scanner(System.in);

        System.out.println("Por favor ingrese el numero de filas que tendra la matriz: ");
        int filas = captura.nextInt();

        System.out.println("Por favor ingrese el numero de columnas que tendra la matriz: ");
        int columnas = captura.nextInt();

        int [][] matriz;
        matriz = new int[filas][columnas];

        return matriz;
    }

}
