package com.co.sofka;


import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int opcion;
        int matrizEspiral[][];
        CadenasTexto cadenasTexto = new CadenasTexto();
        Matriz matriz = new Matriz();
        opcion = Integer.parseInt(JOptionPane.showInputDialog(cadenasTexto.getTextoMenu()));
        switch (opcion) {
            case 1:
                JOptionPane.showMessageDialog(null, cadenasTexto.getInstrucciones());
            case 2:
                matrizEspiral = matriz.solicitudMatriz();
                matriz.llenarIzquierdaDerecha(matrizEspiral, 1);
                matriz.imprimirMatriz(matrizEspiral);
                JOptionPane.showMessageDialog(null, "Eso es tod.. Eso es tod...Eso es tod... \n" +
                        "Eso es todo Amigos :D");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, cadenasTexto.getTextoSalir());
                break;
        }


    }
}

