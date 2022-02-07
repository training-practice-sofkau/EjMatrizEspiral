package co.com.sofkau.tl;

import java.util.Scanner;

/**
 * Desarrollado por Alvaro Mena, Juan Gil
 */
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

    /**
     * Este metodo recibe una matriz y la imprime por cosola
     * @param matriz matriz a imprimir
     */
    public static void showMatriz(int [][]matriz){

        int filas = matriz.length;
        int columnas = matriz[0].length;
        for (int i = 0;i < filas;i++){
            for(int j=0; j< columnas;j++){
                System.out.print(" "+ matriz[i][j] + ",");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }

    /**
     * Este metodo recibe una matriz y la recorre de izquierda a derecha modificando sus valores
     * @param matriz matriz a modificar
     * @param filaInicial fila a partir de la cual se modifican los datos
     * @param numInicial numero inicial, aumenta ascendentemente mientras se recorre la matriz
     * @return retorna la matriz modificada
     */
    public static int[][] avanceIzqDer(int [][] matriz, int filaInicial, int numInicial){

        int columnas = matriz[0].length;
        for (int i=0; i < columnas; i++){
            if(matriz[filaInicial -1][i] == 0){
                matriz[filaInicial -1][i]=numInicial;
                numInicial++;
            }
        }
        return matriz;
    }

    /**
     * Este metodo recibe una matriz y la recorre de derecha a izquierda modificando sus valores
     * @param matriz matriz a modificar
     * @param filaInicial fila a partir de la cual se modifican los datos
     * @param numInicial numero inicial, aumenta ascendentemente mientras se recorre la matriz
     * @return retorna la matriz modificada
     */
    public static int[][] avanceDerIzq(int [][] matriz, int filaInicial, int numInicial){
        int columnas = matriz[0].length;
        for (int i=columnas-1; i >= 0; i--){
            if(matriz[filaInicial -1][i] == 0){
                matriz[filaInicial -1][i]=numInicial;
                numInicial++;
            }
        }
        return matriz;
    }

}
