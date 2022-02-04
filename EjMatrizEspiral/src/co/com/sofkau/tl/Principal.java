package co.com.sofkau.tl;

import java.util.Scanner;

public class Principal {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el numero de filas");
        int fila = scan.nextInt();
        System.out.println("Ingrese el numero de columnas");
        int columna = scan.nextInt();

        MatrizEspiral nuevaMatriz = new MatrizEspiral();
        int [][] matriz = nuevaMatriz.crearMatriz(fila, columna);
        nuevaMatriz.imprimirMatriz(matriz);

        System.out.println("Ingrese el valor inicial con que se rellenará la matriz");
        valorInicial = scan.nextInt();
        rellenarMatrizEspiral(nuevaMatriz, valorInicial);

    }
}
