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

            String usu = request.getParameter("user");
            String pas = request.getParameter("pas");
            String dni = request.getParameter("dni");
            Integer dni2 = Integer.parseInt(dni);
            Cliente cli = controlador.buscarClienteBDD(dni2);
            if (cli != null) {
                if (cli.getUsuario()== null) {
                    controlador.CrearUsuarioWeb(usu, pas, cli);
        %>
        <script type="text/javascript" >
            alert("Usuario Creado Correctamente");
        </script>
        <br><br> <a href='index.jsp'>Volver a la pagina anterior</a>
        <%} else {
                    out.println("Usted ya posee una cuenta activa <br><br> <a href='index.jsp'>Volver a la pagina anterior</a>");
                }
            } else {
                out.println("El DNI ingresado no pertenece a ningun cliente, por favor, intente de nuevo <br><br> <a href='index.jsp'>Volver a la pagina anterior</a>");
            }
        %>


    </body>
</html>
