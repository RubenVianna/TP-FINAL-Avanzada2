<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
<%@ page import = "controlador.*" %>
<%@ page import = "modelo.*" %>
<%@ page import = "controlador.exceptions.*" %>
<%@ page import = "persistencia.*" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Creacion de Usuario Web</title>
    </head>
    <body>
                  <h1>Creacion de Usuario Web</h1>
        <form method="post" action="UsuarioCreado.jsp" name="frm">
            <label for="dni">Ingrese su DNI: </label><br>
            <input type="number" id="dni" name="dni"> <br><br>
            <label for="user">Ingrese su Usuario:</label><br>
            <input type="text" id="user" name="user" value=""><br><br>
            <label for="pas">Ingrese su Password:</label><br>
            <input type="text" id="pas" name="pas" value=""><br><br><br>        
            <input type="button" value="Crear" onclick="valida_web()" >  
        </form>
           
            <script language="JavaScript" type="text/JavaScript">

            function valida_web(){
                
            if(document.frm.dni.value == "") {
            alert("No puede dejar el DNI en blanco");
            document.frm.dni.focus();
            return 0;
            }
            
            if(document.frm.user.value == "") {
            alert("No puede dejar el usuario en blanco");
            document.frm.nombre.focus();
            return 0;
            }
            
            if(document.frm.pas.value == "") {
            alert("No puede el password en blanco");
            document.frm.apellido.focus();
            return 0;
            }
             
            document.frm.submit();
            return true;
            }
            
        </script>            
    </body>
</html>
