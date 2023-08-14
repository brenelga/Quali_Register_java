/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quali_register_2;

/**
 *
 * @author Jesus Brenel
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDatos {
Connection conn;

    public BaseDatos() {
    try {
        conn= DriverManager.getConnection("jdbc:postgresql://localhost:5432/quali_register", "postgres", "1234");
        System.out.println("Conectado");
    } catch (SQLException ex) {
        System.err.println(ex.getMessage());
    }
    }
    
    public ResultSet consultar( String query){
        ResultSet r=null;
    try {
        Statement st=null;
        st=conn.createStatement();
        r = st.executeQuery(query);
        return r;
    } catch (SQLException ex) {
        Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
    }
    return r;
    }
      public void actualizar(String query){
         try {
        Statement st=null;
        st=conn.createStatement();
        st.execute(query);
        
    } catch (SQLException ex) {
        Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
}
