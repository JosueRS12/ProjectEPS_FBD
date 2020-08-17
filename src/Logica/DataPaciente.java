package Logica;

import Conexion.Conexion;
import java.sql.Date;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class DataPaciente {

    private final String INSERT_Us = "INSERT INTO usuario(k_numdocumento, i_sexo, n_nombres, n_apellidos, o_correoelectronico, i_tipodocumento, f_nacimiento) VALUES(?,?,?,?,?,?,?)";
    private final String INSERT_Tel = "INSERT INTO telefonousuario(k_numdocumento, q_telefono) VALUES(?,?)";
    private final String INSERT_Pac = "INSERT INTO paciente(i_estado, i_afiliacion, k_numdocumento, k_idcategoria) VALUES(?,?,?,?)";
    private final String INSERT_Cat = "INSERT INTO categoria(k_id, v_precio, n_nombre, k_numdocumento   ) VALUES(?,?,?,?)";
    private PreparedStatement ps;
    private final Conexion cn;
    
    public DataPaciente(){
        ps = null;
        cn = new Conexion();
    }
    
    public int insertarUs(int numDoc, String sexo, String nombre, String apellido, String correo, String tipoDoc, Date fecha){
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
            int res = ps.executeUpdate();
            if(res > 0)
                cmp = 1;                
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage(),"Error al registrar el paciente", JOptionPane.ERROR_MESSAGE);            
        } finally{
          ps = null;
          cn.close();
        }
        return cmp;
    }
    
    public int insertarPac(String estado, String afiliacion, int numDocPac, int idCategoria){
        int cmp=0;
        try{
            ps = cn.conectar().prepareStatement(INSERT_Pac);
            ps.setString(1, estado);
            ps.setString(2, afiliacion);
            ps.setInt(3, numDocPac);
            ps.setInt(4, idCategoria);            
            int res = ps.executeUpdate();
            if(res > 0)
                cmp = 1;                
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage(),"Error al registrar el paciente", JOptionPane.ERROR_MESSAGE);            
        } finally{
          ps = null;
          cn.close();
        }
        return cmp;
    }
    
    public int insertarCat(int id, int precio, String nombre, int numDocPac){
        int cmp=0;
        try{
            ps = cn.conectar().prepareStatement(INSERT_Cat);
            ps.setInt(1, id);
            ps.setInt(2, precio);            
            ps.setString(3, nombre);
            ps.setInt(4, numDocPac);
            int res = ps.executeUpdate();
            if(res > 0)
                cmp = 1;            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage(),"Error al registrar el paciente", JOptionPane.ERROR_MESSAGE);            
        } finally{
          ps = null;
          cn.close();
        }
        return cmp;
    }
    
    public int insertarTel(int id, long numero,long numero2){
        int cmp = 0;
        try{
            ps = cn.conectar().prepareStatement(INSERT_Tel);
            ps.setInt(1, id);               
            ps.setLong(2, numero);
            ps.setLong(2, numero2);
            int res = ps.executeUpdate();            
            if(res > 0)
                cmp = 1;                
        } catch(Exception e){            
           JOptionPane.showMessageDialog(null,e.getMessage(),"Error al registrar el paciente", JOptionPane.ERROR_MESSAGE);            
        } finally{
          ps = null;
          cn.close();
        }
        return cmp;
    }
    
    public int DeleteData(String nombreTabla, int id){
        int cmp = 0;
        String SQL = "DELETE FROM "+nombreTabla+" WHERE k_numdocumento = "+id;
        try{
            ps = cn.conectar().prepareStatement(SQL);           
            int res = ps.executeUpdate();            
            if(res > 0)
                cmp = 1;                
        } catch(Exception e){            
           JOptionPane.showMessageDialog(null,e.getMessage(),"Error al eliminar el paciente", JOptionPane.ERROR_MESSAGE);            
        } finally{
          ps = null;
          cn.close();
        }
        return cmp;
    }
}
    