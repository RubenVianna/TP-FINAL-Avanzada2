<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
<%@ page import = "controlador.*" %>
<%@ page import = "modelo.*" %>
<%@ page import = "controlador.exceptions.*" %>
<%@ page import = "persistencia.*" %>
<%@ page import = "main.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            Controlador controlador = new Controlador();

            HttpSession sesion = request.getSession();

            Integer dni2 = (Integer) sesion.getAttribute("dniglobal");

            String turno = request.getParameter("turno");

            sesion.setAttribute("turnoglobal", turno);

            Integer numero = Integer.parseInt(turno);

            Cliente cliente = controlador.buscarClienteBDD(dni2);

            Turno tur = controlador.buscarTurno(numero);
            String condicion;

            if (tur.getCliente() == cliente) {
                if (tur.getCondicionPrioritaria() == null) {
                    condicion = "No Posee Condicion Prioritaria";
                } else {
                    condicion = tur.getCondicionPrioritaria().getMotivo();
                }
        %>

        <form method="post" action="TurnoCancelado.jsp" name="frm">
            <label for="numero">Numero Turno:</label><br>
            <input type="text" id="numero" name="numero" style="width: 120px" value="<%out.println(numero); %>" disabled><br>
            <label for="cliente">Cliente:</label><br>
            <input type="text" id="cliente" name="cliente" style="width: 250px" value="<%out.println(cliente.getNombre() + " " + cliente.getApellido()); %>" disabled><br>
            <label for="tramite">Tramite:</label><br>
            <input type="text" id="tramite" name="tramite" style="width: 300px" value="<%out.println(tur.getTramite().getNombreTramite()); %>" disabled><br>
            <label for="condicion">Condicion Prioritaria:</label><br>
            <input type="text" id="condicion" name="condicion" style="width: 250px" value="<%out.println(condicion); %>" disabled><br>
            <label for="estado">Estado:</label><br>
            <input type="text" id="estado" name="estado" style="width: 150px" value="<%out.println(tur.getEstadoTurno().getNombre()); %>" disabled><br><br>        
            <input type="button" value="Cancelar Turno" onclick="valida_envia()">  
        </form>
        <%
            } else {
                out.println("El numero de turno no pertenece a su cuenta <br><br> <a href='TurnoCancelar.jsp'>Volver a la pagina anterior</a>");
            }
        %>
        <script language="JavaScript" type="text/JavaScript">

            function valida_envia(){
            if(document.frm.estado.value == "baja") {
            alert("El turno ya esta cancelado");
            return 0;
            }

            document.frm.submit();
            return true;
            }
        </script> 
    </body>
</html>
