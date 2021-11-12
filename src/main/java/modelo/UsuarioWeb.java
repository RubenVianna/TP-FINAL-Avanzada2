/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "USUARIOWEB")
public class UsuarioWeb {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    
   @Basic
    private String usuario;
   @Basic 
   private String contraseña;
    
   @OneToOne(mappedBy = "usuario", fetch = FetchType.LAZY)
    private Cliente cliente;

     public UsuarioWeb() {
    }

    public UsuarioWeb(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }
    
    public UsuarioWeb(String usuario, String contraseña , Cliente cliente) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.cliente = cliente;
    }
       
    
    public void modificarDatosCliente(Persona datosPersona){
    datosPersona.modificarDatos(datosPersona);
    }
    
    

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }
        

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

   
    
    
}
