/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergentes;

/**
 *
 * @author HP-J
 */
public class Tareas {
    private int id;
    private String tarea;
    
    public Tareas() {
    }
    
    public Tareas(int id, String tarea) {
        this.id = id;
        this.tarea = tarea;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTarea() {
        return tarea;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }
    
    
    
    
}
