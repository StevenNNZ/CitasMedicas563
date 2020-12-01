package Modelo;
/*
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
//import java.util.*;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import Recursos.Conexion;
import java.util.logging.Logger;

public class GestorMedico {

    private static LinkedList<Medico> medicos;
    Connection conn;
    Conexion conectar=new Conexion();

    public GestorMedico() {
       
        medicos = new LinkedList<Medico>();
    }

    public void RegistrarMedicos(Medico medico) throws SQLException {
        PreparedStatement pst;
        try {
            conn = conectar.getConexion();
            pst = conn.prepareStatement("insert into medicos values(?,?,?)");
            pst.setString(1,medico.getIdentificacion());
            pst.setString(2,medico.getNombre());
            pst.setString(3,medico.getApellido());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Médico registrado con éxito");

        } catch (SQLException ex) {
            Logger.getLogger(GestorPaciente.class.getName()).log(Level.SEVERE, null, ex);

        }

        //pacientes.add(paciente);
    }
}
/*
    public LinkedList<Medico> getMedicobyParametro(int parametro, String valor) {
        LinkedList<Medico> resultado = new LinkedList<Medico>();
        String sql = "";
        conn = conectar.getConexion();
//for(Paciente pac:pacientes)
//{
        switch (parametro) {
            case 1: //if(pac.getIdentificacion().equals(valor))
                sql = "select * from pacientes where PACIDENTIFICACION =" + valor + "";
                //select * from pacientes where PACNOMBRE= "Steven"
//resultado.add(pac);
                break;
            case 2: //if(pac.getNombres().equals(valor))
                sql = "select * from pacientes where PACNOMBRE =" + valor + "";
//resultado.add(pac);
                break;

            case 3: //if(pac.getApellidos().equals(valor))
                sql = "select * from pacientes where PACAPELLIDOS =" + valor + "";
//resultado.add(pac);
                break;
            case 4: //if(pac.getGenero().equals(valor))
                sql = "select * from pacientes where PACSEXO =" + valor + "";
//resultado.add(pac);
                break;
            

        }
//}
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {

                resultado.add(new Paciente(rs.getString("PACIDENTIFICACION"), rs.getString("PACNOMBRE"), rs.getString("PACAPELLIDOS"), rs.getString("PACFECHANACIMIENTO"), rs.getString("PACSEXO")));

            }
            st.close();
            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }

        return resultado;
    }
}
*/