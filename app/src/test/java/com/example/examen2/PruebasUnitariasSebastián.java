package com.example.examen2;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;

public class PruebasUnitariasSebastián {

    //Metodo 1 : convertirNumero()
    @Test
    public void testConvertirNumero() {
        //Test conversion a binario
        assertEquals(5, Calculadora.convertirNumero("101", 0));
        //Test conversion a octal
        assertEquals(63, Calculadora.convertirNumero("77", 1));
        //Test conversion a hexa
        assertEquals(255, Calculadora.convertirNumero("FF", 3));
    }

    //Metodo 2 : realizarOperacion()
    @Test
    public void testRealizarOperacion() {
        //Test suma
        assertEquals(15, Calculadora.realizarOperacion(10, 5, "+"));
        //Test resta
        assertEquals(5, Calculadora.realizarOperacion(10, 5, "-"));
        //Test multiplicacion
        assertEquals(50, Calculadora.realizarOperacion(10, 5, "*"));

    }

    //Metodo 3 : convertirADestino()
    @Test
    public void testConvertirADestino() {
        //Test conversion a binario
        assertEquals("1010", Calculadora.convertirADestino(10, 0));
        //Test conversion a octal
        assertEquals("12", Calculadora.convertirADestino(10, 1));
        // Test conversion to decimal
        assertEquals("10", Calculadora.convertirADestino(10, 2));
    }


}

