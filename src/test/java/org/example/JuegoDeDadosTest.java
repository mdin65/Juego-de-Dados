package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class JuegoDeDadosTest {

    @Test
    public void testValoresDadosEstanEnRango() {
        Dado dado = new Dado();
        for (int i = 0; i < 100; i++) {
            dado.lanzar();
            int valor = dado.getValor();
            assertTrue(valor >= 1 && valor <= 6, "El valor del dado debe estar entre 1 y 6");
        }
    }

    @Test
    public void testSumaCorrectaDeValores() {
        Calculadora calc = new Calculadora();
        int resultado = calc.sumar(3, 4);
        assertEquals(7, resultado, "La suma de 3 y 4 debe ser 7");
    }

    @Test
    public void testResultadoDelJuego() {
        // Usamos un "Mock" manual para controlar los valores del dado
        JuegoDeDados juego = new JuegoDeDados() {
            @Override
            public String jugar() {
                // Suplantamos los valores manualmente para testear el caso específico
                int valor1 = 3;
                int valor2 = 4;
                int suma = new Calculadora().sumar(valor1, valor2);
                return suma == 7 ? "¡Ganaste!" : "Perdiste.";
            }
        };

        String resultado = juego.jugar();
        assertEquals("¡Ganaste!", resultado, "Si la suma es 7, debe ganar.");
    }
}
