package Recursos;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion
        
{
    String url="jdbc:mysql://localhost:3306/citas_medicas";
    String user="root",pass="";    
    Connection con;
/*
    public Conexion(String localhost, String root, String string, String citas_medicas) {
       
    }

    public Conexion() {
       
    }
*/
    public Connection getConexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,user,pass);
             JOptionPane.showMessageDialog(null,"conexion a la base de datos ");
        } catch (Exception e) {  
             JOptionPane.showMessageDialog(null,"Error de conexion a la base de datos");
         }
        return con;
    }
    
}



        

        

        
    

