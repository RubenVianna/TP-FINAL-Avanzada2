/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Sirgius
 */
@Entity
@Table(name = "Area")
public class Area implements Serializable {
 @Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)
  private int id_area;
 @Column(name = "NombreArea") 
 String nombreArea;

    
 @OneToMany(mappedBy = "area", cascade = CascadeType.ALL)
 private List<Turno> turnos = new LinkedList<>();
 @OneToMany(mappedBy = "area", cascade = CascadeType.ALL) 
 private List<Turno> turnosPriori = new LinkedList<>();
 @OneToMany(mappedBy = "area", cascade = CascadeType.ALL) 
 private List<Tramite> Tramites = new ArrayList(); 
 @OneToMany(mappedBy = "area", cascade = CascadeType.ALL) 
 private List<Empleado> Empleados = new ArrayList();

    public Area() {
    }

    public Area(String nombreArea) {
        this.nombreArea = nombreArea;
    }
 
  //agrega un turno sin prioridad a la cola de turnos
  public void addTurno(Turno t){
      this.turnos.add(t);
  }
   public void addTurnoPrioritario(Turno t){
      this.turnosPriori.add(t);
  }

    public int getId_area() {
        return id_area;
    }

    public void setId_area(int id_area) {
        this.id_area = id_area;
    }
  
  
  
    
public List<Turno> getTurnosPriori() {
        return turnosPriori;
    }

    public void setTurnosPriori(List<Turno> turnosPriori) {
        this.turnosPriori = turnosPriori;
    }
    

    public String getNombreArea() {
        return nombreArea;
    }

    public void setNombreArea(String nombreArea) {
        this.nombreArea = nombreArea;
    }

    public List<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(List<Turno> turnos) {
        this.turnos = turnos;
    }

    public List<Tramite> getTramites() {
        return Tramites;
    }

    public void setTramites(List<Tramite> Tramites) {
        this.Tramites = Tramites;
    }

    public List<Empleado> getEmpleados() {
        return Empleados;
    }

    public void setEmpleados(List<Empleado> Empleados) {
        this.Empleados = Empleados;
    }
   
    public void addEmpleado (Empleado empleados){
        this.Empleados.add(empleados);
    }
            
    public void addTramite (Tramite tramite){
        this.Tramites.add(tramite);
    }
    
     public void quitarTramite(Tramite tra){
        int cont=0;
        for (Tramite t: this.Tramites){
        
            if(tra.getId_Tramite() == t.getId_Tramite()){
            break;
            }
        cont++;
        }
        this.Tramites.remove(cont);
        
    }
     
    public void quitarEmpleado(Empleado emp){
        int cont=0;
        for (Empleado e: this.Empleados){
        
            if(emp.getId_empleado() == e.getId_empleado()){
            break;
            }
        cont++;
        }
        this.Empleados.remove(cont);
        
    } 
  
}
