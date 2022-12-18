/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopoo.dados;

import com.mycompany.projetopoo.pessoas.Entity;

/**
 *
 * @author suKarolainy
 */
public class Endereco extends Entity{
    private String bairro;
    private String rua;
    private String numero;

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Endereco() {
    }

    public Endereco(Long id, String bairro, String rua, String numero) {
        super(id);
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
    }
    
    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString(){
        return "Endereco{"
                + ",bairro=" + bairro
                + ",rua=" + rua
                + ",numero" + numero
                + '}';
    }
}
