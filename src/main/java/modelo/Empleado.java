/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "Empleado")
public class Empleado extends Persona implements Serializable{
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private int id_empleado;
    //revisar esto porque no creo que sea necesario tener que crear un atributo area para que no tire error de mappeo
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "id_area")
    private Area area;
   

    public Empleado(int dni, String nombre, String apellido, String telefono, String direccion) {
        super(dni, nombre, apellido, telefono, direccion);
        
    }

    public Empleado() {
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }
    
    

}
    
    
