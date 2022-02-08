import java.util.Scanner;

public class Espiral {
    // Declara una matriz entera
    private int[][] matriz;
    private int[] pos;
    private int valorAux;

    //CONSTRUCTOR: Permite ingresar los valores iniciales
    public Espiral(){
        // Scanner permite al usuario ingresar datos
        Scanner sc = new Scanner(System.in);

        // Pide el tamaño de la matriz en valores enteros
        System.out.println("Tamaño de la matriz");
        System.out.println("Filas: ");
        int row = sc.nextInt();
        System.out.println("Columnas: ");
        int column = sc.nextInt();

        // Inicializa la matriz segun el tamaño decidido
        matriz = new int[row][column];

        // Posicion de la matriz
        pos = new int[]{0, 0};

        //valor que irá llenando la matriz
        valorAux = 1;
    }

    //Metodo que muestra la matriz
    public void showMatriz() {
        System.out.println();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j< matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Metodo llenar matriz de izq a derecha
    public void izqDer() {

        for (int j = pos[1]; j< matriz[pos[0]].length; j++) {

            if (matriz[pos[0]][j] != 0) {
                break;
            }
            pos[1] = j;

            matriz[pos[0]][j] = valorAux;
            valorAux++;

        }
        pos[0]++;
        if (matriz[pos[0]][pos[1]] != 0) {
            System.out.println("Matriz completa");
        } else {
            descendente();
        }

    }

    public void descendente() {

        for (int i = pos[0]; i < matriz.length ; i++) {

            if (matriz[i][pos[1]] != 0) {
                break;
            }
            pos[0] = i;
            matriz[pos[0]][pos[1]] = valorAux;
            valorAux++;
        }
        pos[1]--;
        if (matriz[pos[0]][pos[1]] != 0) {
            System.out.println("Matriz completa");
        } else {
            derIzq();
        }
    }

    public void derIzq() {

        for (int j = pos[1]; j >= 0; j--) {

            if (matriz[pos[0]][j] != 0) {
                break;
            }
            pos[1] = j;
            matriz[pos[0]][j] = valorAux;
            valorAux++;
        }
        pos[0]--;
        if (matriz[pos[0]][pos[1]] != 0) {
            System.out.println("Matriz completa");
        } else {

            ascendente();
        }
    }

    public void ascendente() {

        for (int i = pos[0]; i >= 0 ; i--) {

            if (matriz[i][pos[1]] != 0) {
                break;
            }
            pos[0] = i;
            matriz[pos[0]][pos[1]] = valorAux;
            valorAux++;
        }
        pos[1]++;
        if (matriz[pos[0]][pos[1]+1] != 0) {
            System.out.println("Matriz completa");
        } else {
            izqDer();
        }
    }


    public static void main(String[] args) {

        Espiral matrizEspiral = new Espiral();
        matrizEspiral.showMatriz();


        matrizEspiral.izqDer();
        matrizEspiral.showMatriz();



    }

}
