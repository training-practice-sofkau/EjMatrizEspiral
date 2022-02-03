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

    // Felipe Munevar - Virginia Giardino

    public static int[][] llenarFilaDerIzq (int[][] matriz, int nroFila, int nroInicio) {
        for (int i = matriz[0].length-1; i >= 0; i--) {
            if (matriz[nroFila][i] == 0) {
                matriz[nroFila][i] = nroInicio;
                nroInicio++;
            }
        }return matriz;
    }
}
