<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
<%@ page import = "controlador.*" %>
<%@ page import = "modelo.*" %>
<%@ page import = "controlador.exceptions.*" %>
<%@ page import = "persistencia.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gestion de Datos Personales</title>
    </head>
    <body>
        <%
            HttpSession sesion = request.getSession();

            Controlador controlador = new Controlador();

            Integer dni2 = (Integer) sesion.getAttribute("dniglobal");

            Cliente clienteTemporal = controlador.buscarClienteBDD(dni2);
        %>

        <h1>Datos del Cliente</h1>
        <form method="post" action="ActualizacionCliente.jsp" name="frm" >
            <label for="dni">DNI:</label><br>
            <input type="number" id="dni" name="dni" value=<% out.println(dni2);%>> <br>
            <label for="nombre">Nombre:</label><br>
            <input type="text" id="nombre" name="nombre" value="<% out.println(clienteTemporal.getNombre());%>"><br>
            <label for="apellido">Apellido:</label><br>
            <input type="text" id="apellido" name="apellido" value="<% out.println(clienteTemporal.getApellido());%>"><br>
            <label for="direccion">Direccion:</label><br>
            <input type="text" id="direccion" name="direccion" value="<% out.println(clienteTemporal.getDireccion());%>"> <br>
            <label for="direccion">Telefono:</label><br>
            <input type="text" id="telefono" name="telefono" value="<% out.println(clienteTemporal.getTelefono());%>"> <br><br>
            <input type="button" value="Guardar" onclick="valida_envia()" >    
        </form>

        <script language="JavaScript" type="text/JavaScript">

            function valida_envia(){
                
            if(document.frm.dni.value == "") {
            alert("No puede dejar el DNI en blanco");
            document.frm.dni.focus();
            return 0;
            }
            
            if(document.frm.nombre.value == "") {
            alert("No puede dejar el Nombre en blanco");
            document.frm.nombre.focus();
            return 0;
            }
            
            if(document.frm.apellido.value == "") {
            alert("No puede dejar el Apellido en blanco");
            document.frm.apellido.focus();
            return 0;
            }
            
            if(document.frm.direccion.value == "") {
            alert("No puede dejar la direccion en blanco");
            document.frm.direccion.focus();
            return 0;
            }
            
            if(document.frm.telefono.value == "") {
            alert("No puede dejar el telefono en blanco");
            document.frm.telefono.focus();
            return 0;
            }
         
            document.frm.submit();
            return true;
            }
            
        </script>            

    </body>


</html>
