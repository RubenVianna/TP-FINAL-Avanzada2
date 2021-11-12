/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import controlador.exceptions.NonexistentEntityException;
import java.util.HashSet;
import javax.persistence.EntityManager;
import modelo.Cliente;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import modelo.*;

/**
 *
 * @author julian
 */
public class Persistencia {
    
/**
     * Esta funcion se encarga de persistir un objeto cliente.
     * @param unCliente
     * @param miAdministradorEntidad 
     */
    public void persistirCliente(Cliente unCliente, EntityManager miAdministradorEntidad){
        miAdministradorEntidad.getTransaction().begin();
        miAdministradorEntidad.persist(unCliente);
        miAdministradorEntidad.getTransaction().commit();
    }
    
     public void actualizarCliente (Cliente cli, EntityManager em)  {
	
		em.getTransaction().begin();
		cli = em.merge(cli);
		em.getTransaction().commit();
	
    }
     
    
     
     
     //ABM Turnos
      public void persistirTurno(Turno unTurno, EntityManager miAdministradorEntidad){
        miAdministradorEntidad.getTransaction().begin();
        miAdministradorEntidad.persist(unTurno);
        miAdministradorEntidad.getTransaction().commit();
    }
    
     public void actualizarTurno(Turno unTurno, EntityManager miAdministradorEntidad){
        miAdministradorEntidad.getTransaction().begin();
        Turno tur = miAdministradorEntidad.find( Turno.class , unTurno.getId_turno());
        tur = unTurno;
        miAdministradorEntidad.persist(tur);
        miAdministradorEntidad.getTransaction().commit();
    }
     
     //ABM Tramite
      public void persistirTramite(Tramite unTramite, EntityManager miAdministradorEntidad){
        miAdministradorEntidad.getTransaction().begin();
        miAdministradorEntidad.persist(unTramite);
        miAdministradorEntidad.getTransaction().commit();
    }
    
     public void actualizarTramite(Tramite unTramite, EntityManager miAdministradorEntidad){
        miAdministradorEntidad.getTransaction().begin();
        Tramite tra = miAdministradorEntidad.find( Tramite.class , unTramite.getId_Tramite());
        tra = unTramite;
        miAdministradorEntidad.persist(tra);
        miAdministradorEntidad.getTransaction().commit();
    }
     
     
      //ABM Area
      public void persistirArea(Area unArea, EntityManager miAdministradorEntidad){
        miAdministradorEntidad.getTransaction().begin();
        miAdministradorEntidad.persist(unArea);
        miAdministradorEntidad.getTransaction().commit();
    }
    
     public void actualizarArea(Area unArea, EntityManager em) {
//     
//        
                em.getTransaction().begin();
		Area area = em.merge(unArea);
		em.getTransaction().commit();
        
        
    }
     
           //ABM CondicionPrioritaria
      public void persistirCondicionPrioritaria(CondicionPrioritaria uncp, EntityManager miAdministradorEntidad){
        miAdministradorEntidad.getTransaction().begin();
        miAdministradorEntidad.persist(uncp);
        miAdministradorEntidad.getTransaction().commit();
    }
    
     public void actualizarCondicionPrioritaria(CondicionPrioritaria uncp, EntityManager miAdministradorEntidad){
        miAdministradorEntidad.getTransaction().begin();
        CondicionPrioritaria cp = miAdministradorEntidad.find( CondicionPrioritaria.class , uncp.getIdCondicion());
        cp = uncp;
        miAdministradorEntidad.persist(cp);
        miAdministradorEntidad.getTransaction().commit();
    }
     
      //ABM Empleado
      public void persistirEmpleado(Empleado unEmp, EntityManager miAdministradorEntidad){
        miAdministradorEntidad.getTransaction().begin();
        miAdministradorEntidad.persist(unEmp);
        miAdministradorEntidad.getTransaction().commit();
    }
    
     public void actualizarEmpleado(Empleado unEmp, EntityManager miAdministradorEntidad){
        miAdministradorEntidad.getTransaction().begin();
        Empleado em = miAdministradorEntidad.find( Empleado.class , unEmp);
        em = unEmp;
        miAdministradorEntidad.persist(em);
        miAdministradorEntidad.getTransaction().commit();
    }
     
     
      //ABM EstadoTurno
      public void persistirEstadoTurno(EstadoTurno et, EntityManager miAdministradorEntidad){
        miAdministradorEntidad.getTransaction().begin();
        miAdministradorEntidad.persist(et);
        miAdministradorEntidad.getTransaction().commit();
    }
    
     public void actualizarEstadoTurno(EstadoTurno et, EntityManager miAdministradorEntidad){
        miAdministradorEntidad.getTransaction().begin();
        EstadoTurno aux = miAdministradorEntidad.find( EstadoTurno.class , et.getId_Estado());
        aux = et;
        miAdministradorEntidad.persist(aux);
        miAdministradorEntidad.getTransaction().commit();
    }
     
        //ABM HistorialTramite
      public void persistirHistorialTramite(HistorialTramite ht, EntityManager miAdministradorEntidad){
        miAdministradorEntidad.getTransaction().begin();
        miAdministradorEntidad.persist(ht);
        miAdministradorEntidad.getTransaction().commit();
    }
    
     public void actualizarHistorialTramite(HistorialTramite ht, EntityManager miAdministradorEntidad){
        miAdministradorEntidad.getTransaction().begin();
        HistorialTramite aux = miAdministradorEntidad.find( HistorialTramite.class , ht);
        aux = ht;
        miAdministradorEntidad.persist(aux);
        miAdministradorEntidad.getTransaction().commit();
    }
     
        //ABM Requisito
      public void persistirRequisito(Requisito req, EntityManager miAdministradorEntidad){
        miAdministradorEntidad.getTransaction().begin();
        miAdministradorEntidad.persist(req);
        miAdministradorEntidad.getTransaction().commit();
    }     
      
    
     public void actualizarRequisito(Requisito req, EntityManager miAdministradorEntidad){
        miAdministradorEntidad.getTransaction().begin();
        Requisito aux = miAdministradorEntidad.find( Requisito.class , req.getId());
        aux = req;
        miAdministradorEntidad.persist(aux);
        miAdministradorEntidad.getTransaction().commit();
    }
     
    public void  persistirRequisitoTramite (int id_requisito, int id_tramite){
        
    }
     
     
      //ABM TipoCliente
      public void persistirTipoCliente(TipoCliente tp, EntityManager miAdministradorEntidad){
        miAdministradorEntidad.getTransaction().begin();
        miAdministradorEntidad.persist(tp);
        miAdministradorEntidad.getTransaction().commit();
    }
    
     public void actualizarTipoCliente(TipoCliente tp, EntityManager miAdministradorEntidad){
        miAdministradorEntidad.getTransaction().begin();
        TipoCliente aux = miAdministradorEntidad.find(TipoCliente.class , tp.getIdTipoCliente());
        aux = tp;
        miAdministradorEntidad.persist(aux);
        miAdministradorEntidad.getTransaction().commit();
    }
     
      //ABM UsuarioWeb
      public void persistirUsuarioWeb(UsuarioWeb uw, EntityManager miAdministradorEntidad){
        miAdministradorEntidad.getTransaction().begin();
        miAdministradorEntidad.persist(uw);
        miAdministradorEntidad.getTransaction().commit();
    }
    
     public void actualizarUsuarioWeb(UsuarioWeb uw, EntityManager miAdministradorEntidad){
        miAdministradorEntidad.getTransaction().begin();
        UsuarioWeb aux = miAdministradorEntidad.find(UsuarioWeb.class , uw.getId());
        aux = uw;
        miAdministradorEntidad.persist(aux);
        miAdministradorEntidad.getTransaction().commit();
    }
     
   public void eliminarClienteBDD (Cliente client, EntityManager em) {
               
                em.getTransaction().begin();
		Cliente cli;
		cli = em.getReference(Cliente.class, client);
		cli.getId_cliente();			
		em.remove(cli);
		em.getTransaction().commit();
	
    }
   
    public void eliminarTramiteBDD (Tramite tra, EntityManager em) {
                    
                    em.getTransaction().begin();
                    Tramite t;
                    t = em.getReference(Tramite.class, tra.getId_Tramite());
                    t.getId_Tramite();
                    em.remove(t);
                    em.getTransaction().commit(); 
                  
                   
               
	
    }
   
    public void eliminarEmpleadoBDD (Empleado emp, EntityManager em) {
               
                em.getTransaction().begin();
		Empleado empleado;
		empleado = em.getReference(Empleado.class, emp);
		em.remove(empleado);
               
                
		em.getTransaction().commit();
	
    }

    public void eliminarAreaBDD(Area area, EntityManager em) {
                em.getTransaction().begin();
		Area are;
		are = em.getReference(Area.class, area.getId_area());
                are.getId_area();
		em.remove(are);
		em.getTransaction().commit();
    }
    
   public void eliminarRequisitoBDD (Requisito req, EntityManager em) {
               
                em.getTransaction().begin();
		Requisito requisito;
		requisito = em.getReference(Requisito.class, req.getId());
		em.remove(requisito);
		em.getTransaction().commit();
	
    }
  
   public void eliminarTipoClienteBDD (TipoCliente tc, EntityManager em) {
               
                em.getTransaction().begin();
		TipoCliente t;
		t = em.getReference(TipoCliente.class, tc.getIdTipoCliente());
		
		em.remove(t);
		em.getTransaction().commit();
	
    }
   
   public void eliminarEstadoTurnoBDD (EstadoTurno et, EntityManager em) {
               
                em.getTransaction().begin();
		EstadoTurno e;
		e = em.getReference(EstadoTurno.class, et.getId_Estado());
		
		em.remove(e);
		em.getTransaction().commit();
	
    }
   
   public void eliminarCondicionPrioritariaBDD (CondicionPrioritaria cp, EntityManager em) {
               
                em.getTransaction().begin();
		CondicionPrioritaria condicion;
		condicion = em.getReference(CondicionPrioritaria.class, cp.getIdCondicion());
		
		em.remove(condicion);
		em.getTransaction().commit();
	
    }
   
   
       

}