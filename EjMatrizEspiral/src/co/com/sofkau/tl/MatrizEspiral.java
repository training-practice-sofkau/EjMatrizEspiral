package co.com.sofkau.tl;

import java.util.Scanner;

public class MatrizEspiral {
    // TODO: 2/02/2022 método para solicitar tamaño de matriz a llenar -- ok
    // TODO: 2/02/2022 método para imprimir la matriz -- ok
    // TODO: 2/02/2022 método para recorrer fila izq-der --ok
    // TODO: 2/02/2022 método para recorrer fila der-izq
    // TODO: 2/02/2022 método para recorrer columna desc
    // TODO: 2/02/2022 método para recorrer columna asc
    // TODO: 2/02/2022 método para integrar todas las funcionalidades anteriores por medio de un menú que se comunique con el usuario

    // parámetros: matriz, nro fila o columna, el nro en el que comienza

    //Celda es un array con 3 valores que representan [fila, columna, valor]
    //Variable global
    static int[][] matriz;

    public static void main(String[] args) {
        matriz =  generarMatriz();

        //valor inicial del espiral
        int valorInicial = 1;

        /**Indicar la posicion donde va a comenzar a pintar los numeros*/
        matriz[0][0] = valorInicial;

        int[] celdaInicial = {0,0,valorInicial};
        int[] celdaFinal = llenarIzqDere(celdaInicial);
        imprimirMatriz(matriz);
    }
    public static int[][] generarMatriz() {
        Scanner sc = new Scanner(System.in);
        int filasUsuario;
        int columnasUsuario;
        boolean valorInconrrecto;

        System.out.println("Nueva matríz espiral");
        do {
            System.out.println("Ingrese valor de las filas, máximo 50");
            filasUsuario = sc.nextInt();

            System.out.println("Ingrese valor de las columnas, máximo 50");
            columnasUsuario = sc.nextInt();
            valorInconrrecto = filasUsuario > 50 || filasUsuario < 1 || columnasUsuario > 50 || columnasUsuario < 1;
            if (valorInconrrecto) {
                System.out.println("Uno de los valores es incorrecto, intentalo de nuevo");
            }
        } while (valorInconrrecto);
        return new int[filasUsuario][columnasUsuario];
    }

    public static void imprimirMatriz(int[][] matriz){

        for (int indiceFila=0; indiceFila < matriz.length; indiceFila++){
            for (int indiceColumna = 0; indiceColumna  < matriz[indiceFila].length; indiceColumna ++) {
                System.out.print("|\t" + matriz[indiceFila][indiceColumna ]+ "\t");
            }
            System.out.println("|\n");
        }
        System.out.println("----------------------------------------");
    }

    public static  int[] llenarIzqDere(int[] celdaDePartida){
        // Recibe una celda inicial y devuelve una celda final(que es donde comenzará el otro movimiento)

        int indiceFila = celdaDePartida[0];
        int indiceColumna = celdaDePartida[1];
        int siguienteValor = celdaDePartida[2];

        while (indiceColumna < matriz[0].length - 1) {
            if ( matriz[indiceFila][indiceColumna + 1] == 0) {
                indiceColumna += 1;
                siguienteValor += 1;
                matriz[indiceFila][indiceColumna] = siguienteValor;
            } else
                break;
        }
        int []  celda = {indiceFila, indiceColumna, siguienteValor};
        return celda;
    }
}
