<%@page import="java.util.List"%>
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
         
            Controlador controlador = new Controlador();
            String nombretra= request.getParameter("tramite");
        %>

        <h1>Listado de Requisitos</h1>
        <table border="1">

            <%
                Tramite tra= controlador.buscarTramite(nombretra);
                Integer id_tramite= tra.getId_Tramite();
                List<Requisito> requisitos = controlador.ListarRequisitosTramite(id_tramite);
                for (int i = 0; i < requisitos.size(); i++) {
                    out.println("<tr><td>" + requisitos.get(i).getNombreRequisito() + "</td></tr>");
                }
            %>

        </table>
        <p><a href='SolicitarTurno.jsp'>Volver a la pagina anterior</a><p>
    </body>
</html>
