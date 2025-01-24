/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendamentoconsultas;

/**
 *
 * @author maria
 */
public class Medico extends Usuario{
    
    private String crm;
    private Especialidade especialidade;

    public Medico(String nome, String cpf, String crm, Especialidade especialidade) {
        super(nome, cpf);
        this.crm = crm;
        this.especialidade = especialidade;
    }

    public String getCrm() {
        return crm;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }
    
}
