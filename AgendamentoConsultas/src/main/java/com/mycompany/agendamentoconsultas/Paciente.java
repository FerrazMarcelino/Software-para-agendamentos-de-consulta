/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendamentoconsultas;

/**
 *
 * @author maria
 */
public class Paciente extends Usuario{
    
    private String email;

    public Paciente(String nome, String cpf, String email) {
        super(nome, cpf);
        boolean aux_email = setEmail(email);
        if (aux_email == false){
        System.out.println("O email não pode ser nulo ou vazio");
        }else{
            this.email = email;
        }
    }

    public boolean setEmail(String email) {
        if (email == "" || email == null) { // Verifica se contém exatamente 11 números
            return false;
        }
        return true;
    }
    public String getEmail() {
        return email;
    }
    
}
