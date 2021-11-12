
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
<%@ page import = "controlador.*" %>
<%@ page import = "modelo.*" %>
<%@ page import = "controlador.exceptions.*" %>
<%@ page import = "persistencia.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu</title>
    </head>
    <body>
        <%

            String usu = request.getParameter("user");
            String pass = request.getParameter("pas");
            String dni = request.getParameter("dni");
            Integer dni2 = Integer.parseInt(dni);

            HttpSession sesion = request.getSession();
            sesion.setAttribute("dniglobal", dni2);

            Controlador controlador = new Controlador();

            Cliente clienteTemporal = controlador.buscarClienteBDD(dni2);

            if (clienteTemporal != null) {
                UsuarioWeb uw = clienteTemporal.getUsuario();
                if (uw != null) {

                    if (uw.getContraseña().equals(pass) && uw.getUsuario().equals(usu)) {
                        out.println("Bienvenido!  " + clienteTemporal.getNombre());
        %>    

        <h2>Gestion de Datos Personales</h2>
        <ul>
            <li><a href='ModificarDatos.jsp'>Modificar Datos</a></li>
            <li><a href='ModificarUsuario.jsp'>Modificar Datos de Usuario Web</a></li>      
        </ul>


        <h2>Gestion de Turnos</h2>
        <ul>
            <li><a href='SolicitarTurno.jsp'>Solicitar</a></li>
            <li><a href='TurnoCancelar.jsp'>Cancelar</a></li>        
        </ul>  

        <%
                    } else {
                        out.println("El usuario o contraseña es incorrecto <br><br> <a href='index.jsp'>Volver a la pagina anterior</a>");

                    }

                } else {
                    out.println("El DNI que ingreso no posee un usuario web asociado, por favor cree una cuenta para continuar <br><br> <a href='CrearUsuarioWeb.jsp'>Registrarse aqui!</a>");
                    out.println("<br><br><a href='index.jsp'>Volver a la pagina anterior</a>");
                }
            } else {
                out.println("El DNI ingresado no pertenece a ningun cliente, por favor, intente de nuevo <br><br> <a href='index.jsp'>Volver a la pagina anterior</a>");
            }
        %>
    </body>


</html>