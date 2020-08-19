    package Logica;

import Conexion.Conexion;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class DataPaciente {
    private final String INSERT_Eps = "INSERT INTO eps(k_ideps, hrs_cancelacion) VALUES(?,?)";
    private final String INSERT_Us = "INSERT INTO usuario(k_numdocumento, i_sexo, n_nombres, n_apellidos, o_correoelectronico, i_tipodocumento, f_nacimiento, k_ideps) VALUES(?,?,?,?,?,?,?,?)";
    private final String INSERT_Tel = "INSERT INTO telefonousuario(k_numdocumento, q_telefono, i_tipodocumento) VALUES(?,?,?)";
    private final String INSERT_Pac = "INSERT INTO paciente(i_estado, i_afiliacion, k_numdocumento, k_idcategoria, i_tipodocumento, k_idafiliado, k_tipodoc) VALUES(?,?,?,?,?,?,?)";
    private final String INSERT_Cat = "INSERT INTO categoria(k_idcategoria, v_copago, n_nombre) VALUES(?,?,?)";    
    private PreparedStatement ps;
    private final Conexion cn;
    
    public DataPaciente(){        
        ps = null;
        cn = new Conexion();
    }
    public int insertarEps(int idEps, int hCancelacion){
        int cmp = 0;
        try{
            ps = cn.conectar().prepareStatement(INSERT_Eps);
            ps.setInt(1, idEps);
            ps.setInt(2, hCancelacion);
            int res = ps.executeUpdate();
            if(res > 0)
                cmp = 1;                
        } catch(Exception e){
            System.err.print(e.getMessage());
            JOptionPane.showMessageDialog(null,e.getMessage(),"Error", JOptionPane.ERROR_MESSAGE);            
        } finally{
          ps = null;
          cn.close();
        }
        return cmp;
    }
    
    
    public int insertarUs(int numDoc, String sexo, String nombre, String apellido, String correo, String tipoDoc, Date fecha, int idEps){
        int cmp = 0;
        try{
            ps = cn.conectar().prepareStatement(INSERT_Us);
            ps.setInt(1, numDoc);
            ps.setString(2, sexo);
            ps.setString(3, nombre);
            ps.setString(4, apellido);
            ps.setString(5, correo);
            ps.setString(6, tipoDoc);
            ps.setDate(7, fecha);
            ps.setInt(8, idEps);
            int res = ps.executeUpdate();
            if(res > 0)
                cmp = 1;                
        } catch(Exception e){
            System.err.print(e.getMessage());
            JOptionPane.showMessageDialog(null,e.getMessage(),"Error al registrar el paciente1", JOptionPane.ERROR_MESSAGE);            
        } finally{
          ps = null;
          cn.close();
        }
        return cmp;
    }
    
    public int insertarPac(String estado, String afiliacion, int numDocPac, int idCategoria, String tipoDoc, Integer idAfiliado, String tipoAfiliado){
        int cmp=0;
        try{
            ps = cn.conectar().prepareStatement(INSERT_Pac);
            ps.setString(1, estado);
            ps.setString(2, afiliacion);
            ps.setInt(3, numDocPac);
            ps.setInt(4, idCategoria);
            ps.setString(5, tipoDoc);
            ps.setInt(6, idAfiliado );
            ps.setString(7, tipoAfiliado);            
            int res = ps.executeUpdate();
            if(res > 0)
                cmp = 1;                
        } catch(Exception e){
            System.err.print(e.getMessage());
            JOptionPane.showMessageDialog(null,e.getMessage(),"Error al registrar el paciente2", JOptionPane.ERROR_MESSAGE);            
        } finally{
          ps = null;
          cn.close();
        }
        return cmp;       
    }
    
    public int insertarCat(int id, BigDecimal copago, String nombre){
        int cmp=0;
        try{
            ps = cn.conectar().prepareStatement(INSERT_Cat);
            ps.setInt(1, id);
            ps.setBigDecimal(2, copago);            
            ps.setString(3, nombre);        
            int res = ps.executeUpdate();
            if(res > 0)
                cmp = 1;            
        } catch(Exception e){
            System.err.print(e.getMessage());
            JOptionPane.showMessageDialog(null,e.getMessage(),"Error al registrar el paciente3", JOptionPane.ERROR_MESSAGE);            
        } finally{
          ps = null;
          cn.close();
        }
        return cmp;
    }
    
    public int insertarTel(int id, long numero, String tipoDocumento){
        int cmp = 0;
        try{
            ps = cn.conectar().prepareStatement(INSERT_Tel);
            ps.setInt(1, id);               
            ps.setLong(2, numero);                   
            ps.setString(3, tipoDocumento);
            int res = ps.executeUpdate();            
            if(res > 0)
                cmp = 1;                
        } catch(Exception e){    
            System.err.print(e.getMessage());
           JOptionPane.showMessageDialog(null,e.getMessage(),"Error al registrar el paciente4", JOptionPane.ERROR_MESSAGE);            
        } finally{
          ps = null;
          cn.close();
        }
        return cmp;
    }
    
    public int DeleteData(String nombreTabla, int id, String tipoDocumento, int opcion){
        int cmp = 0;
        String SQL;
        
        if(opcion == 1){
            SQL = "DELETE FROM "+nombreTabla+" WHERE k_numdocumento = "+id+" AND i_tipodocumento = '"+tipoDocumento+"'";
        } else if(opcion ==2){
            SQL = "DELETE FROM categoria WHERE k_idcategoria = "+id;
        } else{
            SQL = "DELETE FROM eps WHERE k_ideps = "+id;
        }
        try{
            
            ps = cn.conectar().prepareStatement(SQL);           
            int res = ps.executeUpdate();            
            if(res > 0)
                cmp = 1;                
        } catch(Exception e){  
            System.err.print(e.getMessage());
           JOptionPane.showMessageDialog(null,e.getMessage(),"Error al eliminar el paciente5", JOptionPane.ERROR_MESSAGE);            
        } finally{
          ps = null;
          cn.close();
        }
        return cmp;
    }
}
    