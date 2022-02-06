package co.com.sofkau.tl;

public class Llenar {

    //José Ignacio Ruiz Corrales
    //Olmeiro Orozco Ortiz
    //Santiago Barrera Escudero

    private int fila;
    private int columna;
    private int matriz[][] = new int[4][4];
    private int valor;
    private int numInicial;

    public int[][] llenarIzqDer(int[][] matriz, int fila, int columna, int numInicial) {
        this.matriz = matriz;
        this.fila = fila;
        this.columna = columna;
        this.numInicial = numInicial;

        for (int i = 0; i < matriz.length; i++) {

            if(matriz[fila][i] == 0){
                matriz[fila][i] = numInicial++;
            }
        }
        return matriz;
    }
}
