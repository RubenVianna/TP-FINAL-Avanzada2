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
        <title>Solicitar Turno</title>
    </head>
    <body>
        <%
            HttpSession sesion = request.getSession();

            Controlador controlador = new Controlador();

            Integer dni2 = (Integer) sesion.getAttribute("dniglobal");

            Cliente clienteTemporal = controlador.buscarClienteBDD(dni2);
        %>
        <h1>Creacion de Turno</h1>
        <form method="post" name="frm">
            <label for="dni">DNI:</label><br>
            <input type="number" id="dni" name="dni" value=<%out.println(dni2); %> disabled > <br>
            <label for="nombre">Nombre:</label><br>
            <input type="text" id="nombre" name="nombre" value="<% out.println(clienteTemporal.getNombre());%>" disabled><br>
            <label for="apellido">Apellido:</label><br>
            <input type="text" id="apellido" name="apellido" value="<% out.println(clienteTemporal.getApellido());%>" disabled><br>
            <p>Tramites: <br>
                <select name="tramite">
                    <option value="0"> </option>
                    <%
                        List<Tramite> listaTramites = controlador.ListarTramites();
                        for (int i = 0; i < listaTramites.size(); i++) {
                            out.println("<option>" + listaTramites.get(i).getNombreTramite() + "</option>");
                        }
                    %>
                </select>
                <input type="button" value="Ver Requisitos" onclick="valida_tramite()">
            </p>

            <p>Condicion Prioritaria: <br>
                <select name="prioritaria">
                    <option value="0"> </option>
                    <%
                        List<CondicionPrioritaria> listaCp = controlador.ListarCondicionesPrioritarias();
                        for (int i = 0; i < listaCp.size(); i++) {
                            out.println("<option>" + listaCp.get(i).getMotivo() + "</option>");
                        }
                    %>
                </select>
            </p><br>
            <input type="button" value="Ingresar" onclick="valida_envia2()" >  
        </form>                 


        <script language="JavaScript" type="text/JavaScript">

            function valida_envia2(){
            if(document.frm.tramite.value == 0) {
            alert("Por favor seleccione un tramite");
            document.frm.tramite.focus();
            return 0;
            }
           
            document.frm.action='CreacionTurno.jsp';            
            document.frm.submit();
            return true;
            }
            
            function valida_tramite(){
                 if(document.frm.tramite.value == 0) {
            alert("Ningun Tramite Seleccionado ");
            document.frm.tramite.focus();
            return 0;
            }
            
            document.frm.action='ListaRequisitos.jsp';            
            document.frm.submit();
            return true;
            }   
                
        </script>     


    </body>
</html>
