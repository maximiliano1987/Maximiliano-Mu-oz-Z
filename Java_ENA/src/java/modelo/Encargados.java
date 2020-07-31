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
public class Encargados {
    
    private int id_encargado;
    private String encargado;
    private int id_asignaciones;

    public Encargados() {
    }

    public Encargados(int id_encargado, String encargado, int id_asignaciones) {
        this.id_encargado = id_encargado;
        this.encargado = encargado;
        this.id_asignaciones = id_asignaciones;
    }

    public int getId_encargado() {
        return id_encargado;
    }

    public void setId_encargado(int id_encargado) {
        this.id_encargado = id_encargado;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public int getId_asignaciones() {
        return id_asignaciones;
    }

    public void setId_asignaciones(int id_asignaciones) {
        this.id_asignaciones = id_asignaciones;
    }
    
    public ArrayList<Encargados> listaEncargado(){
        
            ArrayList LEncargado=new ArrayList();
            Conexion conex=new Conexion();
            String sql="SELECT * FROM encargados";
         try {   
            conex.conectar();
            PreparedStatement st=(PreparedStatement) conex.getConexion().prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                LEncargado.add(new Encargados(rs.getInt(1),
                                       rs.getString(2),
                                       rs.getInt(3)));
               
            }
             conex.desconectar();
        } catch (ClassNotFoundException ex) { 
        } catch (SQLException ex) {
            
        }
         return LEncargado;
    }
    
}
