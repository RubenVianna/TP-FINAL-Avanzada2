<%@page import="java.util.Date"%>
<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
<%@ page import = "controlador.*" %>
<%@ page import = "modelo.*" %>
<%@ page import = "controlador.exceptions.*" %>
<%@ page import = "persistencia.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <%
            HttpSession sesion = request.getSession();
            Controlador controlador = new Controlador();

            Integer dni2 = (Integer) sesion.getAttribute("dniglobal");
            String bandera = request.getParameter("prioritaria");

            String nombreTramite = request.getParameter("tramite");
            Cliente clienteTemp = controlador.buscarClienteBDD(dni2);
            if (clienteTemp != null) {
                
                if (bandera != "0") {
                  Integer numeroturnera = controlador.CrearTurnoPrio(nombreTramite, bandera, clienteTemp);
                    sesion.setAttribute("turno", numeroturnera);
                } else {
                    Integer numeroturnera = controlador.CrearTurno(nombreTramite, clienteTemp);
                sesion.setAttribute("turno", numeroturnera); 
                }

        %>
        <script type="text/javascript" >
            alert("Turno creado correctamente");
        </script>
        <a href='TurnoCreado.jsp'>VER TURNO AQUI!</a>
        <%           }


        %>
    </body>
</html>
