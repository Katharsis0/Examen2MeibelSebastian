package com.example.examen2;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PruebasUnitariasMeibel {

    //Metodo 1 : convertirNumero()
    @Test
    public void testConvertirNumero() {
        //Test conversion número hexadecimal a decimal
        assertEquals(20, Calculadora.convertirNumero("14", 3));

        //Test conversion a binario con numero decimal negativo
        assertEquals(-5, Calculadora.convertirNumero("-101", 0));

        // Base inválida debería devolver -1
        assertEquals(-1, Calculadora.convertirNumero("55", 4));
    }



    //Metodo 2 : realizarOperacion()

    @Test
    public void testDivision() {
        //Test división
        assertEquals(3, Calculadora.realizarOperacion(18, 6, "/"));
    }

    @Test
    public void testDivisionPorCero() {
        //Test división entre cero
        assertThrows(ArithmeticException.class, () -> {
            Calculadora.realizarOperacion(10, 0, "/");
        }, "Se espera ArithmeticException al usar division entre cero");
    }

    @Test
    public void testOperadorNoSoportado() {
        //Test operador no soportado (modulo)
        assertThrows(IllegalArgumentException.class, () -> {
            Calculadora.realizarOperacion(5, 3, "%");
        }, "Se espera IllegalArgumentException al usar operador no válido");
    }


    //Metodo 3 : convertirADestino()
    @Test
    public void testConvertirADestino() {
        //Test conversion a hexadecimal
        assertEquals("41", Calculadora.convertirADestino(65, 3));
        //Test para verificar que el resultado no es nulo para bases válidas
        assertNotNull(Calculadora.convertirADestino(10, 0));
    }

    @Test
    public void testBaseDestinoNoSoportada() {
        //Test base de destino no soportada se intenta convertir 5 a base 9
        assertThrows(IllegalArgumentException.class, () -> {
            Calculadora.convertirADestino(5, 9);
        },"Se espera IllegalArgumentException al usar base no soportada");
    }


    //Metodo nuevo: “Encuentra(lista, elemento)”

    @Test
    public void testElementoPresente() {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);
        assertTrue(Calculadora.Encuentra(lista, 3));
    }

    @Test
    public void testElementoAusente() {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);
        assertFalse(Calculadora.Encuentra(lista, 6));
    }

    @Test
    public void testListaVacia() {
        List<Integer> lista = Collections.emptyList();
        assertFalse(Calculadora.Encuentra(lista, 1));
    }
}
