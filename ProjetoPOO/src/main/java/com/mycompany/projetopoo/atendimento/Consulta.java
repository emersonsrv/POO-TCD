/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopoo.atendimento;

import com.mycompany.projetopoo.pessoas.Entity;
import com.mycompany.projetopoo.pessoas.Medico;

/**
 *
 * @author suKarolainy
 */
public class Consulta extends Entity{
    private Medico medico;
    private String relatorio;

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Consulta() {
    }

    public Consulta(Medico medico, String relatorio, Long id) {
        super(id);
        this.medico = medico;
        this.relatorio = relatorio;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    
    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getRelatorio() {
        return relatorio;
    }

    public void setRelatorio(String relatorio) {
        this.relatorio = relatorio;
    }
    //</editor-fold>

    @Override
    public String toString() {
        return "Consulta{"
                + ", medico=" + medico 
                + ", relatorio=" + relatorio 
                + '}';
    }
}
