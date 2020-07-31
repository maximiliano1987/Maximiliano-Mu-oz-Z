/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Max
 */
public class GuardarDatos {
    
     private int id;
    private String gerente;
    private String departamento;
    private String asignacion;
    private String encargado;
    private String requerimiento;

    public GuardarDatos() {
    }

    public GuardarDatos(int id, String gerente, String departamento, String asignacion, String encargado, String requerimiento) {
        this.id = id;
        this.gerente = gerente;
        this.departamento = departamento;
        this.asignacion = asignacion;
        this.encargado = encargado;
        this.requerimiento = requerimiento;
    }

    public GuardarDatos(String gerente, String departamento, String asignacion, String encargado, String requerimiento) {
        this.gerente = gerente;
        this.departamento = departamento;
        this.asignacion = asignacion;
        this.encargado = encargado;
        this.requerimiento = requerimiento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getAsignacion() {
        return asignacion;
    }

    public void setAsignacion(String asignacion) {
        this.asignacion = asignacion;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public String getRequerimiento() {
        return requerimiento;
    }

    public void setRequerimiento(String requerimiento) {
        this.requerimiento = requerimiento;
    }

    
            
    public boolean ingresarDatos(){
            boolean ok=false;
            Conexion conex=new Conexion();
            
            
            try {
            String sql="insert into requerimientos(gerente, departamento, asignacion, encargado, requerimiento) values(?,?,?,?,?)";
            conex.conectar();
            PreparedStatement st=(PreparedStatement) conex.getConexion().prepareStatement(sql);
            st.setString(1, gerente);
            st.setString(2, departamento);
            st.setString(3, asignacion);
            st.setString(4, encargado);
            st.setString(5, requerimiento);
            st.executeUpdate();
            ok=true;
            conex.desconectar();
        } catch (ClassNotFoundException ex) {
        } catch (SQLException ex) {
            
        }
    return ok;
    }
    
     public ArrayList consultarDatos(){
        
            ArrayList lista=new ArrayList();
            Conexion conex=new Conexion();
            String sql="select * from requerimientos";
         try {   
            conex.conectar();
            PreparedStatement st=(PreparedStatement) conex.getConexion().prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                lista.add(new GuardarDatos(rs.getInt(1),
                                       rs.getString(2),
                                       rs.getString(3),
                                       rs.getString(4),
                                        rs.getString(5),
                                       rs.getString(6)));
               
            }
             conex.desconectar();
        } catch (ClassNotFoundException ex) { 
        } catch (SQLException ex) {
            
        }
         return lista;
    }
    
}
