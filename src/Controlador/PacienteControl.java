package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonModel;

public class PacienteControl implements ActionListener {

    Vista.RegPaciente pacienteVista;
    Modelo.Paciente pacienteModelo;
    Modelo.GestorPaciente gestorpacienteModelo;

    public PacienteControl(Vista.RegPaciente pacienteVista) {
        this.pacienteVista = pacienteVista;
        gestorpacienteModelo = new Modelo.GestorPaciente();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(pacienteVista.btn_registrar)) {
            String identificacion = pacienteVista.IdentificaconTxt.getText();
            String nombres = pacienteVista.NombreTxt.getText();
            String apellidos = pacienteVista.ApellidosTxt.getText();
            //SimpleDateFormat formato = new SimpleDateFormat("dd / MM / yyyy");
            String fecha_nacimiento = (pacienteVista.jDateChooser1.getDateFormatString());
            String genero = "";
            if (pacienteVista.rb_masculino.isSelected()) {
                genero = "M";
            }
            if (pacienteVista.rbFemenino.isSelected()) {
                genero = "F";
            }
            pacienteModelo = new Modelo.Paciente(identificacion, nombres, apellidos, fecha_nacimiento, genero);
            try {
                gestorpacienteModelo.RegistrarPacientes(pacienteModelo);
            } catch (SQLException ex) {
                Logger.getLogger(PacienteControl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getSource().equals(pacienteVista.NuevoBtn)) {
            pacienteVista.IdentificaconTxt.setText("");
            pacienteVista.NombreTxt.setText("");
            pacienteVista.ApellidosTxt.setText("");
            pacienteVista.jDateChooser1.setDate(null);
            pacienteVista.rb_masculino.setSelected(false);
            ButtonModel bm = null;
            pacienteVista.buttonGroup1.setSelected(bm, false);
            pacienteVista.rbFemenino.setSelected(false);
            pacienteVista.IdentificaconTxt.requestFocus();
        }
    }
    
    
}
