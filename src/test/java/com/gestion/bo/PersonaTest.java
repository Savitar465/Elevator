package com.gestion.bo;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


import static org.junit.Assert.*;

public class PersonaTest {
    private Persona persona;
    private Elevador elevador;

    @Rule
    public ExpectedException exception = ExpectedException.none();


    @Before
    public void before() {
        persona = new Persona();
        elevador = new Elevador();
    }

    @Test
    public void crearPersonaEnUnPiso() throws Exception {
        persona.crearPersona();
        assertTrue(1 <= persona.crearPersona() && persona.crearPersona() <= 3);
    }

    @Test
    public void mismoPiso() throws Exception{
        persona.llamarElevador();
    }

    @Test
    public void pisoDiferente() throws Exception{
        persona.llamarElevador();
        assertTrue(persona.llamarElevador()!=false);
    }
    @Test
    public void pisoNoEstaEnLosRangos() throws Exception{
        assertNotEquals(5,persona.asignarPisoAleatorio());
        assertNotEquals(-1,persona.asignarPisoAleatorio());
    }

    @Test
    public void presionarBotonPisoDestino() throws  Exception{
        assertTrue(1 <= persona.asignarPisoAleatorio() && persona.asignarPisoAleatorio() <= 3);
    }

    @Test
    public void elevadorLibre() throws Exception {
        //0= cero persona en el elevador
        //1= una persona en el elevador
        assertEquals("Elevador vacio",elevador.personaEnElevador(0));
    }


}
