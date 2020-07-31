/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Asignaciones;
import modelo.Departamentos;
import modelo.*;

/**
 *
 * @author Max
 */
@WebServlet(name = "Consultar", urlPatterns = {"/Consultar"})
public class Consultar extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        
        Gerencias ger = new Gerencias();
        ArrayList<Gerencias> LGerencia = new ArrayList<Gerencias>();
        LGerencia = ger.listaGerencia();
        request.setAttribute("LGerencia", LGerencia);
        
        
          Departamentos dep = new Departamentos();
        ArrayList<Departamentos> LDepartamento = new ArrayList<Departamentos>();
        LDepartamento = dep.listaDepartamento();
        request.setAttribute("LDepartamento", LDepartamento);
        
        
          Asignaciones asig = new Asignaciones();
        ArrayList<Asignaciones> LAsignaciones = new ArrayList<Asignaciones>();
        LAsignaciones = asig.listaAsignaciones();
        request.setAttribute("LAsignaciones", LAsignaciones);
        
        
        request.getRequestDispatcher("/ConsultaRequerimiento.jsp").forward(request, response);
        
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
