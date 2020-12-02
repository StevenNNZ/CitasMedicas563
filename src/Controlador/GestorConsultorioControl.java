package Controlador;

import java.awt.event.*;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;



    public class GestorConsultorioControl implements ActionListener {

        Modelo.GestorConsultorio ConsultorioModelo;
        Vista.ConsultarConsultorios consultarConsultorioVista;

        public GestorConsultorioControl(Vista.ConsultarConsultorios consultarConsultorioVista) {
            this.consultarConsultorioVista = consultarConsultorioVista;
            ConsultorioModelo = new Modelo.GestorConsultorio();
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            DefaultTableModel tmodelo;
            String valor = "'" + consultarConsultorioVista.txtConsulta.getText() + "'";
            int parametro = 0;
            if (consultarConsultorioVista.RBIdentificacion.isSelected()) {
                parametro = 1;
            }
            if (consultarConsultorioVista.RBNombre.isSelected()) {
                parametro = 2;
            }

            LinkedList<Modelo.Consultorio> consultorio = ConsultorioModelo.getConsultoriobyParametro(parametro, valor);
            String registro[] = new String[2];
            String[] Titulos = {"Ident", "Nombre"};
            tmodelo = new DefaultTableModel();

            tmodelo.setColumnIdentifiers(Titulos);
            for (Modelo.Consultorio c : consultorio) {
                registro[0] = c.getIdent();
                registro[1] = c.getNombre();
                tmodelo.addRow(registro);
            }

            consultarConsultorioVista.TablaConsulta.setModel(tmodelo);
        }
    }

