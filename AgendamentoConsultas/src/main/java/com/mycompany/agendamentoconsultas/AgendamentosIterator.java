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
public class AgendamentosIterator implements Iterator{
    
    ArrayList<Agendamentos> agendamentos;
    int posicao = 0;
    
    public AgendamentosIterator(ArrayList<Agendamentos> agendamentos){
        this.agendamentos = agendamentos;
    }
    
    public Object next(){
        Agendamentos agendamento = agendamentos.get(posicao);
        posicao++;
        return agendamento;
        
    }
    
    public boolean hasNext(){
        if(posicao>=agendamentos.size()){
            return false;
        }else{
            return true;
        }
        
    }
    
}
