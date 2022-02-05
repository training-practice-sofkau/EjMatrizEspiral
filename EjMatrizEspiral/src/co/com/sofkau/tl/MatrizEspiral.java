package co.com.sofkau.tl;

import java.util.Scanner;

public class MatrizEspiral {

    /**
     * Tarea Mentoria con Daniel Londoño
     * Crear una Matriz Espiral
     * Integrantes: Alvaro Ducuara
     *              Camilo Diaz
     *              Dehyro Méndez
     */
    // TODO: 2/02/2022 método para recorrer fila izq-der
    // TODO: 2/02/2022 método para recorrer columna desc
    // TODO: 2/02/2022 método para recorrer columna asc
    // TODO: 2/02/2022 método para integrar todas las funcionalidades anteriores por medio de un menú que se comunique con el usuario

    // parámetros: matriz, nro fila o columna, el nro en el que comienza

    int filas;
    int columnas;

    public MatrizEspiral(){
        filas = 50;
        columnas = 50;
    }

    private int[][] matriz;
    Scanner ingresoDato = new Scanner(System.in);

    public int[][] crearMatriz(){

        System.out.println("Ingrese la cantidad de filas: ");
        int rows = Integer.parseInt(ingresoDato.nextLine());
        System.out.println("Ingrese la cantidad de columnas: ");
        int columns = Integer.parseInt(ingresoDato.nextLine());
        try {
            if (rows > this.filas || columns > this.columnas) {
                System.out.println("Error, el número de filas y columnas debe ser menor o igual a 50");
            }
            else matriz = new int[rows][columns];
        }
        catch (NullPointerException e) {
            System.out.println(e);
        }
        return matriz;
    }

    public int [][] llenarDerIzq(int[][] matriz){

        System.out.println("Ingrese el valor en la posición de inicio del barrido: ");
        int initValMatrix = Integer.parseInt(ingresoDato.nextLine());
        System.out.println("Ingrese la fila de la posición de inicio del barrido: ");
        int initFila = Integer.parseInt(ingresoDato.nextLine());
        for (int col = matriz[0].length-1; col >= 0; col--) {
            switch (matriz [initFila][col]) {
                case 0: matriz [initFila][col] = initValMatrix;
                    initValMatrix++;
                    break;
            }
        }
        return matriz;
    }

    public void imprimirMatriz(int[][] matriz){

        for (int fil = 0; fil < matriz.length; fil++) {
            for (int col = 0; col < matriz[0].length; col++) {
                System.out.print( "    "+ matriz [fil][col]+ "      ");

            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {

        MatrizEspiral espiral= new MatrizEspiral();
        int [][] matrix = espiral.crearMatriz();
        matrix = espiral.llenarDerIzq(matrix);
        espiral.imprimirMatriz(matrix);
    }
}
