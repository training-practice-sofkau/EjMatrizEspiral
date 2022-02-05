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


    public static void main(String[] args) {

        MatrizEspiral espiral= new MatrizEspiral();
        int [][] matrix = espiral.crearMatriz();

    }
}
