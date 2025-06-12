package org.example;

public class Inicio {
    public static void main(String[] args) {
        JuegoDeDados juego = new JuegoDeDados();
        String resultado = juego.jugar();
        System.out.println("Resultado del juego: " + resultado);
    }
}
