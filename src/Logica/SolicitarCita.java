package Logica;

import Conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class SolicitarCita {  
    private PreparedStatement ps;
    private final Conexion cn;
    private ResultSet rs;
    //hay que verificar que el usuario ingresado exista.
    //hay que verificar que exista la cita en la agenda.
    //de existir, modificar el estado a inactiva en la agenda.
    
    public SolicitarCita(){
        this.ps = null;
        this.cn = new Conexion();
    }    
    
    public boolean verificarPaciente(int idPaciente) {        
        boolean res = false;       
        String verificar = "SELECT k_numdocumento FROM paciente WHERE k_numdocumento = "+idPaciente;
        try{
            ps = cn.conectar().prepareStatement(verificar);            
            rs = ps.executeQuery();        
            if(rs.next())
                res = true;
        } catch(Exception e){
            System.err.print("Ha ocurrido un error: "+ e.getMessage());
        } 
        finally{
            ps = null;
            cn.close();
            rs = null;
        }        
        return res;
    }
    
    //para verificar cita se debe hacer join
    //este metodo verifica que hayan citas activas
    //el paso siguiente es mostrar la tabla con las citas en especifico
    public boolean verificarCita (String nCita) {        
        boolean res = false;       
        String verificar = "SELECT k_numerocita FROM citavf WHERE i_ncita = "+"'"+nCita+"'"+" AND i_estado = 'A'";
        try{
            ps = cn.conectar().prepareStatement(verificar);            
            rs = ps.executeQuery();        
            if(rs.next())
                res = true;
        } catch(Exception e){
            System.err.print("Ha ocurrido un error: "+ e.getMessage());
        } 
        finally{
            ps = null;
            cn.close();
            rs = null;
        }        
        return res;
    }
    
    public int guardarCita(){
        String modificar = "UPDATE citavf SET i_estado = 'I' WHERE i_ncita = id_de_la_cita";
        return 0;
    }
    
    
}
