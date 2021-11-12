<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
<%@ page import = "controlador.*" %>
<%@ page import = "modelo.*" %>
<%@ page import = "controlador.exceptions.*" %>
<%@ page import = "persistencia.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Actualizar Usuario Web</title>
    </head>
    <body>
           <% 
               HttpSession sesion = request.getSession();
               Controlador controlador = new Controlador();
            
            Integer dni2 = (Integer) sesion.getAttribute("dniglobal");
            Cliente cli= controlador.buscarClienteBDD(dni2);
            UsuarioWeb usu = cli.getUsuario();
            
          
            %>
                  <h1>Actualizacion de Usuario Web</h1>
        <form method="post" action="ActualizacionUsuario.jsp" name="frm">
            <label for="dni">DNI:</label><br>
            <input type="number" id="dni" name="dni" value=<% out.println(dni2);%> disabled> <br><br>
            <label for="user">USER:</label><br>
            <input type="text" id="user" name="user" value="<% out.println(usu.getUsuario());%>"><br><br>
            <label for="pas">PASSWORD:</label><br>
            <input type="text" id="pas" name="pas" value="<% out.println(usu.getContraseña());%>"><br><br><br>        
            <input type="button" value="Guardar" onclick="valida_web()" >  
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
