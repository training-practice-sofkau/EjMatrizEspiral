package co.com.sofkau.tl;

import javax.swing.*;

public class MatrizEspiral {
    // TODO: 2/02/2022 método para recorrer fila izq-der
    // TODO: 2/02/2022 método para recorrer fila der-izq
    // TODO: 2/02/2022 método para recorrer columna desc
    // TODO: 2/02/2022 método para recorrer columna asc
    // TODO: 2/02/2022 método para solicitar tamaño de matriz a llenar
    // TODO: 2/02/2022 método para imprimir la matriz
    // TODO: 2/02/2022 método para integrar todas las funcionalidades anteriores por medio de un menú que se comunique con el usuario

    public static int[][] matriz;
    /*
    controlArray[0]: contiene posicion en la que termina el metodo
    controlArray[1]: contiene contador con que termina el metodo
     */
    public static int[] controlArray = new int[2];

    public static void main(String[] args) {

        int filas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numero de filas"));
        int columnas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numero de columnas"));
        //Validación máximo 50x50
        while(filas>50 || columnas >50){
            JOptionPane.showMessageDialog(null,"Ingrese de nuevo, máximo 50x50");
            filas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numero de filas"));
            columnas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numero de columnas"));
        }
        matriz = new int[filas][columnas];
        controlArray[1] = 1;
        //5/2/22 Prueba de metodo que genera la matriz en espiral
        generarMatrizEspiral(filas);
        imprimirMatriz();
    }
    // parámetros: matriz, nro fila o columna, el nro en el que comienza


    private static void imprimirMatriz() {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(String.format("%03d", matriz[i][j]) + " | ");
            }
            System.out.println("");
        }
    }

    private static void recorrerFilaIzquierdaDerecha(int numeroFila, int valorInicial) {
        int cont = valorInicial;
        for (int i = 0; i < matriz[numeroFila].length; i++) {
            if (matriz[numeroFila][i] == 0) {
                matriz[numeroFila][i] = cont;
                cont++;
                controlArray[0] = i+1;
                controlArray[1] = cont;
            }
        }
    }

    private static void recorrerFilaDerechaIzquerda(int numeroFila, int valorInicial) {
        int contador = valorInicial;
        for (int i = matriz[numeroFila - 1].length-1; i >= 0; i--) {
            if (matriz[numeroFila - 1][i] == 0) {
                matriz[numeroFila - 1][i] = contador;
                contador++;
                controlArray[0] = i+1;
                controlArray[1] = contador;
            }
        }
    }

    // 02/2/22: Implementacion de llenado de arriba - abajo por Wilton
    private static void recorrerColumnaDescendente(int numeroColumna, int valorInicial) {
        int contador = valorInicial;
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][numeroColumna - 1] == 0) {
                matriz[i][numeroColumna - 1] = contador;
                contador++;
                controlArray[0] = i+1;
                controlArray[1] = contador;
            }
        }
    }
    //4/2/22: Implementación de llenado abajo - arriba por Mishell~
    private static void recorrerColumnaAscendente(int numeroColumna, int valorInicial){
        int contador = valorInicial;
        for (int i = matriz.length -1 ; i >= 0;  i--) {
            if (matriz[i][numeroColumna - 1] == 0) {
                matriz[i][numeroColumna - 1] = contador;
                contador++;
                controlArray[0] = i+1;
                controlArray[1] = contador;
            }
        }
    }

    private static void generarMatrizEspiral(int filas){
        for(int i = 0; i < filas ; i++){
            if((matriz[i][i] == 0) && (matriz[i][i+1] == 0)){
                recorrerFilaIzquierdaDerecha(i, controlArray[1]);
                recorrerColumnaDescendente(controlArray[0] , controlArray[1]);
                recorrerFilaDerechaIzquerda(controlArray[0] , controlArray[1]);
                recorrerColumnaAscendente(controlArray[0] , controlArray[1]);
            }else{
                recorrerColumnaDescendente(i + 1 , controlArray[1]);
                break;
            }
        }
    }
}




