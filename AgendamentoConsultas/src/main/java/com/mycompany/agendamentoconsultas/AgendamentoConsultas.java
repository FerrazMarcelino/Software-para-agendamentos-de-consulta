/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.agendamentoconsultas;

/**
 *
 * @author maria
 */
public class AgendamentoConsultas {

    public static void main(String[] args) {
        
    // Criar os médicos
    Paciente paciente = new Paciente("João", "12345678900", "joao@email.com");
    Especialidade especialidade = new Especialidade("Cardiologia");
    Medico medico = new Medico("Dr. Silva", "98765432100", "CRM12345", especialidade);

    Consulta consulta1 = new Consulta(paciente, medico, "25/01/2025", "10:00");
    Consulta consulta2 = new Consulta(paciente, medico, "26/01/2025", "11:00");

    // Criar agendamentos e add consultas
    Agendamentos agendamentos = new Agendamentos();
    agendamentos.addConsulta(consulta1);
    agendamentos.addConsulta(consulta2);

    // Mostra as consultas marcadas
    System.out.println("Consultas antes da remoção:");
    agendamentos.listaConsultas();

    // Removendo uma consulta
    agendamentos.rmConsulta(consulta1);

    System.out.println("\nConsultas após a remoção:");
    agendamentos.listaConsultas();
        
    }
}
