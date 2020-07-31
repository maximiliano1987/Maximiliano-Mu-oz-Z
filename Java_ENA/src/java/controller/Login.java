/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import conexion.Conexion;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Max
 */
@WebServlet(name = "Login", urlPatterns = {"/Menu.P"})
public class Login extends HttpServlet {

    Connection con = null;
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        try {
            boolean existeUsuario = false;
            //Guardamos los datos enviados desde index
            String usuario = request.getParameter("usuario");
            String password = request.getParameter("password");
            //Establecemos la conexion
            con = Conexion.getConexion();
            String consulta = "select * from login where usuario = ? and pass = ?";
            ResultSet rs = null;
            PreparedStatement pst = null;
            pst = con.prepareStatement(consulta);
            pst.setString(1, usuario);
            pst.setString(2, password);
            rs = pst.executeQuery();
 
            //String nombres="";
            //String apellidos="";
            while(rs.next()){
                //En caso de existir una coincidencia
                existeUsuario = true;
                
            }
 
            if(existeUsuario){
                
                request.getRequestDispatcher("/MenuPrincipal.jsp").forward(request, response);
            }else{
                //De lo contrario vamos a la página errorLogin.jsp
                request.getRequestDispatcher("/errorLogin.jsp").forward(request, response);
            }
            out.close();
        } catch (SQLException ex) {
        out.println(ex.toString());
        }
    }
 
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}