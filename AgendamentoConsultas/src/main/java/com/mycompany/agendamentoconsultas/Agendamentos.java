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
public class Agendamentos {
 
    private ArrayList<Consulta> consultas = new ArrayList<>();

    public void addConsulta(Consulta consulta) {
        if(consulta != null){
        consultas.add(consulta);
        }
    }

    public boolean rmConsulta(Consulta consulta) {
        if(consulta != null && consultas.contains(consulta)){
            consultas.remove(consulta);
            return true;
        }
        return false;
    }
    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }
    
        public void listaConsultas() {
        for (Consulta consulta : consultas) {
            System.out.println("Paciente: " + consulta.getPaciente().getNome() +
                               ", Médico: " + consulta.getMedico().getNome() +
                               ", Data: " + consulta.getData() +
                               ", Hora: " + consulta.getHora());
            }
        }
    
    
}
