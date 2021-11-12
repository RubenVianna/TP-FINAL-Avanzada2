<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
<%@ page import = "controlador.*" %>
<%@ page import = "modelo.*" %>
<%@ page import = "controlador.exceptions.*" %>
<%@ page import = "persistencia.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Actualizacion de Cliente</title>
    </head>
    <body>
        
        <p>Los datos se actualizaron correctamente! :D</p>
        
       <br><br> <a href='ModificarDatos.jsp'>Volver a la pagina anterior</a>
        <%
            HttpSession sesion = request.getSession();

            Controlador controlador = new Controlador();
            
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            String direccion = request.getParameter("direccion");
            String telefono = request.getParameter("telefono");   
            String dni = request.getParameter("dni");  
            Integer dninuevo = Integer.parseInt(dni);
            
            Integer dni2 = (Integer) sesion.getAttribute("dniglobal");
            
            Cliente cli = controlador.buscarClienteBDD(dni2);
            
            cli.setNombre(nombre);
            cli.setApellido(apellido);
            cli.setDireccion(direccion);
            cli.setTelefono(telefono);
            cli.setDni(dninuevo);
            controlador.actualizarCliente(cli);
        %>
        
        
        
        
    </body>
</html>
