/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Usuario
 */
@Entity
public class EstadoTurno implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id_Estado;
    @Basic
    private String nombre;

    @OneToMany(mappedBy = "estadoTurno", cascade = CascadeType.ALL)
    private List<Turno> turnos = new ArrayList<>();

    public int getId_Estado() {
        return id_Estado;
    }

    public void setId_Estado(int id_Estado) {
        this.id_Estado = id_Estado;
    }

    public List<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(List<Turno> turnos) {
        this.turnos = turnos;
    }
    
    
    
    public EstadoTurno() {
    }

    public EstadoTurno(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
