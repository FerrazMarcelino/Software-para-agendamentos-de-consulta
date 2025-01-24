/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.agendamentoconsultas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author maria
 */
public class UsuarioTest {
    
    
    public UsuarioTest() {
    }

    @Test
    public void cpfValido() {
        Paciente paciente = new Paciente("João", "12345678900", "joao@email.com");
        assertTrue(paciente.setCpf("12345678900"), "O CPF '12345678900' deveria ser válido");
        
    }
    @Test
    public void cpfInvalido() {
        Paciente paciente = new Paciente("João", "123456789", "joao@email.com");
        assertFalse(paciente.setCpf("123456789"), "O CPF '123456789' deveria ser inválido");
    }
    @Test
    public void nomeValido() {
        Paciente paciente = new Paciente("João", "12345678900", "joao@email.com");
        assertTrue(paciente.setNome("João"), "O nome 'João' deveria ser válido");
        
    }
    @Test
    public void nomeInvalido() {
        Paciente paciente = new Paciente("", "12345678900", "joao@email.com");
        assertFalse(paciente.setNome(""), "O nome '' deveria ser invalido");   
    }
}
