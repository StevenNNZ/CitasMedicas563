
package Controlador;

import Vista.Registro_consultorio;
import java.awt.event.*;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;

public class GestoConsultorioControl {
  /*  public class GestorConsultorioControl implements ActionListener {

    Modelo.GestorConsultorio ConsultorioModelo;
    Vista.ConsultarConsultorios consultarConsultorioVista;

    public GestorConsultorioControl(Vista.ConsultarPacientes consultarPacienteVista) {
        this.consultarConsultorioVista = consultarConsultorioVista;
        ConsultorioModelo = new Modelo.GestorConsultorio();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DefaultTableModel tmodelo;
        String valor = "'"+consultarConsultorioVista.Txtbusqueda.getText()+"'";
        int parametro = 0;
        if (consultarConsultorioVista.Ident.isSelected()) {
            parametro = 1;
        }
        if (consultarConsultorioVista.Nombre.isSelected()) {
            parametro = 2;
        }
        
        LinkedList<Modelo.Consultorio> pacientes = ConsultorioModelo.getPacientebyParametro(parametro,valor);
        String registro[] = new String[5];
        String[] Titulos = {"Ident","Nombre"};
        tmodelo  = new DefaultTableModel();

    tmodelo.setColumnIdentifiers (Titulos);
    for(Modelo.Consultorio p:pacientes){
        registro[0] = p.getIdentificacion();
        registro[1] = p.getNombres();
        tmodelo.addRow(registro);
    }

    consultarConsultorioVista.Tresultados.setModel (tmodelo);
}
}
}*/