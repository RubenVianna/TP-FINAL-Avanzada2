
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
<%@ page import = "controlador.*" %>
<%@ page import = "modelo.*" %>
<%@ page import = "controlador.exceptions.*" %>
<%@ page import = "persistencia.*" %>
<%@ page import = "main.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Logueo</title>
    </head>
    <body>
        <h1>Loggin</h1>
        <form method="post" action="Menu.jsp" name="frm">
            <label for="dni">DNI:</label><br>
            <input type="number" id="dni" name="dni"><br>
            <label for="user">USER:</label><br>
            <input type="text" id="user" name="user"><br>
            <label for="pas">PASSWORD:</label><br>
            <input type="password" id="pas" name="pas"><br><br>        
            <input type="button" value="Ingresar" onclick="valida_envia()" >  
        </form>

        <p>¿Aun no tiene una cuenta? <br> <a href="CrearUsuarioWeb.jsp" target="_blank">Registrese Aqui!</a></p>     

        <script language="JavaScript" type="text/JavaScript">

            function valida_envia(){
            if(document.frm.dni.value == "") {
            alert("Por favor ingrese un DNI");
            document.frm.nombre.focus();
            return 0;
            }

            if(document.frm.user.value == "") {
            alert("Por favor ingrese un usuario");
            document.frm.poblacion.focus();
            return 0;
            }


            if(document.frm.pas.value == "") {
            alert("Por favor ingrese una contraseña");
            document.frm.email.focus();
            return 0;
            }
            
            document.frm.submit();
            return true;
            }
        </script>     




        <% /* Controlador controlador = new Controlador();
          Cliente c4 = new Cliente(45678, "Fort", "Ricardo", "3764 - 111111", "MIAMEEEE");

          UsuarioWeb usu = new UsuarioWeb("ramon","12345",c4);
          c4.setUsuario(usu);
        
          controlador.persistirCliente(c4);
             */
        %>

    </body>

</html>
