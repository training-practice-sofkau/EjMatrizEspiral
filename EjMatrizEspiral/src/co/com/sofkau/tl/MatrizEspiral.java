package co.com.sofkau.tl;

public class MatrizEspiral {

    public MatrizEspiral(){
    }

    // TODO: 2/02/2022 método para recorrer fila izq-der
    /**
     * @author Felipe Quiceno , Fernando Quiceno
     * La funcion de este metodo es recorrer una fila de la matriz de izquierda a derecha
     * y rellenar sus campos vacios con numeros consecutivos
     * @param lista : lista a recorrer
     * @param filaAmodificar : numero de la fila a modificar
     * @param numeroInicio : numero en el que empieza a rellnar la secuencia
     * @return lista[][] : Retorna la lista con los datos de la fila seleccionada
     * */

    public static int[][] izquierdaADerecha(int[][]lista, int filaAmodificar, int numeroInicio ){
        int filaReal = filaAmodificar - 1;                                                   // numero de la fila en la matriz

        for (int i=0; i< lista[i].length;i++,numeroInicio++){

            if(lista[filaReal][i] !=0){                                                     // condicional para evaluar si en ese campo ya hay un numero
                numeroInicio--;                                                             // si hay un numero, lo saltamo y me conserva la secuencia , que ya traia
                continue;
            }
            lista[filaReal][i] = numeroInicio;                                              // si el dato esta en cero, lo rellenamos con la secuencia
        }
        return lista;
    }

    // TODO: 2/02/2022 método para recorrer fila der-izq
    // TODO: 2/02/2022 método para recorrer columna desc
    // TODO: 2/02/2022 método para recorrer columna asc
    // TODO: 2/02/2022 método para solicitar tamaño de matriz a llenar
    // TODO: 2/02/2022 método para imprimir la matriz
    // TODO: 2/02/2022 método para integrar todas las funcionalidades anteriores por medio de un menú que se comunique con el usuario

    // parámetros: matriz, nro fila o columna, el nro en el que comienza
}
