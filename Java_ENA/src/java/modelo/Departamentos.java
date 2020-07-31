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
public class Departamentos {
    private int id_departamento;
    private String departamento;
    private int id_gerencia;

    public Departamentos() {
    }

    public Departamentos(int id_departamento, String departamento, int id_gerencia) {
        this.id_departamento = id_departamento;
        this.departamento = departamento;
        this.id_gerencia = id_gerencia;
    }

    public int getId_departamento() {
        return id_departamento;
    }

    public void setId_departamento(int id_departamento) {
        this.id_departamento = id_departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getId_gerencia() {
        return id_gerencia;
    }

    public void setId_gerencia(int id_gerencia) {
        this.id_gerencia = id_gerencia;
    }
    
     public ArrayList<Departamentos> listaDepartamento(){
        
            ArrayList LDepartamento=new ArrayList();
            Conexion conex=new Conexion();
            String sql="SELECT * FROM departamentos";
         try {   
            conex.conectar();
            PreparedStatement st=(PreparedStatement) conex.getConexion().prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                LDepartamento.add(new Departamentos(rs.getInt(1),
                                       rs.getString(2),
                                       rs.getInt(3)));
               
            }
             conex.desconectar();
        } catch (ClassNotFoundException ex) { 
        } catch (SQLException ex) {
            
        }
         return LDepartamento;
    }
    
}
