package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    //JDBC Driver y url de la base de datos
    private Connection conexion;
    final String JDBC_DRIVER = "org.postgresql.Driver";
    final String DB_URL = "jdbc:postgresql://localhost:5432/EpsTest";
    final String USER = "postgres";
    final String PASS = "1193098162";
    
    public Conexion(){
        conexion = null;
    }
    
    public Connection conectar() throws Exception{
        try{
            conexion = DriverManager.getConnection(DB_URL, USER, PASS);
            Class.forName(JDBC_DRIVER);
            //JOptionPane.showMessageDialog(null,"sea iniciado correctamente la base de datos");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage(),"Error al intentar conectarse a la base de datos", JOptionPane.ERROR_MESSAGE);
            System.exit(0);           
        }
        return conexion;
    }      
  
    public void close(){
        try{
            conexion.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error al intentar cerrar la conexion con la base de datos", JOptionPane.ERROR_MESSAGE);
        }               
    }
}
