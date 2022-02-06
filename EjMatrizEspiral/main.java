// TODO: 2/02/2022 método para recorrer fila izq-der
// TODO: 2/02/2022 método para pedirle las dimensiones al usuario

//This program was maded by:
// - Geraldine Echeverri Ayala
// - Claudia Zorrilla
// - Sara Oquendo Valle

package com.tarea2;

import javax.swing.*;
import java.text.BreakIterator;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        //Se define el objeto de entrada para el llenado de datos
        Scanner entrada=new Scanner(System.in);
        int matrizIzquierdaDerecha [][], numeroFilas, numeroColumnas;

        //Pedir dimensiones matriz
        numeroFilas = Integer.parseInt(JOptionPane.showInputDialog("Digita el numero de filas por favor")); //Est es para pedirle al usuario el #de filas en una ventana
        numeroColumnas = Integer.parseInt(JOptionPane.showInputDialog("Digita el numero de columnas por favor"));

        if((numeroFilas <= 50) && (numeroColumnas <= 50))
        {
            //Ahora sí definimos la matriz con el nombre de arriba, el tipo de dato, y el nombre de las variables
            matrizIzquierdaDerecha = new int[numeroFilas][numeroColumnas];
            System.out.println("A continuación digitarás la matriz:");

            //Se usa un ciclo PARA, (valga la redundancia) para pedir los números de llenado
            //Primero se piden las filas

            for (int i=0;i<numeroFilas;i++){
                for (int j=0;j<numeroColumnas;j++){
                    System.out.println("Fila ["+i+"] "+"Columna: ["+j+"]:");
                    matrizIzquierdaDerecha[i][j]=entrada.nextInt(); //Aquí se guarda en la matriz

                }
            }

            //Ciclo para mostrar la matriz
            System.out.println("la matriz es: ");
            System.out.println("");
            for (int i=0;i<numeroFilas;i++){
                for (int j=0;j<numeroColumnas;j++){
                    System.out.print(" "+ matrizIzquierdaDerecha[i][j]);
                }
                System.out.println("");

                if ((numeroFilas==numeroColumnas) || (numeroColumnas != numeroFilas) && (numeroColumnas < numeroFilas))
                {
                    break;
                }
            }

        }
        else
        {
            JOptionPane.showMessageDialog(null,"Los datos ingresados son demasiado grandes para esta matriz.");
        }
        JOptionPane.showMessageDialog(null,"Hasta luego y gracias por usar nuestro programa :3");
    }
}


