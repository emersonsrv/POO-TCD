/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopoo.daos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author suKarolainy
 */
public interface IDAO<T> {

    public String getSaveStatment();

    public String getUpdateStatment();

    public void composeSaveOrUpdateStatement(PreparedStatement pstmt, T e);

    public Long saveOrUpdate(T e) throws Exception;

    public String getFindByIdStatment();

    public T findById(Long id);

    public String getFindAllStatment();

    public List<T> findAll();

    public String getMoveToTrashStatement();
    public void moveToTrash(T e);

    public String getRestoreFromTrashStatement();
    public void restoreFromTrash(Long id);

    public String getFindAllOnTrashStatement();
    public List<T> findAllOnTrash();

    public T extractObject(ResultSet resultSet);

    public List<T> extractObjects(ResultSet resultSet);

}
