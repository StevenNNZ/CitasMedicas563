package Modelo;

import Recursos.Conexion;
import Vista.Registro_consultorio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class GestorConsultorio {

    private static LinkedList<Consultorio> consultorios;
    Connection conn;
    Conexion conectar = new Conexion();

    public GestorConsultorio() {
        consultorios = new LinkedList<Consultorio>();
    }

    public void RegistrarConsultorio(Consultorio consultorios) throws SQLException {
        PreparedStatement pst;
        try {
            conn = conectar.getConexion();
            pst = conn.prepareStatement("insert into consultorios values(?,?)");
            pst.setString(1,consultorios.getIdent());
            pst.setString(2,consultorios.getNombre());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Consultorio registrado con éxito");
        } catch (SQLException ex) {
            Logger.getLogger(Registro_consultorio.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public LinkedList<Consultorio> getPacientebyParametro(int parametro, String valor) {
        LinkedList<Consultorio> resultado = new LinkedList<Consultorio>();
        String sql = "";
        conn = conectar.getConexion();

        switch (parametro) {
            case 1:
                sql = "select * from consultorios where ConNumero  =" + valor + "";
                break;
            case 2:
                sql = "select * from consultorios where ConNombre =" + valor + "";
                break;
        }
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                resultado.add(new Consultorio(rs.getString("ConNumero"), rs.getString("ConNombre")));
            }
            st.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return null;

    }
}
