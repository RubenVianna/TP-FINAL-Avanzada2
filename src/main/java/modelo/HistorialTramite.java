/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

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
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;



/**
 *
 * @author Sirgius
 */
@Entity
public class HistorialTramite {
 @Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)
 private int id_historialTramite;
 @Basic
 private Date fecha;
 @Basic
 private Date horaDeAtencion;
 @Basic
 private Date horaDeFinalizacion;   
 @ManyToOne (fetch = FetchType.LAZY)
 private Tramite tramite;
 
 @ManyToOne (fetch = FetchType.LAZY)
 private Turno turno;
 
    public HistorialTramite() {
    }

    public HistorialTramite(Date fecha, Date horaDeAtencion, Tramite tramite) {
        this.fecha = fecha;
        this.horaDeAtencion = horaDeAtencion;
        this.horaDeFinalizacion = null;
        this.tramite = tramite;
    }
    
    public HistorialTramite(Date fecha, Date horaDeAtencion, Tramite tramite, Turno turno) {
        this.fecha = fecha;
        this.horaDeAtencion = horaDeAtencion;
        this.horaDeFinalizacion = null;
        this.tramite = tramite;
        this.turno = turno;
    }
    
    
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHoraDeAtencion() {
        return horaDeAtencion;
    }

    public void setHoraDeAtencion(Date horaDeAtencion) {
        this.horaDeAtencion = horaDeAtencion;
    }

    public Date getHoraDeFinalizacion() {
        return horaDeFinalizacion;
    }

    public void setHoraDeFinalizacion(Date horaDeFinalizacion) {
        this.horaDeFinalizacion = horaDeFinalizacion;
    }

    public Tramite getTramite() {
        return tramite;
    }

    public void setTramite(Tramite tramite) {
        this.tramite = tramite;
    }

    public HistorialTramite(Date fecha) {
        this.fecha = fecha;
    }

    public int getId_historialTramite() {
        return id_historialTramite;
    }

    public void setId_historialTramite(int id_historialTramite) {
        this.id_historialTramite = id_historialTramite;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }
 







}
