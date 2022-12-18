/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopoo.pessoas;

import com.mycompany.projetopoo.dados.Endereco;
import com.mycompany.projetopoo.dados.Pessoa;

/**
 *
 * @author suKarolainy
 */
public class Paciente extends Pessoa{

    public Paciente() {
    }
    
    public Paciente(String nome, String cpf, String nascimento, String telefone, Endereco endereco, Long id) {
        super(nome, cpf, nascimento, telefone, endereco, id);
    }
    
}
