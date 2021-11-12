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
public class CondicionPrioritaria implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idCondicion;
    @Basic
    private String motivo;
    @OneToMany(mappedBy = "condicionPrioritaria", cascade = CascadeType.ALL)
    private List<Turno> turnos = new ArrayList<>();
    public CondicionPrioritaria() {
    }

         
    
    public int getIdCondicion() {
        return idCondicion;
    }

    public void setIdCondicion(int idCondicion) {
        this.idCondicion = idCondicion;
    }

    public List<Turno> getTurnos() {
        return turnos;
    }

    /** deberiamos revisar si usar una lista ya ordenada, entonces que las ordene por numero de prioridad
     * agregamos el turno creado a la coleccion de turnos con una condicion prioritaria 
     **/
    public void setTurnos(List<Turno> turnos) {
        this.turnos = turnos;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public CondicionPrioritaria(String motivo) {
        this.motivo = motivo;
    }

    
    
}
