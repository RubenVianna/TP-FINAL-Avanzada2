

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Ingrese numero de turno a cancelar</h2><br>
               <form method="post" action="CancelarTurno.jsp" name="frm">
                   <label for="turno">Numero de Turno:</label><br>
                   <input type="number" id="turno" name="turno"><br><br>
                   <input type="button" value="Continuar" onclick="valida_envia()" > 
               </form>
    <script language="JavaScript" type="text/JavaScript">

            function valida_envia(){
            if(document.frm.turno.value == "") {
            alert("Por favor ingrese un numero de turno");
            document.frm.turno.focus();
            return 0;
            }

            document.frm.submit();
            return true;
            }
        </script>     
    
    </body>
</html>
