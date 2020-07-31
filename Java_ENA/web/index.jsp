<%-- 
    Document   : index
    Created on : 29-07-2020, 20:25:15
    Author     : Max
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
  <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

    
     
        
      
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
   
                  
<div class="row">
            <div class="col s6 offset-s3">
                <div class="card-panel z-depth-5">
        
         <form action="Menu.P" class= "" method="post" >
             
      
      
      <table>
          <h1 class="center">Autentificación</h1>
           <hr>
      <tr>
      <td align="left"><i class=" material-icons">perm_identity</i></td>
      
      <td> <input class="validate"required type="text" name="usuario" value="" placeholder="Usuario"> </td>
      </tr> <br>
      
      <tr>
      <td align="left"><i class=" material-icons">lock_outline</i></td>
      <td> <input class="validate"required type="password" name="password" value="" placeholder="Contraseña"> </td>
      </tr>
      </table>
     
      <br>
      <center><label >
             <input class="with-gap" name="login" type="checkbox" value="recordar"  />
             <span >Recordar</span>
      </label>
       </center>
      <br><br>
      <center>
      <input class="waves-effect waves-light red btn-small" type="submit" name="" value="Ingresar">
      </center>
      </form>                                     
                </div>
                </div>
                  </div>       
        
  </body>
    </body>
</html>
