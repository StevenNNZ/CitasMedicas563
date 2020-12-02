
package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonModel;

public class ConsultorioControl implements ActionListener {
    
    Vista.Registro_consultorio consultorioVista;
    Modelo.Consultorio ConsultorioModelo;
    Modelo.GestorConsultorio gestorConsultorio;

    public ConsultorioControl(Vista.Registro_consultorio consultorioVista)  {
        this.consultorioVista = consultorioVista;
        gestorConsultorio = new Modelo.GestorConsultorio();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    if (e.getSource().equals(consultorioVista.btn_re)) {
            String Ident = consultorioVista.t_Num.getText();
            String Nombre = consultorioVista.t_Nom.getText();
      ConsultorioModelo = new  Modelo.Consultorio(Ident,Nombre);
    }
    try {
                gestorConsultorio.RegistrarConsultorio(ConsultorioModelo);
                
            } catch (SQLException ex) {
                Logger.getLogger(PacienteControl.class.getName()).log(Level.SEVERE, null, ex);
            }
    
    if (e.getSource().equals(consultorioVista.btn_nu)) {
            consultorioVista.t_Num.setText("");
            consultorioVista.t_Nom.setText("");
}
    }
}
        