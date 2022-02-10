package co.com.sofkau.tl;
import co.com.sofkau.tl.matrix.Matrix;

public class MatrizEspiral {
    // TODO: 2/02/2022 método para recorrer fila izq-der
    // TODO: 2/02/2022 método para recorrer fila der-izq
    // TODO: 2/02/2022 método para recorrer columna desc
    // TODO: 2/02/2022 método para recorrer columna asc
    // TODO: 2/02/2022 método para solicitar tamaño de matriz a llenar
    // TODO: 2/02/2022 método para imprimir la matriz
    // TODO: 2/02/2022 método para integrar todas las funcionalidades anteriores por medio de un menú que se comunique con el usuario

    // parámetros: matriz, nro fila o columna, el nro en el que comienza
    // uSizeX = nro columnas - uSizeY = nro de filas - uCounter = counter nro personalizado

    public static void main(String[] args) {

        Matrix userMatrix = new Matrix(7, 5, 20);

        userMatrix.printer();
        System.out.println("- - - - - - - - - - - - - - - - - - - -");
        userMatrix.Spiral();

        userMatrix.printer();
    }
}
