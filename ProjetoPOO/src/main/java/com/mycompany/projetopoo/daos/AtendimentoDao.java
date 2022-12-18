/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopoo.daos;

import com.mycompany.projetopoo.atendimento.Atendimento;
import com.mycompany.projetopoo.atendimento.Consulta;
import com.mycompany.projetopoo.atendimento.Triagem;
import com.mycompany.projetopoo.pessoas.Paciente;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author suKarolainy
 */
public class AtendimentoDao extends Dao<Atendimento> {
    public static final String TABLE = "atendimento";

    @Override
    public String getSaveStatment() {
        return "insert into " + TABLE
                + " (data, triagem, consulta, paciente)"
                + " values (?, ?, ?, ?)";
    }

    @Override
    public String getUpdateStatment() {
        return "update " + TABLE
                + " set data =?, triagem = ?, consulta = ?, paciente = ?"
                + " where id = ?";
    }

    @Override
    public void composeSaveOrUpdateStatement(PreparedStatement pstmt, Atendimento e) {
        try {
            pstmt.setString(1, e.getData());
            pstmt.setLong(2, e.getTriagem().getId());
            pstmt.setLong(3, e.getConsulta().getId());
            pstmt.setLong(4, e.getPaciente().getId());

            if (e.getId() != null && e.getId() > 0) {
                pstmt.setLong(5, e.getId());
            }
        } catch (SQLException ex) {
            Logger.getLogger(AtendimentoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getFindByIdStatment() {
        return "select data =?, triagem = ?, consulta = ?, paciente = ?"
                + " from " + TABLE
                + " where id = ?";
    }

    @Override
    public String getFindAllStatment() {
        return "select data =?, triagem = ?, consulta = ?, paciente = ?"
                + " from " + TABLE;
    }

    /**
     * SQL statement to use to find movies by genre
     *
     * @return SQL statement
     */
    
    private String getfindAllByPartialNameStatment() {
        return " select data =?, triagem = ?, consulta = ?, paciente = ?"
                + " from " + TABLE
                + " where nome like ?";
    }
    
    public List<Atendimento> findAllByPartialName(String partialName) {

        try ( PreparedStatement preparedStatement
                = DbConnection.getConnection().prepareStatement(
                        getfindAllByPartialNameStatment())) {

            preparedStatement.setString(1, "%" + partialName + "%");

            // Show the full sentence
            System.out.println(">> SQL: " + preparedStatement);

            // Performs the query on the database
            ResultSet resultSet = preparedStatement.executeQuery();

            // Returns the respective object
            return extractObjects(resultSet);

        } catch (Exception ex) {
            System.out.println("Exception: " + ex);
        }

        return null;
    }

    @Override
    public String getMoveToTrashStatement() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getRestoreFromTrashStatement() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getFindAllOnTrashStatement() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Extracts the movie from the result set with the associated genre
     *
     * @param resultSet The record in the database
     * @return The movie located
     */
    @Override
    public Atendimento extractObject(ResultSet resultSet) {
        if (resultSet != null) {
            try {
                return new Atendimento (
                    resultSet.getString("data"),
                    new TriagemDao().findById(resultSet.getLong("triagem")),
                    new ConsultaDao().findById(resultSet.getLong("consulta")),
                    new PacienteDao().findById(resultSet.getLong("paciente")),
                    null
                );
            } catch (SQLException ex) {
                Logger.getLogger(AtendimentoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return null;
    }

}

