package co.com.sofkau.tl;


import co.com.sofkau.tl.MatrizEspiral;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int anchoMatriz = 0;
        int altoMatriz = 0;
        int numeroColumna = 0;
        int numeroInicial = 0;


        Scanner obtenerPorTeclado = new Scanner(System.in);
        System.out.println("Digita el ancho de la matriz");
        anchoMatriz = obtenerPorTeclado.nextInt();
        System.out.println("Digite el alto de la matriz");
        altoMatriz = obtenerPorTeclado.nextInt();
        System.out.println("Digite el número de columna");
        numeroColumna = obtenerPorTeclado.nextInt();
        System.out.println("Digite el número inicial");
        numeroInicial = obtenerPorTeclado.nextInt();

        int matriz[][] = new int [anchoMatriz][altoMatriz];

        MatrizEspiral matrizEspiral = new MatrizEspiral();
        matrizEspiral.llenarArribaAbajo(matriz,numeroColumna,numeroInicial);
        matrizEspiral.imprimirMatriz(anchoMatriz,altoMatriz,matriz);






    }

   }
