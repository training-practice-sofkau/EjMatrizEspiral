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



    public int[][] crearMatriz(int fila, int columna) {
        int[][] matriz = new int[fila][columna];
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

    public int[] recorrerColumnaAscendente(int[][] matriz, int indiceColumna, int valorInicial) {

        int[] coordenada = new int[2];

        for (int fila = 0; fila < matriz.length; ++fila) {
            if (matriz[fila][indiceColumna] == 0) {
                matriz[fila][indiceColumna] = valorInicial++;
                coordenada[0] = fila;
            }
        }
        coordenada[1] = valorInicial;
        return coordenada;
    }

    public int[] recorrerFilaDescendente(int[][] matriz, int indiceFila, int valorInicial) {

        int[] coordenada = new int[2];

        for (int col = matriz[indiceFila].length - 1; col >= 0; --col) {
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

        for (int fila = matriz.length - 1; fila >= 0; --fila) {
            if (matriz[fila][indiceColumna] == 0) {
                matriz[fila][indiceColumna] = valorInicial++;
                coordenada[0] = fila;
            }
        }
        coordenada[1] = valorInicial;
        return coordenada;
    }

    public void rellenarMatriz(int[][] matriz) {

        int filaInicial = 0;
        int columnaInicial = 0;
        int valorInicial = 1;

        int [] coordenada;

        for (int i = 0; i < matriz.length; i++) {
            coordenada = recorrerFilaAscendente(matriz,filaInicial, valorInicial);
            columnaInicial = coordenada[0];
            valorInicial = coordenada[1];
            coordenada = recorrerColumnaAscendente(matriz,columnaInicial, valorInicial);
            filaInicial = coordenada[0];
            valorInicial = coordenada[1];
            coordenada = recorrerFilaDescendente(matriz,filaInicial, valorInicial);
            columnaInicial = coordenada[0];
            valorInicial = coordenada[1];
            coordenada = recorrerColumnaDescendente(matriz,columnaInicial, valorInicial);
            filaInicial = coordenada[0];
            valorInicial = coordenada[1];
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

}
