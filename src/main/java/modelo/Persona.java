/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.persistence.Basic;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author Usuario
 */
@MappedSuperclass
public abstract class Persona implements Comparable <Persona>  {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id_persona;
    @Basic
    private int dni ;
    @Basic
    private String nombre;
    @Basic
    private String apellido;
    @Basic
    private String telefono;
    @Basic
    private String direccion;

    public Persona(int dni, String nombre, String apellido, String telefono, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public Persona() {
    }
    
    public Persona(Persona unaPersona) {
		this(unaPersona.getDni(), unaPersona.getNombre(), unaPersona.getApellido(), unaPersona.getTelefono(), unaPersona.getDireccion());
	}
    

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    @Override
	public int compareTo(Persona o) {
		return (int) (this.dni - o.getDni());
	}
    
        public void modificarDatos(Persona datosPersona) {
		this.dni = datosPersona.getDni();
		this.nombre = datosPersona.getNombre();
		this.apellido = datosPersona.getApellido();
                this.direccion = datosPersona.getDireccion();
                this.telefono = datosPersona.getTelefono();
        }
    
    @Override
    public String toString() {
        return (id_persona + dni + nombre + apellido+ telefono + direccion );
    }

   
}
