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
    /**
     * @parameter matriz: Representa la matriz a rellenar
     * @parameter coordenada: representa un vector de longitud 2, donde coordenada = (nro fila/col, nro incial)
     */
    private int[][] matriz;


    public int[][] crearMatriz(int fila, int columna) {
        matriz = new int[fila][columna];
        return matriz;
    }

    public int[] recorrerFilaAscendente(int[][] matriz, int indiceFila, int valorInicial) {

        int[] coordenada = new int[2];
        for (int col = 0; col < matriz[indiceFila].length; ++col) {
            if (matriz[indiceFila][col] == 0) {
                matriz[indiceFila][col] = valorInicial++;
                coordenada[0] = col;
            }
        }
        coordenada[1] = valorInicial;
        return coordenada;
    }

    public int[] recorrerColumnaDescendente(int[][] matriz, int indiceColumna, int valorInicial) {

        int[] coordenada = new int[2];
        for (int fila = 0; fila < matriz.length; ++fila) {
            if (matriz[indiceColumna][fila]==0){
                matriz[indiceColumna][fila] = valorInicial++;
                coordenada[0]=fila;
            }
        }

        return coordenada;

    }

    public void rellenarMatrizEspiral(int[][] matriz, int valorInicial) {

        int columnaActual = 0;
        int filaActual = 0;


        for (int i = 0; i < matriz.length; i++) {

            int cicloA = 1;

            do {

                for (int j = 0; j < matriz[i].length; j++) {
                    if (matriz[i][j] == 0) {
                        matriz[i][j] = valorInicial++;
                        columnaActual = j;
                    }
                }

                for (int j = 0; j < matriz.length; j++) {
                    if (matriz[j][columnaActual] == 0) {
                        matriz[j][columnaActual] = valorInicial++;
                        filaActual = j;
                    }
                }
                cicloA++;
            } while (cicloA < 2);

            int cicloB = 1;

            do {

                for (int j = matriz[filaActual].length - 1; j >= 0; j--) {
                    if (matriz[filaActual][j] == 0) {
                        matriz[filaActual][j] = valorInicial++;
                        columnaActual = j;
                    }
                }

                for (int j = matriz.length - 1; j >= 0; j--) {
                    if (matriz[j][columnaActual] == 0) {
                        matriz[j][columnaActual] = valorInicial++;
                    }
                }
                cicloB++;
            } while (cicloB < 2);
        }
        imprimirMatriz(matriz);
    }


    public void imprimirMatriz(int[][] matriz) {
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

    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }
}
