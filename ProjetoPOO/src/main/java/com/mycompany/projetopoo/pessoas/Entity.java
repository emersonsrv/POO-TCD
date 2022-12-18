/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopoo.pessoas;

/**
 *
 * @author suKarolainy
 */
public abstract class Entity {
     private Long id;
    private boolean excluded;

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Entity() {
    }

    public Entity(Long id) {
        this.id = id;
    }

    public Entity(Long id, boolean excluded) {
        this.id = id;
        this.excluded = excluded;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isExcluded() {
        return excluded;
    }

    public void setExcluded(boolean excluded) {
        this.excluded = excluded;
    }
    //</editor-fold>

}
