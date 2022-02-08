package com.co.sofka;

import javax.swing.*;

public class Matriz {

    int matriz[][];
    int numeroFilas;
    int numeroColumnas;
    int numeroInicial;

    /**
     * Este metodo como su nombre lo indica sirve para solicitar al usuario el tamaño de la matriz validando que se cumpla el requisito de el maximo tamaño
     * de filas y columnas sea 50 y no menor a 0.
     * param numeroFilas
     * param numeroColumnas
     *
     * @return matriz;
     */
    public int[][] solicitudMatriz() {
        do {
            numeroFilas = Integer.parseInt(JOptionPane.showInputDialog("Porfavor ingrese el numero de filas para la matriz.\n" +
                    "recuerda que no puede exceder las 50 filas ni tampoco puede ser 0"));
            if (numeroFilas > 50) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese un valor que este por debajo de 50");

            } else {
                continue;
            }
        } while (numeroFilas > 50 || numeroFilas <= 0);

        do {
            numeroColumnas = Integer.parseInt(JOptionPane.showInputDialog("Porfavor ingrese el numero de columnas para la matriz.\n" +
                    "recuerda que no puede exceder las 50 columnas ni tampoco puede ser 0"));
            if (numeroColumnas > 50) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese un valor que este por debajo de 50");

            } else {
                continue;
            }
        } while (numeroColumnas > 50 || numeroColumnas <= 0);

        matriz = new int[numeroFilas][numeroColumnas];
        return matriz;
    }

    /**
     * Este Metodo se utiliza para rellenar la fila inicial en sentido de izquierda derecha, tomando en cuenta el valor que el usuario eligio
     * @param matriz
     * @param filaIni
     * @return
     */
    public int[][] llenarIzquierdaDerecha(int[][] matriz, int filaIni) {
        numeroInicial = Integer.parseInt(JOptionPane.showInputDialog("Porfavor digite el numero por el cual quiere que se empiece a llenar la matriz"));
        int columnasMatriz = matriz[0].length;
        for (int i = 0; i < columnasMatriz; i++) {
            if (matriz[filaIni - 1][i] == 0) {
                matriz[filaIni - 1][i] = numeroInicial;
                numeroInicial++;
            }
        }
        return matriz;
    }

    /**
     * Este metodo recibe la matriz previamente creada y llenada y la imprime para que sea visualizada por el usuario
     *
     * @param matriz
     */
    public void imprimirMatriz(int matriz[][]) {
        String imprimir = "";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                imprimir += matriz[i][j];
                imprimir += "   ";
            }
            imprimir += "\n";
        }
        JOptionPane.showMessageDialog(null, imprimir);
    }
}
