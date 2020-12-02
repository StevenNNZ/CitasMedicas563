package Controlador;

import java.awt.event.*;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;

public class GestorMedicoControl implements ActionListener {

    Modelo.GestorMedico MedicoModelo;
    Vista.ConsultarMedicos consultarMedicoVista;

    public GestorMedicoControl(Vista.ConsultarMedicos consultarMedicoVista) {
        this.consultarMedicoVista = consultarMedicoVista;
        MedicoModelo = new Modelo.GestorMedico();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DefaultTableModel tmodelo;
        String valor = "'"+consultarMedicoVista.txtConsulta.getText()+"'";
        int parametro = 0;
        if (consultarMedicoVista.RBIdentificacion.isSelected()) {
            parametro = 1;
        }
        if (consultarMedicoVista.RBNombre.isSelected()) {
            parametro = 2;
        }
        if (consultarMedicoVista.RBApellidos.isSelected()) {
            parametro = 3;
        }
        
        LinkedList<Modelo.Medico> medico = MedicoModelo.getMedicobyParametro(parametro, valor);
        String registro[] = new String[3];
        String[] Titulos = {"Identificacion","Nombre","Apellidos"};
        tmodelo  = new DefaultTableModel();

    tmodelo.setColumnIdentifiers (Titulos);
    for(Modelo.Medico m:medico){
        registro[0] = m.getIdentificacion();
        registro[1] = m.getNombre();
        registro[2] = m.getApellido();
   
        tmodelo.addRow(registro);
    }

    consultarMedicoVista.TablaConsulta.setModel (tmodelo);
}
}



/*
package Controlador;

//import Vista.ConsultarMedicos;
//import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;


public class GestorMedicoControl {
    Modelo.GestorMedico MedicoModelo;
    Vista.ConsultarMedicos consultarMedicoVista;

    public GestorMedicoControl(Vista.ConsultarMedicos consultarMedicoVista) {
        this.consultarMedicoVista = consultarMedicoVista;
        MedicoModelo = new Modelo.GestorMedico();
    }

    
  
  
    //@Override
    public void actionPerformed(ActionEvent e) {
        DefaultTableModel tmodelo;
        String valor = "'"+consultarMedicoVista.txtConsulta.getText()+"'";
        int parametro = 0;
        if (consultarMedicoVista.RBIdentificacion.isSelected()) {
            parametro = 1;
        }
        if (consultarMedicoVista.RBNombre.isSelected()) {
            parametro = 2;
        }
        if (consultarMedicoVista.RBApellidos.isSelected()) {
            parametro = 3;
        }
        
        LinkedList<Modelo.Medico> medico = MedicoModelo.getMedicobyParametro(parametro, valor);
        String registro[] = new String[3];
        String[] Titulos = {"Identificacion","Nombre","Apellidos"};
        tmodelo  = new DefaultTableModel();

    tmodelo.setColumnIdentifiers (Titulos);
    for(Modelo.Medico m:medico){
        registro[0] = m.getIdentificacion();
        registro[1] = m.getNombre();
        registro[2] = m.getApellido();
   
        tmodelo.addRow(registro);
    }

    consultarMedicoVista.TablaConsulta.setModel (tmodelo);
}
}
//w
    
    
*/
