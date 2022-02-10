package co.com.sofkau.tl.matrix;

public class Matrix {
    // Declaracion de variables
    private int sizeX, sizeY, countIzq, countDer, countAsc, countDesc , tmp = 0;
    private int posX, posY = 0; // <coordenadas> usadas por el contador numerico
    private int counterN = 1; // contador numerico para secuencialmente rellenar en forma de espiral la matriz
    private int[][] newMatrix;
    private boolean condition;

    int copySizeX, copySizeY;
    int counter, status = 0;

    // Contructor basico para una matrix uSizeX horizontal y uSizeY vertical repleta de 0's, solo numeros menores a 50 para medidas
    public Matrix(int uSizeX, int uSizeY, int uCounter){
        // Condicional para evitar numeros mayores a 50
        if (uSizeX > 50 || uSizeY > 50) {
            System.out.println("__Error, no se puede crear una matriz mayor a 50");
            System.exit(0);
        }

        this.sizeX = uSizeX;
        this.sizeY = uSizeY;
        this.counterN = uCounter;

        copySizeX = uSizeX;
        copySizeY = uSizeY;

        // Asignacion y repletamiento de matriz
        newMatrix = new int[this.sizeY][this.sizeX];
        for(int y=0; y<sizeY;y++){
            for(int x = 0; x<sizeX;x++){
                newMatrix[y][x] = 0;
            }
        }

    }

    /* Funcion recursiva para repetir n-status veces el rellenado de la matriz
     * Las 4 funciones basicas de rellenado:
     * desc() para rellenado en direccion descendente - asc() para rellenado en direccion ascendente
     * der_izq() para derecha a izquierda - izq_der() para izquierda a derecha
     * Por cada recursion hecha, se suma un punto en las <coordenadas> para el eje Y
     */
    private int makeSpiral(int copySizeY, int copySizeX){
        while(++counter <= status){
            izq_der();
            desc();
            der_izq();
            asc();
            posY++;
            return makeSpiral((copySizeY / 2), (copySizeX / 2));
        }
        return 0;
    }

    /* Publica Funcion llamada por el usuario
     * verifica cuantas veces se debe llamar a la recursion para completar la matriz y lo asigna a status
     *
     */
    public void Spiral(){
        copySizeY = sizeY;
        copySizeX = sizeX;

        status = (copySizeX > copySizeY) ? copySizeX / 2 : copySizeY /2;

        int result = makeSpiral(copySizeY, copySizeX);
    }


    /* Privada Funcion para rellenar de izquierda a derecha
     * completa con el numero secuencial de CounterN, cada casilla == 0 en la matriz, sumando posiciones en coordenadas x+ ->
     * despues suma un punto en las <coordenadas> para el eje Y+
     */
    private void izq_der(){

        for(int pos = posX; pos<(sizeX - countIzq); pos++){
            try{
                if(newMatrix[posY][pos] == 0) this.newMatrix[posY][pos] = counterN++;
            }catch(Exception e){
                condition = false;
            }
            tmp = pos;
        }
        posX = tmp;

        posY++;
        countIzq++;
    }


    /* Privada Funcion para rellenar en direccion descendente
     * completa con el numero secuencial de CounterN, cada casilla == 0 en la matriz, sumando posiciones en coordenadas y+ ↓
     * despues suma un punto en las <coordenadas> para el eje X-
     */
    private void desc(){
        for(int pos = posY; pos<(sizeY - countDesc);pos++){
            try{
                if(newMatrix[pos][posX] == 0) this.newMatrix[pos][posX] = counterN++;

            }catch(Exception e){
                condition = false;
            }
            tmp = pos;
        }
        posY = tmp;

        posX--;
        countDesc++;

    }

    /* Privada Funcion para rellenar en direccion derecha a izquierda
     * completa con el numero secuencial de CounterN, cada casilla == 0 en la matriz, restando posiciones en coordenadas x- <-
     * despues suma un punto en las <coordenadas> para el eje Y-
     */
    private void der_izq(){
        for(int pos = posX; pos>=countDer;pos--){
            try{
                if(newMatrix[posY][pos] == 0) this.newMatrix[posY][pos] = counterN++;
            }catch(Exception e){
                condition = false;
            }
            tmp = pos;
        }
        posX = tmp;

        posY--;
        countDer++;
    }

    /* Privada Funcion para rellenado en direccion ascendente
     * completa con el numero secuencial de CounterN, cada casilla == 0 en la matriz, restando posiciones en coordenadas y+ ↑
     * despues suma un punto en las <coordenadas> para el eje X+
     */
    private void asc(){
        for(int pos = posY; pos>=(countAsc);pos--){
            try{
                if(newMatrix[pos][posX] == 0) this.newMatrix[pos][posX] = counterN++;
            }catch(Exception e){
                condition = false;
            }
            tmp = pos;
        }
        posY = tmp;

        countAsc++;
        posX++;
    }

    // Impresora de matriz basico para saber el estado actual
    public void printer(){
        for(int y=0; y<sizeY;y++){
            for(int x = 0; x<sizeX;x++){
                System.out.printf("%-5s", newMatrix[y][x]);
            }
            System.out.println("");
        }
    }
}