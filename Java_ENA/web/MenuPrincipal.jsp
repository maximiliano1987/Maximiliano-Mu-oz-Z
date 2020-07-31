<%-- 
    Document   : MenuPrincipal
    Created on : 12-07-2020, 17:49:59
    Author     : Max
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
       
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="row">
            <div class="col s6 offset-s3">
                <div class="card-panel z-depth-5">
        
        
        <h1 align="center">Menú Principal</h1>
             <hr>
    
             <form action="Ingresar" class="" method="post" align="center">
             
          <button class="btn-small waves-effect waves-light green" type="submit" name="IngresarRequerimiento">
          Ingresar Requerimiento  </button> 
             
   <%--  <input class="btn-small waves-effect waves-light green" type="submit" name="" value="Ingresar Requerimiento"> --%> 
         </form> 
          <br>
         
         <form action="Consultar" class="" method="post" align="center">
          <button class="btn-small waves-effect waves-light green " type="submit" name="ConsultarRequerimiento">
          Consultar Requerimiento  </button>  
             
         <%--   <input class="btn-small waves-effect waves-light green" type="submit" name="" value="Consultar Requerimiento"> --%>
         </form> 
          <br>
         
         <form action="CerrarRequerimiento.jsp" class="" method="post" align="center">
              <button class="waves-effect waves-light green btn-small" type="submit" name="CerrarRequerimiento">
             Cerrar Requerimiento </button> 
             
           <%--   <input class="btn-small waves-effect waves-light green" type="submit" name="" value="Cerrar Requerimiento"> --%>
             </form>
           
    
    </body>
</html>
