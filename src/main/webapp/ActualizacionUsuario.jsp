<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
<%@ page import = "controlador.*" %>
<%@ page import = "modelo.*" %>
<%@ page import = "controlador.exceptions.*" %>
<%@ page import = "persistencia.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
         <p>Los datos se actualizaron correctamente! :D</p>
        
       <br><br> <a href='ModificarUsuario.jsp'>Volver a la pagina anterior</a>
        <%
            HttpSession sesion = request.getSession();

            Controlador controlador = new Controlador();
            
            String usu = request.getParameter("user");
            String pas = request.getParameter("pas");

            Integer dni2 = (Integer) sesion.getAttribute("dniglobal");
            
            Cliente cli = controlador.buscarClienteBDD(dni2);
            
            controlador.ModificarUsuarioWeb(cli, usu, pas);

        %>
        
        
        
    </body>
</html>
