package com.co.sofka;

public class CadenasTexto {
    private String instrucciones = "Bienvenido al programa de Matriz Espiral.\n" +
            "Este programa tiene la sencilla funcionalidad de solicitarte un numero de filas y columnas para una matriz.\n" +
            "Luego automaticamente esta se llenara automaticamente en forma de caracol, el contenido de la matriz seran numeros reales enteros";

    private String textoMenu = "Para comenzar, Porfavor elija una de estas dos opciones\n" +
            "1.)Instrucciones de uso\n" +
            "2.)Crear matriz\n" +
            "3.)Salir del programa";

    private String textoSalir = "Sera para otra ocasion\n" +
            "Hasta Luego :)";


    public String getInstrucciones() {
        return instrucciones;
    }

    public String getTextoMenu() {
        return textoMenu;
    }

    public String getTextoSalir() {
        return textoSalir;
    }
}
