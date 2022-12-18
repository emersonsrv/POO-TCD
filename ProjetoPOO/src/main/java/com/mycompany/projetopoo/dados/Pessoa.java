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
public class Pessoa extends Entity{
    private String nome;
    private String cpf;
    private String nascimento;
    private String telefone;
    private Endereco endereco;

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Pessoa() {
    }

    public Pessoa(String nome, String cpf, String nascimento, String telefone, Endereco endereco, Long id) {
        super(id);
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }


    @Override
    public String toString(){
        return "Pessoa{"
                + ",nome=" + nome
                + ",cpf=" + cpf
                + ",nascimento=" + nascimento
                + ",telefone=" + telefone
                + ",endereco=" + endereco
                + '}';
    }
}
