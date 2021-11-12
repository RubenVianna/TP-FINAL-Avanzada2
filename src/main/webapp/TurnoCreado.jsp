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
            
            Integer turno =(Integer) sesion.getAttribute("turno");
            Integer dni2 = (Integer) sesion.getAttribute("dniglobal");
            Cliente clienteTemp = controlador.buscarClienteBDD(dni2);
            
            out.println("HOLA "+ clienteTemp.getNombre()+ " su turno es el numero: " +turno );
        %>
            
           
    </body>
</html>
