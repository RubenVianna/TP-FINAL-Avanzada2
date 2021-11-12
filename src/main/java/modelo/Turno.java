/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
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
import modelo.*;

/**
 *
 * @author Usuario
 */
@Entity
public class Turno implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id_turno; 
    @Basic
    private Date horaRegistro;        
    @Basic
    private Date horaFinalizacion;
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CONDICIONPRIORITARIA")
    private CondicionPrioritaria condicionPrioritaria;
   @ManyToOne (fetch = FetchType.LAZY)
  // @JoinColumn(name = "id_cliente")
   private Cliente cliente;
   @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "ID_TRAMITE")
    private Tramite tramite;
   @ManyToOne (fetch = FetchType.LAZY) 
  @JoinColumn(name = "ID_ESTADOTURNO")
   private EstadoTurno estadoTurno;
   @OneToMany(mappedBy = "turno", cascade = CascadeType.ALL)
   private List<HistorialTramite> historialTramite = new ArrayList<>();
   
   @ManyToOne (cascade = CascadeType.ALL) 
   @JoinColumn(name = "ID_Area")
   private Area area;
        
              
    public Turno (){
    }
    /**
     * crea un turno con atencion prioritaria
     * @param horaRegistro
     * @param condicionPrioritaria
     * @param cliente
     * @param tramite
     * @param estadoTurno 
     */
    public Turno(Date horaRegistro, CondicionPrioritaria condicionPrioritaria, Cliente cliente, Tramite tramite, EstadoTurno estadoTurno) {
        this.horaRegistro = horaRegistro;
        this.horaFinalizacion = null;
        this.condicionPrioritaria = condicionPrioritaria;
        this.cliente = cliente;
        this.tramite = tramite;
        this.estadoTurno = estadoTurno;
    }
     
    /**
     * crea un turno sin atencion prioritaria
     * @param horaRegistro
     * @param cliente
     * @param tramite
     * @param estadoTurno 
     */        
    public Turno(Date horaRegistro, Cliente cliente, Tramite tramite, EstadoTurno estadoTurno) {
        this.horaRegistro = horaRegistro;
        this.horaFinalizacion = null;
        this.cliente = cliente;
        this.tramite = tramite;
        this.estadoTurno = estadoTurno;
    }
    
    
    
    
    public void finalizarTurno (){
        Calendar c = Calendar.getInstance();
        Date hora = c.getTime();
        this.horaFinalizacion = hora;
        //aca se debe agregar el cambiar el estado de turno a terminado
   
    }  
    
    
    public CondicionPrioritaria getCondicionPrioritaria() {
        return condicionPrioritaria;
    }

    public void setCondicionPrioritaria(CondicionPrioritaria condicionPrioritaria) {
        this.condicionPrioritaria = condicionPrioritaria;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Tramite getTramite() {
        return tramite;
    }

    public void setTramite(Tramite tramite) {
        this.tramite = tramite;
    }

    public EstadoTurno getEstadoTurno() {
        return estadoTurno;
    }

    public void setEstadoTurno(EstadoTurno estadoTurno) {
        this.estadoTurno = estadoTurno;
    }

  

    public Date getHoraRegistro() {
        return horaRegistro;
    }

    public void setHoraRegistro(Timestamp horaRegistro) {
        this.horaRegistro = horaRegistro;
    }

    public Date getHoraFinalizacion() {
        return horaFinalizacion;
    }

    public void setHoraFinalizacion(Timestamp horaFinalizacion) {
        this.horaFinalizacion = horaFinalizacion;
    }
    
    
    public void crearHistorialTramite (Date fecha, Date horaDeAtencion, Tramite tramite, Turno turno){
        HistorialTramite ht = new HistorialTramite(fecha, horaDeAtencion,tramite, turno);
        this.historialTramite.add(ht);
    } 

    public int getId_turno() {
        return id_turno;
    }

    public void setId_turno(int id_turno) {
        this.id_turno = id_turno;
    }

    public List<HistorialTramite> getHistorialTramite() {
        return historialTramite;
    }

    public void setHistorialTramite(List<HistorialTramite> historialTramite) {
        this.historialTramite = historialTramite;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public HistorialTramite buscarHistorialTramite(Date fecha, Date hora, Tramite tra){
       /*
		 * Busca si ya existe registrado un historial tramite con esos datos
                 * Si existe retorna la instancia del historial tramite con esos datos.
                 * Caso contrario retorma null; 
		 */
		HistorialTramite htEncontrado = null;

		for (HistorialTramite ht : this.historialTramite) {
			if (ht.getFecha() == fecha && hora == ht.getHoraDeAtencion() && tra.getId_Tramite()==ht.getTramite().getId_Tramite() ) {
				/*
				 * Significa que se encontró el autor.
				 */
				htEncontrado = ht;
				break;
			}
		}

		return htEncontrado; 
    }
    
    
   
 

    
    
}
