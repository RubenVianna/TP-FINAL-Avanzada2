/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import controlador.Controlador;
import vista.MenuPrincipal;
import modelo.*;


/**
 *
 * @author julian
 */
public class Main {
    
    
    public static void main(String[] args) {
   
    Controlador controlador = new Controlador();
    
    //creo instancias de Estados de Turno
    EstadoTurno et1 = new EstadoTurno("en espera");
    EstadoTurno et2 = new EstadoTurno("para atencion");
    EstadoTurno et3 = new EstadoTurno("atendiendo");
    EstadoTurno et4 = new EstadoTurno("finalizado");
    EstadoTurno et5 = new EstadoTurno("baja");
    //Agrego las instancias de Estado Turno a la lista del controlador
   
    
    controlador.persistirEstadoTurno(et1);
    controlador.persistirEstadoTurno(et2);
    controlador.persistirEstadoTurno(et3);
    controlador.persistirEstadoTurno(et4);
    controlador.persistirEstadoTurno(et5);
    
    //creo condiciones prioritarias para los turnos
    CondicionPrioritaria cp1 = new CondicionPrioritaria("embarazada");
    CondicionPrioritaria cp2 = new CondicionPrioritaria("mayor de 65 años");
    CondicionPrioritaria cp3 = new CondicionPrioritaria("Acompañado de un menor de 2 años");
    CondicionPrioritaria cp4 = new CondicionPrioritaria("Persona con capacidades reducidas");
    //cargo las condiciones prioritarias a la lista de condiciones prioritarias del controlador
    
    
    controlador.persistirCondicionPrioritaria(cp1);
    controlador.persistirCondicionPrioritaria(cp2);
    controlador.persistirCondicionPrioritaria(cp3);
    controlador.persistirCondicionPrioritaria(cp4);
    
    //creo tipos de cliente
    TipoCliente tp1 = new TipoCliente("Inscripto");
    TipoCliente tp2 = new TipoCliente("Beneficiario");
    //cargo los tipos de cliente en la lista de tipos de cliente del controlador
    
   
    controlador.persistirTipoCliente(tp1);
    controlador.persistirTipoCliente(tp2);
    
    //creo clientes
    Cliente c1 = new Cliente(2233445, "Martin", "Gonzalez", "3764 - 807060", "calle falsa 123", tp1);
    Cliente c2 = new Cliente(12345, "Robert", "Downey Jr.", "3764 - 999999", "avengers 1234", tp2);
    Cliente c3 = new Cliente(1678578, "Silvia", "Golazo", "3764 - 854632", "mambru 2432", tp1);
    Cliente c4 = new Cliente(2894245, "Fort", "Ricardo", "3764 - 111111", "MIAMEEEE");
   
    
    //cargo los clientes al controlador
    controlador.persistirCliente(c1);
    controlador.persistirCliente(c2);
    controlador.persistirCliente(c3);
    controlador.persistirCliente(c4);
    
     //creo requisitos
   Requisito r1 = new Requisito("Ser menor de 70 años");
   Requisito r2 = new Requisito("Tener al dia la cuota");
   Requisito r3 = new Requisito("Haber aprobado el 60%");
   
   //persisto requisitos
   controlador.persistirRequisito(r1);
   controlador.persistirRequisito(r2);
   controlador.persistirRequisito(r3);
    
    //creo 4 instancias de area
    Area a1= new Area(" area1");
    Area a2= new Area(" area2");
    Area a3= new Area(" area3");
    Area a4= new Area(" area4");
    
    //cargo las areas al controlador    
    controlador.persistirArea(a1);
    controlador.persistirArea(a2);
    controlador.persistirArea(a3);
    controlador.persistirArea(a4); 

    //Agrego las areas creadas a la lista de areas del controlador
//    controlador.addArea(a1);
//    controlador.addArea(a2);
//    controlador.addArea(a3);
//    controlador.addArea(a4);
    
    
    //creo tramites
    Tramite t1 = new Tramite("Apruebenos profe porfa", a1 );
    Tramite t2 = new Tramite("Abonar factura de luz", a1);
    Tramite t3 = new Tramite("Solicitar baja de materia", a2);
    Tramite t4 = new Tramite("Solicitar aprobar cursada", a2);
    
    t1.addRequisito(r3);
    t2.addRequisito(r3);
    t3.addRequisito(r2);
    
    //cargo los tramites al controlador
    controlador.persistirTramite(t1);
    controlador.persistirTramite(t2);
    controlador.persistirTramite(t3);
    controlador.persistirTramite(t4); 



//agrego los tramites creados a la lista de tramites de cada area
    a1.addTramite(t1);
    a1.addTramite(t2);
    a2.addTramite(t3);
    a2.addTramite(t4);
    

    
    //creo empleados
    Empleado empleado1= new Empleado(40894778,"Juan", "Ortelo", "154787878", "La mejor 123");
    Empleado empleado2= new Empleado(39558885,"Pedro", "Ortelo", "1234568", "La mejor 123");
    Empleado empleado3= new Empleado(40222200,"Ramon", "Ortelo", "14558588", "Villa Gesell");
    Empleado empleado4= new Empleado(41222222,"Luis", "Villalba", "3764898", "La mejor 456");
    
    empleado1.setArea(a4);
    a4.addEmpleado(empleado1);
    empleado2.setArea(a2);
    a2.addEmpleado(empleado2);
    empleado3.setArea(a2);
    a2.addEmpleado(empleado3);
    empleado4.setArea(a1);
    a1.addEmpleado(empleado4);
    
    
    //cargo los empleados al controlador
    controlador.persistirEmpleado(empleado1);
    controlador.persistirEmpleado(empleado2);
    controlador.persistirEmpleado(empleado3);
    controlador.persistirEmpleado(empleado4);
    
  
          Cliente c5 = new Cliente(45678, "Fort", "Ricardo", "3764 - 111111", "MIAMEEEE");

          UsuarioWeb usu = new UsuarioWeb("ramon","12345",c5);
          c5.setUsuario(usu);
        
          controlador.persistirCliente(c5);
    

    MenuPrincipal menu = new MenuPrincipal(controlador);
    menu.setVisible(true);
    }
    
    }