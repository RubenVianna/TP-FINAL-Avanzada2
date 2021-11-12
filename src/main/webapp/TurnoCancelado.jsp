<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
<%@ page import = "controlador.*" %>
<%@ page import = "modelo.*" %>
<%@ page import = "controlador.exceptions.*" %>
<%@ page import = "persistencia.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cancelacion de Turno</title>
    </head>
    <body>
       <%
            HttpSession sesion = request.getSession();

            Controlador controlador = new Controlador();

            String tur = (String) sesion.getAttribute("turnoglobal");
            Integer numero= Integer.parseInt(tur);
            
            controlador.CancelarTurno(numero);
        %>
         <script type="text/javascript" >
            alert("Turno cancelado correctamente");
        </script>
    </body>
</html>
