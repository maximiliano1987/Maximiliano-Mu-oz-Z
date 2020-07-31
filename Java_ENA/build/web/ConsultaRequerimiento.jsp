<%-- 
    Document   : ConsultaRequerimiento
    Created on : 12-07-2020, 17:51:11
    Author     : Max
--%>

<%@page import="java.util.List"%>
<%@page import="modelo.*"%>
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
        
       <form action=""  method="post">
      
             <h1>Consulta Requerimiento</h1>
      <hr>
      
      <table>
      <tr>
      <td align="left">Gerencia:</td>
      <td> <select name="gerencias" class="browser-default rigth" id="gerencias" >
                                <option value="" disabled selected>---- </option>
                                 <% List<Gerencias> listaGerencia=(List<Gerencias>)request.getAttribute("LGerencia");
                           if(listaGerencia!=null)//ESTO TMBN ES IMPORTANTE 
                         for(Gerencias c:listaGerencia){%>
                        <option value="<%=c.getId_gerencia()%>"><%=c.getGerencia()%></option>
                        <%--<option value="0">NOMBRE</option>--%>
                           <%} %>
                            </select> </td>
      </tr> 
      
      <tr>
      <td align="left">Depto:</td>
      <td> <select  name="departamento" class="browser-default">
              <option value="" disabled selected>---- </option>
                     <% List<Departamentos> listaDepartamento=(List<Departamentos>)request.getAttribute("LDepartamento");
                           if(listaDepartamento!=null)//ESTO TMBN ES IMPORTANTE 
                         for(Departamentos c:listaDepartamento){%>
                        <option value="<%=c.getId_departamento()%>"><%=c.getDepartamento()%></option>
                        <%--<option value="0">NOMBRE</option>--%>
                           <%} %></select> </td>
      </tr> 
      
      <tr>
      <td align="left" >Asignar a:</td>
      <td> <select name="menu" class="browser-default">
                         <option value="" disabled selected>---- </option>
                        <% List<Asignaciones> listaAsignaciones=(List<Asignaciones>)request.getAttribute("LAsignaciones");
                           if(listaAsignaciones!=null)//ESTO TMBN ES IMPORTANTE 
                         for(Asignaciones c:listaAsignaciones){%>
                        <option value="<%=c.getId_asignaciones()%>"><%=c.getAsignaciones()%></option>
                        <%--<option value="0">NOMBRE</option>--%>
                           <%} %> </select> </td>
      </tr> 
         
		  
      </table>
      <br>
      <input class="buttons" type="submit" name="input" value="Buscar">
	  
	  
  <table border="">
    <tr align="center">
      <td>Gerencia</td>
      <td>Depto.</td>
      <td>Asignado a</td>
      <td>Requerimiento</td>
    </tr>
    
    <tr align="center">
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
    <tr align="center">
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
    
    <tr align="center">
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
    
    <tr align="center">
      <td>&nbsp;</td>
      <td></td>
      <td>&nbsp;</td>
      <td></td>
    </tr>
  </tbody>
</table>
      </form>
       
        <form action="MenuPrincipal.jsp" method="post">
        <input class="buttons" type="submit" name="" value="Volver al Menú">
        </form>
    </body>
</html>
