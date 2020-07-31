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
public class Gerencias {
    
    private int id_gerencia;
    private String gerencia;
    
     public Gerencias() {
    }

    public Gerencias(int id_gerencia, String gerencia) {
        this.id_gerencia = id_gerencia;
        this.gerencia = gerencia;
    }

    public int getId_gerencia() {
        return id_gerencia;
    }

    public void setId_gerencia(int id_gerencia) {
        this.id_gerencia = id_gerencia;
    }

    public String getGerencia() {
        return gerencia;
    }

    public void setGerencia(String gerencia) {
        this.gerencia = gerencia;
    }
    
    
    public ArrayList<Gerencias> listaGerencia() throws SQLException{
        
            ArrayList LGerencia=new ArrayList();
            Conexion conex=new Conexion();
            String sql="SELECT * FROM gerencias";
         try {   
            conex.conectar();
            PreparedStatement st=(PreparedStatement) conex.getConexion().prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                LGerencia.add(new Gerencias(rs.getInt(1),
                                       rs.getString(2)));
               
            }
             conex.desconectar();
        } catch (ClassNotFoundException ex) { 
        } catch (SQLException ex) {
            
        }
         return LGerencia;
    
    
}
}