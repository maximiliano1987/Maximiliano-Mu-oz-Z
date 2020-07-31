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
public class Asignaciones {
    
    private int id_asignaciones;
    private String asignaciones;

    public Asignaciones() {
    }

    public Asignaciones(int id_asignaciones, String asignaciones) {
        this.id_asignaciones = id_asignaciones;
        this.asignaciones = asignaciones;
    }

    public int getId_asignaciones() {
        return id_asignaciones;
    }

    public void setId_asignaciones(int id_asignaciones) {
        this.id_asignaciones = id_asignaciones;
    }

    public String getAsignaciones() {
        return asignaciones;
    }

    public void setAsignaciones(String asignaciones) {
        this.asignaciones = asignaciones;
    }
    
    
    
    public ArrayList<Asignaciones> listaAsignaciones(){
        
            ArrayList LAsignaciones=new ArrayList();
            Conexion conex=new Conexion();
            String sql="SELECT * FROM asignaciones";
         try {   
            conex.conectar();
            PreparedStatement st=(PreparedStatement) conex.getConexion().prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                LAsignaciones.add(new Asignaciones(rs.getInt(1),
                                       rs.getString(2)));
               
            }
             conex.desconectar();
        } catch (ClassNotFoundException ex) { 
        } catch (SQLException ex) {
            
        }
         return LAsignaciones;
    }
    
}
