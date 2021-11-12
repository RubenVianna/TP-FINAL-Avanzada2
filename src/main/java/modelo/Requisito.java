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
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Sirgius
 */
@Entity
@Table(name = "Requisito")
public class Requisito implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    private int id_requisito;
    @Basic
    private String nombreRequisito;
    //revisar esto porque no creo que sea necesario tener que crear un atributo tramite para que no tire error de mappeo
     // @OneToMany(mappedBy = "Requisito", fetch = FetchType.LAZY)
    @ManyToMany (mappedBy = "requisitos" , cascade=CascadeType.REMOVE)
    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "fk_tramite")
    private List<Tramite> tramites;
    
   
    
    
    public int getId() {
        return id_requisito;
    }

    public void setId(int id) {
        this.id_requisito = id;
    }
    
    

    public String getNombreRequisito() {
        return nombreRequisito;
    }

    public void setNombreRequisito(String nombreRequisito) {
        this.nombreRequisito = nombreRequisito;
    }

    public Requisito(String nombreRequisito) {
        this.nombreRequisito = nombreRequisito;
    }

    public Requisito() {
    }
    
    
    public void addTramite(Tramite tramite){
       if (tramites.isEmpty()){
           tramites= new ArrayList();
       }
            tramites.add(tramite);
       
       
    }
    
    public void quitarTramite(Tramite tramite){
        int cont=0;
        for (Tramite tra: this.tramites){
        
            if(tramite.getId_Tramite() == tra.getId_Tramite()){
            break;
            }
        cont++;
        }
        tramites.remove(cont);
        
    }
    

    
    
}
