package co.com.sofkau.tl;

public class MatrizEspiral {
    // TODO: 2/02/2022 método para recorrer fila izq-der
    public static int recorrerFilaDeIzquierdaADerecha(int matriz[][], int numeroFila, int inicio ) {
        int k = inicio;
        for (int i = 0; i < matriz[0].length; i++) {
            if (matriz[numeroFila][i] == 0) {
                matriz[numeroFila][i] = k;
                k++;
            }
        }
        return k - 1;
    }









    // TODO: 2/02/2022 método para recorrer fila der-izq
    public static int recorrerFilaDeDerechaAIzquierda(int matriz[][], int numeroFila, int inicio )
    {
        int k = inicio;
        for (int i = matriz[0].length-1; i >= 0 ; i--)
        {
            if(matriz[numeroFila][i] == 0)
            {
                matriz[numeroFila][i] = k;
                k++;
            }
        }
        return k-1;
    }









    // TODO: 2/02/2022 método para recorrer columna desc
    public static int recorrerColumnaDeArribaAAbajo(int matriz[][], int numeroColumna, int inicio )
    {
        int k = inicio;
        for (int i = 0; i < matriz.length ; i++)
        {
            if(matriz[i][numeroColumna] == 0)
            {
                matriz[i][numeroColumna] = k;
                k++;
            }
        }
        return k-1;
    }










    // TODO: 2/02/2022 método para recorrer columna asc











    // TODO: 2/02/2022 método para solicitar tamaño de matriz a llenar











    // TODO: 2/02/2022 método para imprimir la matriz
    public static void mostrarMatriz(int matriz[][])
    {
        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz[0].length; j++)
            {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }
    }











    // TODO: 2/02/2022 método para integrar todas las funcionalidades anteriores por medio de un menú que se comunique con el usuario
    // parámetros: matriz, nro fila o columna, el nro en el que comienza
    public static void main(String[] args) {
        int tamanoFilas = 20;
        int tamanoColumnas = 20;
        int matrizEspiral[][]= new int[tamanoFilas][tamanoColumnas];
        int columnaALlenar = 8;
        int filaALlenar = 7;
        //recorrerFilaDeDerechaAIzquierda(matrizEspiral, filaALlenar,20);
        recorrerColumnaDeArribaAAbajo(matrizEspiral, columnaALlenar,10);
        recorrerFilaDeIzquierdaADerecha(matrizEspiral, filaALlenar,10);
        mostrarMatriz(matrizEspiral);
    }












}
