/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
 
import controlador.exceptions.NonexistentEntityException;
import java.util.List;
import modelo.*;
import persistencia.Persistencia;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author julian
 */
public class ControladorPersistencia {

    private final EntityManagerFactory miFabricaDeEntidades;
    private final EntityManager miAdministradorDeEntidades;

    private Persistencia persistencia;

    public ControladorPersistencia() {
        miFabricaDeEntidades = Persistence.createEntityManagerFactory("unidadPersistencia1");
     
        miAdministradorDeEntidades = miFabricaDeEntidades.createEntityManager();
        //esta segunda linea no esta en el video
        instanciarEntidades();
    }

    private void instanciarEntidades() {
        persistencia = new Persistencia();
    }

    public void crearClientePersistencia(Cliente unCliente) {
        persistencia.persistirCliente(unCliente, miAdministradorDeEntidades);
    }

    public void actualizarClientePersistencia(Cliente unCliente) {
        persistencia.actualizarCliente(unCliente, miAdministradorDeEntidades);

    }

   // public void eliminarClientePersistencia(Cliente unCliente) {
//        persistencia.eliminarCliente(unCliente, miAdministradorDeEntidades);
//    }

    public void crearAreaPersistencia(Area unArea) {
        persistencia.persistirArea(unArea, miAdministradorDeEntidades);
    }

    public void actualizarAreaPersistencia(Area unArea)  {
        persistencia.actualizarArea(unArea, miAdministradorDeEntidades);
    }

    public void crearCondicionPrioritariaPersistencia(CondicionPrioritaria unaCondicionPrioritaria) {
        persistencia.persistirCondicionPrioritaria(unaCondicionPrioritaria, miAdministradorDeEntidades);
    }

    public void actualizarCondicionPrioritariaPersistencia(CondicionPrioritaria unaCondicionPrioritaria) {
        persistencia.actualizarCondicionPrioritaria(unaCondicionPrioritaria, miAdministradorDeEntidades);
    }

    public void crearEmpleadoPersistencia(Empleado unEmpleado) {
        persistencia.persistirEmpleado(unEmpleado, miAdministradorDeEntidades);
    }

    public void actualizarEmpleadoPersistencia(Empleado unEmpleado) {
        persistencia.actualizarEmpleado(unEmpleado, miAdministradorDeEntidades);
    }

    public void crearEstadoTurnoPersistencia(EstadoTurno unEstadoTurno) {
        persistencia.persistirEstadoTurno(unEstadoTurno, miAdministradorDeEntidades);
    }

    public void actualizarEstadoTurnoPersistencia(EstadoTurno unEstadoTurno) {
        persistencia.actualizarEstadoTurno(unEstadoTurno, miAdministradorDeEntidades);
    }

    public void crearHistorialTramitePersistencia(HistorialTramite unHistorialTramite) {
        persistencia.persistirHistorialTramite(unHistorialTramite, miAdministradorDeEntidades);
    }

    public void actualizarHistorialTramitePersistencia(HistorialTramite unHistorialTramite) {
        persistencia.actualizarHistorialTramite(unHistorialTramite, miAdministradorDeEntidades);
    }

    public void crearRequisitoPersistencia(Requisito unRequisito) {
        persistencia.persistirRequisito(unRequisito, miAdministradorDeEntidades);
    }

    public void actualizarRequisitoPersistencia(Requisito unRequisito) {
        persistencia.actualizarRequisito(unRequisito, miAdministradorDeEntidades);
    }

    public void crearTipoClientePersistencia(TipoCliente unTipoCliente) {
        persistencia.persistirTipoCliente(unTipoCliente, miAdministradorDeEntidades);
    }

    public void actualizarTipoClientePersistencia(TipoCliente unTipoCliente) {
        persistencia.actualizarTipoCliente(unTipoCliente, miAdministradorDeEntidades);
    }

    public void crearTramitePersistencia(Tramite unTramite) {
        persistencia.persistirTramite(unTramite, miAdministradorDeEntidades);
    }

    public void actualizarTramitePersistencia(Tramite unTramite) {
        persistencia.actualizarTramite(unTramite, miAdministradorDeEntidades);
    }

    public void crearTurnoPersistencia(Turno unTurno) {
        persistencia.persistirTurno(unTurno, miAdministradorDeEntidades);
    }

    public void actualizarTurnoPersistencia(Turno unTurno) {
        persistencia.actualizarTurno(unTurno, miAdministradorDeEntidades);
    }

    public void crearUsuarioWebPersistencia(UsuarioWeb unUsuarioWeb) {
        persistencia.persistirUsuarioWeb(unUsuarioWeb, miAdministradorDeEntidades);
    }

    public void actualizarUsuarioWebPersistencia(UsuarioWeb unUsuarioWeb) {
        persistencia.actualizarUsuarioWeb(unUsuarioWeb, miAdministradorDeEntidades);
    }
    
    public Cliente buscarClienteBDD (int DNI) {
	Cliente cli= null;
	//EntityManager em= tjc.getEntityManager();
	
            Query query = this.miAdministradorDeEntidades.createQuery("SELECT c FROM Cliente c WHERE c.dni= :dni");
            query.setParameter ("dni", DNI);
            List<Cliente> clientes = query.getResultList();
            if(!clientes.isEmpty()){
             cli = (Cliente) query.getSingleResult();
            }
                             
        
	return cli;
    }
     
   
    
  public Empleado buscarEmpleadoBDD (int id) {
	Empleado emp= null;
	//EntityManager em= tjc.getEntityManager();
	
            Query query = this.miAdministradorDeEntidades.createQuery("SELECT e FROM Empleado e WHERE e.id_empleado= :id");
            query.setParameter ("id", id);
            List<Empleado> empleados = query.getResultList();
            if(!empleados.isEmpty()){
             emp = (Empleado) query.getSingleResult();
            }
                             
        
	return emp;
    }
    
    public Area buscarAreaBDD (String nombre) {
	Area area= null;
	//EntityManager em= tjc.getEntityManager();
	
            Query query = this .miAdministradorDeEntidades.createQuery("SELECT a FROM Area a WHERE a.nombreArea= :nombre");
            query.setParameter ("nombre", nombre);
            List<Area> areas = query.getResultList();
            if(!areas.isEmpty()){
             area = (Area) query.getSingleResult();
            }
                             
        
	return area;
    }
    
     public Area buscarAreaBDD (int id) {
	Area are= null;
	//EntityManager em= tjc.getEntityManager();
	
            Query query = this.miAdministradorDeEntidades.createQuery("SELECT a FROM Area a WHERE a.id_area= :id");
            query.setParameter ("id", id);
            List<Area> areas = query.getResultList();
            if(!areas.isEmpty()){
             are = (Area) query.getSingleResult();
            }
                             
        
	return are;
    } 
     
     
public EstadoTurno buscarEstadoTurnoBDD (String nombre) {
	EstadoTurno et= null;
	//EntityManager em= tjc.getEntityManager();
	
            Query query = this .miAdministradorDeEntidades.createQuery("SELECT e FROM EstadoTurno e WHERE e.nombre= :nombre");
            query.setParameter ("nombre", nombre);
            List<EstadoTurno> estados = query.getResultList();
            if(!estados.isEmpty()){
             et = (EstadoTurno) query.getSingleResult();
            }
                             
        
	return et;
    }     

    public EstadoTurno buscarEstadoTurnoBDD (int id) {
	EstadoTurno et= null;
	//EntityManager em= tjc.getEntityManager();
	
            Query query = this.miAdministradorDeEntidades.createQuery("SELECT e FROM EstadoTurno e WHERE e.id_Estado= :id");
            query.setParameter ("id", id);
            List<EstadoTurno> estados = query.getResultList();
            if(!estados.isEmpty()){
             et = (EstadoTurno) query.getSingleResult();
            }
                             
        
	return et;
    }    
    
    public CondicionPrioritaria buscarCondicionPrioritariaBDD (int id) {
	CondicionPrioritaria cp= null;
	//EntityManager em= tjc.getEntityManager();
	
            Query query = this.miAdministradorDeEntidades.createQuery("SELECT c FROM CondicionPrioritaria c WHERE c.idCondicion= :id");
            query.setParameter ("id", id);
            List<CondicionPrioritaria> condiciones = query.getResultList();
            if(!condiciones.isEmpty()){
             cp = (CondicionPrioritaria) query.getSingleResult();
            }
                             
        
	return cp;
    }    
    
      public CondicionPrioritaria buscarCondicionPrioritariaBDD (String nombre) {
	CondicionPrioritaria cp= null;
	//EntityManager em= tjc.getEntityManager();
	
            Query query = this .miAdministradorDeEntidades.createQuery("SELECT c FROM CondicionPrioritaria c WHERE c.motivo= :nombre");
            query.setParameter ("nombre", nombre);
            List<CondicionPrioritaria> condiciones = query.getResultList();
            if(!condiciones.isEmpty()){
             cp = (CondicionPrioritaria) query.getSingleResult();
            }
                             
        
	return cp;
    }
    

     
    public Tramite buscarTramiteBDD (int id) {
	Tramite tra= null;
	//EntityManager em= tjc.getEntityManager();
	
            Query query = this.miAdministradorDeEntidades.createQuery("SELECT t FROM Tramite t WHERE t.id_Tramite= :id");
            query.setParameter ("id", id);
            List<Tramite> tramites = query.getResultList();
            if(!tramites.isEmpty()){
             tra = (Tramite) query.getSingleResult();
            }
                             
        
	return tra;
    }     
 
    public Tramite buscarTramiteBDD (String nombre) {
	Tramite tramite= null;
	//EntityManager em= tjc.getEntityManager();
	
            Query query = this .miAdministradorDeEntidades.createQuery("SELECT t FROM Tramite t WHERE t.nombreTramite= :nombre");
            query.setParameter ("nombre", nombre);
            List<Tramite> tramites = query.getResultList();
            if(!tramites.isEmpty()){
             tramite = (Tramite) query.getSingleResult();
            }
                             
        
	return tramite;
    }  
    
    
    public Turno buscarTurnoBDD (int id) {
	Turno turno= null;
	//EntityManager em= tjc.getEntityManager();
	
            Query query = this.miAdministradorDeEntidades.createQuery("SELECT t FROM Turno t WHERE t.id_turno= :id");
            query.setParameter ("id", id);
            List<Turno> turnos = query.getResultList();
            if(!turnos.isEmpty()){
             turno = (Turno) query.getSingleResult();
            }
                             
        
	return turno;
    }
    
    public TipoCliente buscarTipoClienteBDD (int id) {
	TipoCliente tp= null;
	//EntityManager em= tjc.getEntityManager();
	
            Query query = this.miAdministradorDeEntidades.createQuery("SELECT t FROM TipoCliente t WHERE t.idTipoCliente= :id");
            query.setParameter ("id", id);
            List<TipoCliente> tipos = query.getResultList();
            if(!tipos.isEmpty()){
             tp = (TipoCliente) query.getSingleResult();
            }
                             
        
	return tp;
    }   
    
   
    public Requisito buscarRequisitoBDD (int id) {
	Requisito req= null;
	//EntityManager em= tjc.getEntityManager();
	
            Query query = this.miAdministradorDeEntidades.createQuery("SELECT r FROM Requisito r WHERE r.id_requisito= :id");
            query.setParameter ("id", id);
            List<Requisito> requisitos = query.getResultList();
            if(!requisitos.isEmpty()){
             req = (Requisito) query.getSingleResult();
            }
                             
        
	return req;
    }  
    
     
    public TipoCliente buscarTipoCliente (String nombreTipo) {
	TipoCliente tc= null;
	//EntityManager em= tjc.getEntityManager();
	
            Query query = this.miAdministradorDeEntidades.createQuery("SELECT t FROM TipoCliente t WHERE t.nombre= :nombreTipo");
            query.setParameter ("nombreTipo", nombreTipo);
            List<TipoCliente> tipos = query.getResultList();
            if(!tipos.isEmpty()){
             tc = (TipoCliente) query.getSingleResult();
            }
                             
        
	return tc;
    }     
     
     
     
    public void eliminarClienteBDD (Cliente cli ) {
        persistencia.eliminarClienteBDD(cli, miAdministradorDeEntidades);
    }
    
    public void eliminarTramiteBDD (Tramite tra ) {
        persistencia.eliminarTramiteBDD(tra, miAdministradorDeEntidades);
    }    
    
    public void eliminarEmpleadoBDD (Empleado emp ) {
        persistencia.eliminarEmpleadoBDD(emp, miAdministradorDeEntidades);
    }
    
   
     public void eliminarRequisitoBDD (Requisito req ) {
        persistencia.eliminarRequisitoBDD(req, miAdministradorDeEntidades);
    }
    
     public void eliminarTipoClienteBDD (TipoCliente tp ) {
        persistencia.eliminarTipoClienteBDD(tp, miAdministradorDeEntidades);
    }
   
     public void eliminarEstadoTurnoBDD (EstadoTurno et ) {
        persistencia.eliminarEstadoTurnoBDD(et, miAdministradorDeEntidades);
    }
   
     public void eliminarCondicionPrioritariaBDD (CondicionPrioritaria cp ) {
        persistencia.eliminarCondicionPrioritariaBDD(cp, miAdministradorDeEntidades);
    }
    
    
      
    

    public List<Cliente> ListarClientes(){
        
        Query query = miAdministradorDeEntidades.createQuery("Select c FROM Cliente c ");
        
        List<Cliente> clientes= query.getResultList();
         
        
        return clientes;
    } 
    
    public List<Tramite> ListarTramites(){
        
        Query query = miAdministradorDeEntidades.createQuery("Select t FROM Tramite t ");
        
        List<Tramite> tramites= query.getResultList();
         
        
        return tramites;
    } 
    
    
      public List<EstadoTurno> ListarEstadosTurnos(){
        
        Query query = miAdministradorDeEntidades.createQuery("Select e FROM EstadoTurno e ");
        
        List<EstadoTurno> estados= query.getResultList();
         
        
        return estados;
    }  
    
   public List<CondicionPrioritaria> ListarCondicionesPrioritarias(){
        
        Query query = miAdministradorDeEntidades.createQuery("Select c FROM CondicionPrioritaria c ");
        
        List<CondicionPrioritaria> condiciones= query.getResultList();
         
        
        return condiciones;
    } 
   
   public List<TipoCliente> ListarTiposClientes(){
        
        Query query = miAdministradorDeEntidades.createQuery("Select t FROM TipoCliente t ");
        
        List<TipoCliente> tipos= query.getResultList();
         
        
        return tipos;
    } 
      
    
     public List<Requisito> ListarRequisitos(){
        
        Query query = miAdministradorDeEntidades.createQuery("Select r FROM Requisito r ");
        
        List<Requisito> requisitos= query.getResultList();
         
        
        return requisitos;
    } 
    
      public List<Requisito> ListarRequisitosTramite(int id){
        
        Query query = miAdministradorDeEntidades.createQuery("Select r FROM Requisito r JOIN r.tramites t WHERE  t.id_Tramite = :id ");
        query.setParameter ("id", id);
        
        List<Requisito> requisitos= query.getResultList();
         
        
        return requisitos;
    }  
     
      public List<Area> ListarAreas(){
       
        Query query = miAdministradorDeEntidades.createQuery("Select a FROM Area a ");
        
        List<Area> areas= query.getResultList();
         
        
        return areas;
    } 
      
       public List<Tramite> ListarTramitesArea(int id_area){
       
        Query query = miAdministradorDeEntidades.createQuery("Select t FROM Tramite t WHERE t.area.id_area = :id");
        
        query.setParameter ("id", id_area);
        List<Tramite> tramites= query.getResultList();
         
        
        return tramites;
    } 
       
       
      public List<Empleado> ListarEmpleadosArea(int id_area){
       
        Query query = miAdministradorDeEntidades.createQuery("Select e FROM Empleado e WHERE e.area.id_area = :id");
        
        query.setParameter ("id", id_area);
        List<Empleado> empleados= query.getResultList();
         
        
        return empleados;
    }        

 public List<Empleado> ListarEmpleados(){
       
        Query query = miAdministradorDeEntidades.createQuery("Select e FROM Empleado e ");
        List<Empleado> empleados= query.getResultList();       
        return empleados;
    }          
 
    public void eliminarAreaBDD(Area area) {
        persistencia.eliminarAreaBDD(area, miAdministradorDeEntidades);
    }

    public void  persistirRequisitoTramite (int id_requisito, int id_tramite){
        persistencia.persistirRequisitoTramite(id_requisito, id_tramite);
    }
    
    public boolean comprobarTramiteEnTurnos (int id_tramite){
        boolean ban=false;
        Query query = miAdministradorDeEntidades.createQuery("Select t FROM Turno t where t.tramite.id_Tramite= :id ");
        query.setParameter ("id", id_tramite);
        List<Turno> turnos = query.getResultList();
        if (!turnos.isEmpty()){
            //no puede borrar el tramite porque se registro en al menos algun turno
            ban=true;
        }
        return ban;
    }
    
    public boolean comprobarEstadoTurnoEnTurnos (int id_estado){
        boolean ban=false;
        Query query = miAdministradorDeEntidades.createQuery("Select t FROM Turno t where t.estadoTurno.id_Estado= :id ");
        query.setParameter ("id", id_estado);
        List<Turno> turnos = query.getResultList();
        if (!turnos.isEmpty()){
            //no puede borrar el tramite porque se registró en al menos algun turno
            ban=true;
        }
        return ban;
    }
    
    
        
    public boolean comprobarCondicionPrioritariaEnTurnos (int id_condicion){
        boolean ban=false;
        Query query = miAdministradorDeEntidades.createQuery("Select t FROM Turno t where t.condicionPrioritaria.idCondicion= :id ");
        query.setParameter ("id", id_condicion);
        List<Turno> turnos = query.getResultList();
        if (!turnos.isEmpty()){
            //no puede borrar el tramite porque se registró en al menos algun turno
            ban=true;
        }
        return ban;
    }
    
        public boolean comprobarClienteEnTurnos (int dni){
        boolean ban=false;
        Query query = miAdministradorDeEntidades.createQuery("Select t FROM Turno t where t.cliente.dni= :id ");
        query.setParameter ("id", dni);
        List<Turno> turnos = query.getResultList();
        if (!turnos.isEmpty()){
            //no puede borrar el tramite porque se registró en al menos algun turno
            ban=true;
        }
        return ban;
    }
    
}
    

