/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopoo.atendimento;

import com.mycompany.projetopoo.pessoas.Entity;
import com.mycompany.projetopoo.pessoas.Paciente;

/**
 *
 * @author suKarolainy
 */
public class Atendimento extends Entity{
    private String data;
    private Triagem triagem;
    private Consulta consulta;
    private Paciente paciente;

 //atend tem chave estrangeira de paciente, triagem e consulta
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Atendimento() {
    }
    
    public Atendimento(String data, Triagem triagem, Consulta consulta, Paciente paciente, Long id){
        super(id);
        this.data = data;
        this.triagem = triagem;
        this.consulta = consulta;
        this.paciente = paciente;
    }
    
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Triagem getTriagem() {
        return triagem;
    }

    public void setTriagem(Triagem triagem) {
        this.triagem = triagem;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    //</editor-fold>

    @Override
    public String toString() {
        return "Atendimento{" 
                + "data=" + data
                + ", triagem=" + triagem 
                + ", consulta=" + consulta 
                + ", paciente=" + paciente 
                + '}';
    }
}
