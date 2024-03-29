package Modelo;

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
    Conexion conectar = new Conexion();

    public GestorMedico() {

        medicos = new LinkedList<Medico>();
    }

    public void RegistrarMedicos(Medico medico) throws SQLException {
        PreparedStatement pst;
        try {
            conn = conectar.getConexion();
            pst = conn.prepareStatement("insert into medicos values(?,?,?)");
            pst.setString(1, medico.getIdentificacion());
            pst.setString(2, medico.getNombre());
            pst.setString(3, medico.getApellido());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Médico registrado con éxito");

        } catch (SQLException ex) {
            Logger.getLogger(GestorPaciente.class.getName()).log(Level.SEVERE, null, ex);

        }

        medicos.add(medico);
    }

    public LinkedList<Medico> getMedicobyParametro(int parametro, String valor) {
        LinkedList<Medico> resultado = new LinkedList<Medico>();
        String sql = "";
        conn = conectar.getConexion();
        switch (parametro) {
            case 1:
                sql = "select * from medicos where MedIdentificacion =" + valor + "";
                break;
            case 2:
                sql = "select * from medicos where MedNombre =" + valor + "";
                break;

            case 3:
                sql = "select * from medicos where MedApellido =" + valor + "";
                break;
        }
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                resultado.add(new Medico(rs.getString("MedIdentificacion"), rs.getString("MedNombre"), rs.getString("MedApellido")));
            }
            st.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }

        return resultado;
    }

}
