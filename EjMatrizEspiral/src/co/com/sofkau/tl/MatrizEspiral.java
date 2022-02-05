package co.com.sofkau.tl;

public class MatrizEspiral {
    // TODO: 2/02/2022 método para recorrer fila izq-der
    // TODO: 2/02/2022 método para recorrer fila der-izq
    // TODO: 2/02/2022 método para recorrer columna desc
    // TODO: 2/02/2022 método para recorrer columna asc
    // TODO: 2/02/2022 método para solicitar tamaño de matriz a llenar
    // TODO: 2/02/2022 método para imprimir la matriz
    // TODO: 2/02/2022 método para integrar todas las funcionalidades anteriores por medio de un menú que se comunique con el usuario

    // parámetros: matriz, nro fila o columna, el nro en el que comienza

    public void llenarArribaAbajo(int[][] matriz, int numCol, int numInicial) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if ((j == numCol) && (matriz[i][j] == 0)) {
                    matriz[i][j] = numInicial;
                    numInicial++;
                }
            }
        }
    }

    public void imprimirMatriz(int anchoMatriz, int altoMatriz, int matriz[][]) {
        for (int i = 0; i < anchoMatriz; i++) {
            for (int j = 0; j < altoMatriz; j++) {
                System.out.print(matriz[i][j] + " " );
            }
            System.out.println("");
        }
    }


}
