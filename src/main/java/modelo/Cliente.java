/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "Cliente")
public class Cliente extends Persona implements Serializable{
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id_cliente;
    
  @OneToOne(cascade = CascadeType.ALL)
   @JoinColumn(name = "ID_USUARIOWEB")
    private UsuarioWeb usuario;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIPOCLIENTE")
    private TipoCliente tipoCli;
    
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Turno> turnos = new ArrayList<>();
    
    public Cliente(int dni, String nombre, String apellido, String telefono, String direccion, TipoCliente tipoCli) {
        super(dni, nombre, apellido, telefono, direccion);
        this.turnos = new ArrayList();
        this.tipoCli = tipoCli;
    }
    
    public Cliente(int dni, String nombre, String apellido, String telefono, String direccion) {
        super(dni, nombre, apellido, telefono, direccion);
        this.turnos = new ArrayList();
        
    }

    public Cliente() {
    super();
        this.turnos = new ArrayList();
    }
    
    public void agregarTurno (Turno t){
        this.turnos.add(t);
    }
    
    public void crearUsuarioWeb (String usuario, String contraseña, Cliente cli){
    this.usuario = new UsuarioWeb(usuario, contraseña, cli);
    }


    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public UsuarioWeb getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioWeb usuario) {
        this.usuario = usuario;
    }

    public TipoCliente getTipoCli() {
        return tipoCli;
    }

    public void setTipoCli(TipoCliente tipoCli) {
        this.tipoCli = tipoCli;
    }
    
    
  
         
    @Override
    public void modificarDatos(Persona datosPersona) {
        super.modificarDatos(datosPersona);
    }

    
}
