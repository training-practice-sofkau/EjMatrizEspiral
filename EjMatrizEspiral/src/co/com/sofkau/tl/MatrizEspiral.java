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

    private static int[][] matriz;
    private static int numeroFila;
    private static int valorInicial;
    private static Scanner scan = new Scanner(System.in);

    public static int[][] crearMatriz(int fila, int columna) {
        matriz = new int[fila][columna];
        return matriz;
    }

    public static void recorrerFilaIzqDer(int[][] matriz, int numeroFila, int valorInicial) {

        for (int j = 0; j < matriz[numeroFila - 1].length; j++) {
            if (matriz[numeroFila - 1][j] == 0) {
                matriz[numeroFila - 1][j] = valorInicial + j;
            }
        }
        imprimirMatriz(matriz);
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
                if (j < matriz[i].length) {
                    System.out.print("\t");
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el numero de filas");
        int fila = scan.nextInt();
        System.out.println("Ingrese el numero de columnas");
        int columna = scan.nextInt();

        int[][] nuevaMatriz = crearMatriz(fila, columna);
        imprimirMatriz(nuevaMatriz);
        int seleccion;

        do {

            System.out.println("Por favor escoja un método para llenar la matriz " + matriz.length + "X" + matriz[0].length);
            System.out.println("1. Recorrer fila de izquierda a derecha.");
            System.out.println("2. Recorrer fila de derecha a izquierda.");
            System.out.println("3. Recorrer columna de arriba a abajo.");
            System.out.println("4. Recorrer columna de abajo a arriba.");
            seleccion = scan.nextInt();

            switch (seleccion) {
                case 1:
                    System.out.println("Recorrerá la fila de izq. a der.");
                    System.out.println("Ingrese el numero de fila a rellenar");
                    numeroFila = scan.nextInt();
                    System.out.println("Ingrese el valor inicial con que se rellenará la fila");
                    valorInicial = scan.nextInt();
                    recorrerFilaIzqDer(matriz, numeroFila, valorInicial);
                    break;
                default:
                    System.out.println("Valor no válido. Saliendo...");

            }


        } while (seleccion >= 1 && seleccion <= 4);


    }


}
