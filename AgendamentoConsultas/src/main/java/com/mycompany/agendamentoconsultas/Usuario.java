/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendamentoconsultas;

/**
 *
 * @author maria
 */
public abstract class Usuario {
    
    private String nome;
    private String cpf;

    //construtor
    public Usuario(String nome, String cpf) {
        boolean aux_cpf = setCpf(cpf);
        boolean aux_nome = setNome(nome);
        if (aux_cpf == false){
        System.out.println("CPF inválido!");        
        }else{
            this.cpf=cpf;
        }
        if(aux_nome == false){
        System.out.println("O nome não pode ser nulo");
        }else{
        this.nome=nome;
        }
    }
    //verifica se o cpf tem 7 digitos
    public boolean setCpf(String cpf) {
        if (!cpf.matches("\\d{11}")) { // Verifica se contém exatamente 11 números
            return false;
        }
        return true;
    }
    //verifica se o nome não é nulo ou vazio
    public boolean setNome(String nome) {
        if (nome == "" || nome == null) { // Verifica se o nome não é nulo
            return false;
        }
        return true;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
    
    
}
