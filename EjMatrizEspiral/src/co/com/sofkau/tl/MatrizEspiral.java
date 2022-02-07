package co.com.sofkau.tl;

import java.util.Scanner;

/**
 * @autor Juan Esteban Cardona Nieto.
 * @autor Jorge Andres Escorcia.
 * @autor Adriana Rojas Sanchez.
 * @autor Johan Muñeton Muñeton.
 * @version 1.0
 */

/**
 * Clase matriz espiral que genera un objeto que llena
 * una matriz de dimensiones indicada por el usuario.
 */
public class MatrizEspiral {
    /**
     * Variables utilizadas durante los diferentes métodos de la matriz, utilizando la cantidad de columnas, filas
     * y la última posición generada por cada método.
     */
    Scanner entrada = new Scanner(System.in);
    int[][] matriz;
    int cantidadFilas;
    int cantidadColumnas;
    int contador = 1;
    int ultimaPosicionFila;
    int ultimaPosicionColumna;
    int salvarF;
    int salvarC;

    /**
     * Método crea la matriz de orden mxn de ceros.
     */
    public void crearMatriz() {

        do {
            System.out.println("Por favor ingresar el número de la cantidad de columnas de la matriz.");
            cantidadColumnas = entrada.nextInt();
        }
        while (cantidadColumnas < 1 || cantidadColumnas > 50);

        do {
            System.out.println("Por favor ingresar el número de la cantidad de filas de la matriz.");
            cantidadFilas = entrada.nextInt();
        }
        while (cantidadFilas < 1 || cantidadFilas > 50);

        matriz = new int[cantidadFilas][cantidadColumnas];
    }

    /**
     * Método que llena la primera fila de la matriz de derecha a izquierda.
     * @param ultimaPosicionFila    última posición de la fila generada.
     * @param ultimaPosicionColumna última posición de la columna generada.
     */
    public void llenarFilaIzquierdaDerecha(int ultimaPosicionFila ,int ultimaPosicionColumna) {
        for (int f = ultimaPosicionFila; f < ultimaPosicionFila+1; f++) {
            for (int c = ultimaPosicionColumna; c < cantidadColumnas; c++) {
                if (matriz[f][c] == 0) {
                    matriz[f][c] = contador++;
                    this.ultimaPosicionColumna = c;
                    this.ultimaPosicionFila = f;
                }
            }
        }
    }

    /**
     * Método que llena la última columna de la matriz de arriba a abajo.
     */
    public void llenarColumnaDescendente() {

        for (int f = ultimaPosicionFila; f < cantidadFilas; f++) {
            for (int c = ultimaPosicionColumna; c < ultimaPosicionColumna+1; c++) {
                if (matriz[f][c] == 0) {
                    matriz[f][c] = contador++;
                }
            }
        }
    }

    /**
     * Método que llena la última fila de la matriz de derecha a izquierda.
     */
    public void llenarFilaDerechaIzquierda() {

        for (int f = cantidadFilas - 1; f < cantidadFilas; f++) {
            for (int c = cantidadColumnas - 1; c >= 0; c--) {
                if (matriz[f][c] == 0) {
                    matriz[f][c] = contador++;
                    this.ultimaPosicionColumna = c;
                    this.ultimaPosicionFila = f;
                }
            }
        }

    }

    /**
     * Método que llena la primera columna de la matriz de abajo a arriba.
     */
    public void llenarColumnaAscendente() {

        for (int f = ultimaPosicionFila; f >= 0  ; f--) {
            for (int c = ultimaPosicionColumna; c < ultimaPosicionColumna+1; c++){

                if (matriz[f][c] == 0) {
                    matriz[f][c] = contador++;
                    this.salvarC = c;
                    this.salvarF = f;
                }
            }
        }
        this.ultimaPosicionColumna = salvarC;
        this.ultimaPosicionFila = salvarF;
    }

    /**
     * Método que íntegra todos los métodos anteriores para llenar la matriz.
     */
    public void integracion() {

        /**
         * Se recorre la matriz y se llena desde el anillo exterior hasta el interior dependiendo del tamaño de la matriz.
         */
        for (int anillos = 0;anillos < matriz.length ; anillos++) {
            llenarFilaIzquierdaDerecha(ultimaPosicionFila, ultimaPosicionColumna);
            llenarColumnaDescendente();
            llenarFilaDerechaIzquierda();
            llenarColumnaAscendente();
            cantidadColumnas--;
            cantidadFilas--;
        }
    }

    /**
     * Método que imprime la matriz.
     */
    public void imprimir() {
        System.out.println("Matriz:");
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                System.out.print(matriz[f][c] + "    ");
            }
            System.out.println();
        }
    }

    /**
     * Método que muestra el menu con las distintas opciones.
     */
    public void mostrarMenu() {
        int seleccion = 0;
        while (seleccion != 3) {
            do {
                System.out.println("Por favor escoja una opcion:");
                System.out.println("1. Crear matriz de orden MxN:");
                System.out.println("2. Llenar matriz de forma espiral.");
                System.out.println("3. Salir.");

                seleccion = entrada.nextInt();

            } while (seleccion < 1 || seleccion > 3);
            switch (seleccion) {
                case 1:
                    crearMatriz();
                    imprimir();
                    break;
                case 2:
                    integracion();
                    imprimir();
                    break;
                case 3:
                    System.out.println("Fin del juego. Gracias");
                    break;

                default:
                    System.out.println("Ingresar una opción valida");

            }
        }
    }
}
