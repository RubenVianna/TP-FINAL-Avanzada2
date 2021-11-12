/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Sirgius
 */
@Entity
public class Tramite implements Serializable {
 @Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)
 private int id_Tramite;
 @Basic
 private String nombreTramite;
 
//  @JoinTable(
//        name = "requisito_tramite",
//        joinColumns = @JoinColumn(name = "ID_Tramite", nullable = false),
//        inverseJoinColumns = @JoinColumn(name="ID_Requisito", nullable = false)
//    )
 @ManyToMany (cascade=CascadeType.REMOVE)
 private List<Requisito> requisitos;


 @ManyToOne (fetch = FetchType.LAZY)
 private Area area;

    public Tramite() {
    }

    public Tramite(String nombreTramite, Area area) {
        this.nombreTramite = nombreTramite;
        this.requisitos= new ArrayList();
        this.area = area;
    }
    
    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }
 
    public Tramite( String nombreTramite) {
       
        this.nombreTramite = nombreTramite;
    }

    public int getId_Tramite() {
        return id_Tramite;
    }

    public void setId_Tramite(int id_Tramite) {
        this.id_Tramite = id_Tramite;
    }

    public List<Requisito> getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(List<Requisito> requisitos) {
        this.requisitos = requisitos;
    }

    public String getNombreTramite() {
        return nombreTramite;
    }

    public void setNombreTramite(String nombreTramite) {
        this.nombreTramite = nombreTramite;
    }
    public void addRequisito(Requisito requisito){
       if (requisitos.isEmpty()){
           requisitos= new ArrayList();
       }
            requisitos.add(requisito);
       
       
    }
    
    public void quitarRequisito(Requisito requisito){
        int cont=0;
        for (Requisito req: this.requisitos){
        
            if(requisito.getId() == req.getId()){
            break;
            }
        cont++;
        }
        requisitos.remove(cont);
        
    }
 
    public int comprobarRequisito(Requisito req){
        /*
		 * Busca si ya existe registrado el requisito para el tramite
                 * Si existe retorna 1
                 * Caso contrario retorna 0; 
		 */
		int ban = 0;

		for (Requisito re: this.requisitos) {
			if (req.getId() == re.getId() ) {
				/*
				 * Significa que se encontró el area.
				 */
				ban = 1;
				break;
			}
		}

		return ban;
    }
    
}
