package controlador;

import controlador.exceptions.NonexistentEntityException;
import java.util.*;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import modelo.*;
import vista.MenuPrincipal;

/**
 *
 * @author julian
 */
public class Controlador {

    private MenuPrincipal menu;

    private ControladorPersistencia miControladorPersistencia;

    public Controlador(MenuPrincipal menu, ControladorPersistencia miControladorPersistencia) {
        this.menu = menu;
        this.miControladorPersistencia = miControladorPersistencia;
    }

    public Controlador() {
        miControladorPersistencia = new ControladorPersistencia();
    }

    //--------------PERSISTENCIA---------------------
    /**
     * Esta funcion se encarga de pedir al Controlador de la Persistencia que
     * persista un nuevo cliente instanciado.
     *
     * @param unCliente
     */
    public void persistirCliente(Cliente unCliente) {
        miControladorPersistencia.crearClientePersistencia(unCliente);
    }

    public void actualizarCliente(Cliente unCliente) {
        miControladorPersistencia.actualizarClientePersistencia(unCliente);
    }

//     public void removerCliente(Cliente unCliente){
//        miControladorPersistencia.eliminarClientePersistencia(unCliente);
//    }
    public void persistirArea(Area unArea) {
        miControladorPersistencia.crearAreaPersistencia(unArea);
    }

    public void actualizarArea(Area unArea) {
        miControladorPersistencia.actualizarAreaPersistencia(unArea);
    }

    public void persistirCondicionPrioritaria(CondicionPrioritaria unaCondicionPrioritaria) {
        miControladorPersistencia.crearCondicionPrioritariaPersistencia(unaCondicionPrioritaria);
    }

    public void actualizarCondicionPrioritaria(CondicionPrioritaria unaCondicionPrioritaria) {
        miControladorPersistencia.actualizarCondicionPrioritariaPersistencia(unaCondicionPrioritaria);
    }

    public void persistirEmpleado(Empleado unEmpleado) {
        miControladorPersistencia.crearEmpleadoPersistencia(unEmpleado);
    }

    public void actualizarEmpleado(Empleado unEmpleado) {
        miControladorPersistencia.actualizarEmpleadoPersistencia(unEmpleado);
    }

    public void persistirEstadoTurno(EstadoTurno unEstadoTurno) {
        miControladorPersistencia.crearEstadoTurnoPersistencia(unEstadoTurno);
    }

    public void actualizarEstadoTurno(EstadoTurno unEstadoTurno) {
        miControladorPersistencia.actualizarEstadoTurnoPersistencia(unEstadoTurno);
    }

    public void persistirHistorialTramite(HistorialTramite unHistorialTramite) {
        miControladorPersistencia.crearHistorialTramitePersistencia(unHistorialTramite);
    }

    public void actualizarHistorialTramite(HistorialTramite unHistorialTramite) {
        miControladorPersistencia.actualizarHistorialTramitePersistencia(unHistorialTramite);
    }

    public void persistirRequisito(Requisito unRequisito) {
        miControladorPersistencia.crearRequisitoPersistencia(unRequisito);
    }

    public void actualizarRequisito(Requisito unRequisito) {
        miControladorPersistencia.actualizarRequisitoPersistencia(unRequisito);
    }

    public void persistirTipoCliente(TipoCliente unTipoCliente) {
        miControladorPersistencia.crearTipoClientePersistencia(unTipoCliente);
    }

    public void actualizarTipoCliente(TipoCliente unTipoCliente) {
        miControladorPersistencia.actualizarTipoClientePersistencia(unTipoCliente);
    }

    public void persistirTramite(Tramite unTramite) {
        miControladorPersistencia.crearTramitePersistencia(unTramite);
    }

    public void persistirRequisitoTramite(int id_requisito, int id_tramite) {
        /*
		Agrega en la bdd la relacion entre el tramite elegido y el requisito que se le quiere agregar
         */
        miControladorPersistencia.persistirRequisitoTramite(id_requisito, id_tramite);
    }

    public void actualizarTramite(Tramite unTramite) {
        miControladorPersistencia.actualizarTramitePersistencia(unTramite);
    }

    public void persistirTurno(Turno unTurno) {
        miControladorPersistencia.crearTurnoPersistencia(unTurno);
    }

    public void actualizarTurno(Turno unTurno) {
        miControladorPersistencia.actualizarTurnoPersistencia(unTurno);
    }

    public void persistirUsuarioWeb(UsuarioWeb unUsuarioWeb) {
        miControladorPersistencia.crearUsuarioWebPersistencia(unUsuarioWeb);
    }

    public void actualizarUsuarioWeb(UsuarioWeb unUsuarioWeb) {
        miControladorPersistencia.actualizarUsuarioWebPersistencia(unUsuarioWeb);
    }

    public Cliente buscarClienteBDD(int DNI) {
        /*
		 * Busca si ya existe registrado un cliente con ese id
                 * Si existe retorna la instancia del cliente con ese id.
                 * Caso contrario retorma null; 
         */

        Cliente cli = null;
        cli = this.miControladorPersistencia.buscarClienteBDD(DNI);
        return cli;
    }

    public Empleado buscarEmpleado(int id) {
        /*
		 * Busca si ya existe registrado un empleado con ese id
                 * Si existe retorna la instancia del area.
                 * Caso contrario retorma null; 
         */
        Empleado emp = null;
        emp = this.miControladorPersistencia.buscarEmpleadoBDD(id);
        return emp;

    }

    public Turno buscarTurno(int id) {
        /*
		 * Busca si ya existe registrado un turno con ese id
                 * Si existe retorna la instancia del turno.
                 * Caso contrario retorma null; 
         */
        Turno turno = null;
        turno = this.miControladorPersistencia.buscarTurnoBDD(id);
        return turno;

    }

    public TipoCliente buscarTipoCliente(int id) {
        /*
		 * Busca si ya existe registrado un TipoCliente con ese id
                 * Si existe retorna la instancia del TipoCliente.
                 * Caso contrario retorma null; 
         */
        TipoCliente tp = null;
        tp = this.miControladorPersistencia.buscarTipoClienteBDD(id);
        return tp;

    }

    public EstadoTurno buscarEstadoTurno(String nombre) {
        /*
		 * Busca si ya existe registrado un EstadoTurno con ese nombre
                 * Si existe retorna la instancia del EstadoTurno.
                 * Caso contrario retorma null; 
         */
        EstadoTurno et = this.miControladorPersistencia.buscarEstadoTurnoBDD(nombre);
        return et;

    }

    public EstadoTurno buscarEstadoTurno(int id) {
        /*
		 * Busca si ya existe registrado un EstadoTurno con ese id
                 * Si existe retorna la instancia del EstadoTurno.
                 * Caso contrario retorma null; 
         */
        EstadoTurno et = this.miControladorPersistencia.buscarEstadoTurnoBDD(id);
        return et;

    }

    public CondicionPrioritaria buscarCondicionPrioritaria(int id) {
        /*
		 * Busca si ya existe registrado un CondicionPrioritaria con ese id
                 * Si existe retorna la instancia del CondicionPrioritaria.
                 * Caso contrario retorma null; 
         */
        CondicionPrioritaria cp = this.miControladorPersistencia.buscarCondicionPrioritariaBDD(id);
        return cp;

    }

    public CondicionPrioritaria buscarCondicionPrioritaria(String nombreCondicion) {
        /*
		 * Busca si ya existe registrado una CondicionPrioritaria con ese nombre
                 * Si existe retorna la instancia del CondicionPrioritaria.
                 * Caso contrario retorma null; 
         */
        CondicionPrioritaria condicion = null;
        condicion = this.miControladorPersistencia.buscarCondicionPrioritariaBDD(nombreCondicion);
        return condicion;

    }

    public Area buscarArea(String nombreArea) {
        /*
		 * Busca si ya existe registrado un area con ese nombre
                 * Si existe retorna la instancia del area.
                 * Caso contrario retorma null; 
         */
        Area area = null;
        area = this.miControladorPersistencia.buscarAreaBDD(nombreArea);
        return area;

    }

    public Area buscarArea(int id_area) {
        /*
		 * Busca si ya existe registrado un area con ese id
                 * Si existe retorna la instancia del area.
                 * Caso contrario retorma null; 
         */
        Area area = null;
        area = this.miControladorPersistencia.buscarAreaBDD(id_area);
        return area;

    }

    public Tramite buscarTramite(int id) {
        /*
		 * Busca si ya existe registrado un tramite con ese id
                 * Si existe retorna la instancia del tramite.
                 * Caso contrario retorma null; 
         */
        Tramite tra = null;
        tra = this.miControladorPersistencia.buscarTramiteBDD(id);
        return tra;

    }

    public Tramite buscarTramite(String nombreTramite) {
        /*
		 * Busca si ya existe registrado un tramite con ese nombre
                 * Si existe retorna la instancia del tramite.
                 * Caso contrario retorma null; 
         */
        Tramite tra = null;
        tra = this.miControladorPersistencia.buscarTramiteBDD(nombreTramite);
        return tra;

    }

    public Requisito buscarRequisito(int id) {
        /*
		 * Busca si ya existe registrado un requisito con ese id
                 * Si existe retorna la instancia del requisito.
                 * Caso contrario retorma null; 
         */
        Requisito req = this.miControladorPersistencia.buscarRequisitoBDD(id);
        return req;

    }

    public TipoCliente buscarTipoCliente(String nombreTipo) {
        /*
		 * Busca si ya existe registrado un TipoCliente con ese nombre
                 * Si existe retorna la instancia del TipoCliente.
                 * Caso contrario retorma null; 
         */
        TipoCliente tc = this.miControladorPersistencia.buscarTipoCliente(nombreTipo);
        return tc;

    }

    public MenuPrincipal getMenu() {
        return menu;
    }

    public void setMenu(MenuPrincipal menu) {
        this.menu = menu;
    }

    public void eliminarCliente(Cliente cli) {

        this.miControladorPersistencia.eliminarClienteBDD(cli);

    }

    public void eliminarTramite(Tramite tra) {

        this.miControladorPersistencia.eliminarTramiteBDD(tra);

    }

    public void eliminarEmpleado(Empleado emp) {

        this.miControladorPersistencia.eliminarEmpleadoBDD(emp);

    }

    public List<Cliente> ListarClientes() {
        List<Cliente> clientes = this.miControladorPersistencia.ListarClientes();
        return clientes;
    }

    public List<Tramite> ListarTramites() {
        /*
            * Retorna una lista con todos los tramites registrados en el sistema
         */
        List<Tramite> tramites = this.miControladorPersistencia.ListarTramites();
        return tramites;
    }

    public List<Requisito> ListarRequisitos() {
        List<Requisito> requisitos = this.miControladorPersistencia.ListarRequisitos();
        return requisitos;
    }

    public List<Requisito> ListarRequisitosTramite(int id) {
        List<Requisito> requisitos = this.miControladorPersistencia.ListarRequisitosTramite(id);
        return requisitos;
    }

    public List<Area> ListarAreas() {
        List<Area> areas = this.miControladorPersistencia.ListarAreas();
        return areas;
    }

    public List<Tramite> ListarTramitesArea(int id_area) {
        /*
            * Retorna una lista con todos los tramites registrados para esa unica area en el sistema
         */
        List<Tramite> tramites = this.miControladorPersistencia.ListarTramitesArea(id_area);
        return tramites;
    }

    public List<Empleado> ListarEmpleadosArea(int id_area) {
        /*
            * Retorna una lista con todos los empleados registrados para esa unica area en el sistema
         */
        List<Empleado> empleados = this.miControladorPersistencia.ListarEmpleadosArea(id_area);
        return empleados;
    }

    public List<Empleado> ListarEmpleados() {
        /*
            * Retorna una lista con todos los empleados registrados  en el sistema
         */
        List<Empleado> empleados = this.miControladorPersistencia.ListarEmpleados();
        return empleados;
    }

    public List<TipoCliente> ListarTiposClientes() {
        /*
            * Retorna una lista con todos los tiposClientes registrados  en el sistema
         */
        List<TipoCliente> tipos = this.miControladorPersistencia.ListarTiposClientes();
        return tipos;
    }

    public List<EstadoTurno> ListarEstadosTurnos() {
        /*
            * Retorna una lista con todos los EstadosTurnos registrados  en el sistema
         */
        List<EstadoTurno> estados = this.miControladorPersistencia.ListarEstadosTurnos();
        return estados;
    }

    public List<CondicionPrioritaria> ListarCondicionesPrioritarias() {
        /*
            * Retorna una lista con todos las condiciones prioritarias registrados  en el sistema
         */
        List<CondicionPrioritaria> condiciones = this.miControladorPersistencia.ListarCondicionesPrioritarias();
        return condiciones;
    }

    public void eliminarArea(Area area) {
        this.miControladorPersistencia.eliminarAreaBDD(area);
    }

    public void eliminarTipoCliente(TipoCliente tp) {
        this.miControladorPersistencia.eliminarTipoClienteBDD(tp);
    }

    public void eliminarEstadoTurno(EstadoTurno et) {
        this.miControladorPersistencia.eliminarEstadoTurnoBDD(et);
    }

    public void eliminarCondicionPrioritaria(CondicionPrioritaria cp) {
        this.miControladorPersistencia.eliminarCondicionPrioritariaBDD(cp);
    }

    public void eliminarRequisito(Requisito req) {
        this.miControladorPersistencia.eliminarRequisitoBDD(req);
    }

    public void quitarRequisitoALosTramites(Requisito req) {
        int ban = 0;
        List<Tramite> tramites = this.ListarTramites();
        for (int i = 0; i < tramites.size(); i++) {
            ban = tramites.get(i).comprobarRequisito(req);
            if (ban == 1) {
                tramites.get(i).quitarRequisito(req);
                this.actualizarTramite(tramites.get(i));
            }
        }
    }

    public void quitarTipoClienteALosClientes(TipoCliente tipoCli) {
        int ban = 0;
        List<Cliente> clientes = this.ListarClientes();
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getTipoCli() == tipoCli) {
                clientes.get(i).setTipoCli(null);
                this.actualizarCliente(clientes.get(i));
            }

        }

    }

    public boolean comprobarTramiteEnTurnos(int id_tramite) {
        // si retorna true entonces no se puede borrar porque se cargo el tramite en al menos un turno
        boolean ban;
        ban = this.miControladorPersistencia.comprobarTramiteEnTurnos(id_tramite);
        return ban;
    }

    public boolean comprobarEstadoTurnoEnTurnos(int id_estado) {
        // si retorna true entonces no se puede borrar porque se cargo el estado en al menos un turno
        boolean ban;
        ban = this.miControladorPersistencia.comprobarEstadoTurnoEnTurnos(id_estado);
        return ban;
    }

    public boolean comprobarCondicionPrioritariaEnTurnos(int id_condicion) {
        // si retorna true entonces no se puede borrar porque se cargo la condicion prioritaria en al menos un turno
        boolean ban;
        ban = this.miControladorPersistencia.comprobarCondicionPrioritariaEnTurnos(id_condicion);
        return ban;
    }

    public boolean comprobarClienteEnTurnos(int dni) {
        // si retorna true entonces no se puede borrar porque se cargo al cliente en al menos un turno
        boolean ban;
        ban = this.miControladorPersistencia.comprobarClienteEnTurnos(dni);
        return ban;
    }

    public Integer CrearTurnoPrio(String nombreTramite, String bandera, Cliente clienteTemp) {
        Tramite tra = this.buscarTramite(nombreTramite);

        Calendar h = Calendar.getInstance();
        Date hora = h.getTime();
        //asigno a et la instancia de EstadoTurno donde el nombre del estado coincida con "en espera"
        EstadoTurno et = this.buscarEstadoTurno("en espera");
        Area areaTemp = tra.getArea();

        HistorialTramite ht = null;

        //significa que selecciono una condicion prioritaria para el turno que se va a crear
        //asigno a una variable string el valor elegido en el combobox de condiciones prioritarias
        String nombreCondicion = bandera;

        //asigno a cp la instancia de CondicionPrioritaria donde el motivo sea igual a nombreCondicion
        CondicionPrioritaria cp = this.buscarCondicionPrioritaria(nombreCondicion);

        Turno turnoPrioritario = new Turno(hora, cp, clienteTemp, tra, et);

        turnoPrioritario.setArea(tra.getArea());

        //creo una instancia de HistorialTramite con los datos del turno prioritario, la fecha, la hora de registro y el tramite elegido
        turnoPrioritario.crearHistorialTramite(hora, hora, tra, turnoPrioritario);
        //agregamos el turno que acabamos de crear a la cola de turnos con prioridad de esa area

        areaTemp.addTurnoPrioritario(turnoPrioritario);
        ht = turnoPrioritario.buscarHistorialTramite(hora, hora, tra);

        this.persistirHistorialTramite(ht);
        this.persistirTurno(turnoPrioritario);

        int numeroturnera = turnoPrioritario.getId_turno();

        return numeroturnera;
    }

    public Integer CrearTurno(String nombreTramite, Cliente clienteTemp) {
        Tramite tra = this.buscarTramite(nombreTramite);

        Calendar h = Calendar.getInstance();
        Date hora = h.getTime();
        //asigno a et la instancia de EstadoTurno donde el nombre del estado coincida con "en espera"
        EstadoTurno et = this.buscarEstadoTurno("en espera");
        Area areaTemp = tra.getArea();

        HistorialTramite ht = null;

        //creo un turno sin prioridad 
        Turno turno = new Turno(hora, clienteTemp, tra, et);
        turno.setArea(tra.getArea());
        //creo una instancia de HistorialTramite con los datos del turno, la fecha, la hora de registro y el tramite elegido
        turno.crearHistorialTramite(hora, hora, tra, turno);
        //agrego el turno creado a la cola de espera de turnos sin prioridad del area del tramite elegido

        areaTemp.addTurno(turno);
        ht = turno.buscarHistorialTramite(hora, hora, tra);
        this.persistirHistorialTramite(ht);
        this.persistirTurno(turno);

        int numeroturnera = turno.getId_turno();

        return numeroturnera;

    }

    public void CancelarTurno(Integer numero){
             EstadoTurno et = this.buscarEstadoTurno(5);
            Turno turno = this.buscarTurno(numero);
            turno.setEstadoTurno(et);
            this.actualizarTurno(turno);
    
    }
    
    public void CrearUsuarioWeb(String usu, String pas, Cliente cli){
                    UsuarioWeb user = new UsuarioWeb(usu, pas, cli);
                    cli.setUsuario(user);
                    this.actualizarCliente(cli);
    }
    
    public void ModificarUsuarioWeb(Cliente cli, String usu, String pas){
             UsuarioWeb usuw = cli.getUsuario();
            
            usuw.setUsuario(usu);
            usuw.setContraseña(pas);
            
            this.actualizarUsuarioWeb(usuw);
    }

}
