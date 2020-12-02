package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonModel;
<<<<<<< HEAD

=======
/*
>>>>>>> origin/jeisson
public class MedicoControl implements ActionListener {

    Vista.Registrar_medico medicoVista;
    Modelo.Medico medicoModelo;
    Modelo.GestorMedico gestormedicoModelo;

    public MedicoControl(Vista.Registrar_medico medicoVista) {
        this.medicoVista = medicoVista;
        gestormedicoModelo = new Modelo.GestorMedico();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(medicoVista.btnRegistrar)) {
            String identificacion = medicoVista.txtId_doc.getText();
            String nombres = medicoVista.txtNombre_doc.getText();
            String apellidos = medicoVista.txtApellido_doc.getText();
            medicoModelo = new Modelo.Medico(identificacion, nombres, apellidos);
            try {
                gestormedicoModelo.RegistrarMedicos(medicoModelo);
            } catch (SQLException ex) {
                Logger.getLogger(PacienteControl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getSource().equals(medicoVista.btnNuevo)) {
            medicoVista.txtId_doc.setText("");
            medicoVista.txtNombre_doc.setText("");
            medicoVista.txtApellido_doc.setText("");
            
        }
    }
    
    
}
<<<<<<< HEAD
=======
*/
>>>>>>> origin/jeisson
