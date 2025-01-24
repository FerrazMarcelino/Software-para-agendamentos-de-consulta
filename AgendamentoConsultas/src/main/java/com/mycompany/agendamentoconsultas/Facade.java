/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendamentoconsultas;

import java.util.ArrayList;

/**
 *
 * @author maria
 */
public class Facade {
    private Agendamentos agendamentos;

    public Facade() {
        this.agendamentos = new Agendamentos();
    }
    public void agendarConsulta(Paciente paciente, Medico medico, String data, String hora) {
        if (paciente == null || paciente.equals("") || medico == null || medico.equals("") || data == null || data.isEmpty() || hora == null || hora.isEmpty()) {
            System.out.println("Nada pode estar vazio. Não é possível agendar a consulta.");
            return;
        }
        
        Consulta consulta = new Consulta(paciente, medico, data, hora);
        agendamentos.addConsulta(consulta);
        System.out.println("Consulta agendada com sucesso!");    
    
    }
    
    public void mostrarTodasConsultas(){
        ArrayList<Consulta> consultas = agendamentos.getConsultas();
        if (consultas.isEmpty()){
            System.out.println("Não existe consulta agendada");
            return;
        }
        for (Consulta consulta : consultas) {
            System.out.println(consulta);
            
        }
    
    }
    //função para procurar consultas pelo cpf do paciente
    public void buscarPaciente(String cpfPaciente){
        ArrayList<Consulta> consultas = agendamentos.getConsultas();
        boolean encontrou = false;

        for (Consulta consulta : consultas) {
            if (consulta.getPaciente().getNome().equalsIgnoreCase(cpfPaciente)) {
                System.out.println(consulta);
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Nenhuma consulta encontrada para o paciente: " + cpfPaciente);
        }
    
    }
    
    //função para listar os medicos do local
    public void listarMedicos(ArrayList<Medico> medicos){
        if(medicos.isEmpty()){
            System.out.println("A lista de médicos esta vazia");
            return;
        }
        for(Medico medico : medicos){
            System.out.println("Medico:"+medico.getNome()+"Especialidade:"+medico.getEspecialidade()+"CRM:"+medico.getCrm());
        }
    
    }
    
}
