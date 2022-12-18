/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopoo.atendimento;

import com.mycompany.projetopoo.pessoas.Enfermeiro;
import com.mycompany.projetopoo.pessoas.Entity;

/**
 *
 * @author suKarolainy
 */
public class Triagem extends Entity{
    private Enfermeiro enfermeiro;
    private String prioridade;
    
    public Triagem() {
    }

    public Triagem(Enfermeiro enfermeiro, String prioridade, Long id) {
        super(id);
        this.enfermeiro = enfermeiro;
        this.prioridade = prioridade;
    }

    public Enfermeiro getEnfermeiro() {
        return enfermeiro;
    }

    public void setEnfermeiro(Enfermeiro enfermeiro) {
        this.enfermeiro = enfermeiro;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    @Override
    public String toString() {
        return "Triagem{" 
                + "enfermeiro=" + enfermeiro
                + ", prioridade=" + prioridade
                + '}';
    }

    
}
