
package Vista;

//import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

public class ConsultarMedicos extends javax.swing.JInternalFrame {

public Controlador.GestorMedicoControl gestorMedicoControl;
    private DefaultTableModel tabla;
    
    public ConsultarMedicos() {
        initComponents();
        
        gestorMedicoControl=new Controlador.GestorMedicoControl(this);
        String titulosTabla[]={"Identificación","Nombres","Apellidos"};
        tabla=new DefaultTableModel (null, titulosTabla);
        TablaConsulta.setModel(tabla);
        BConsultar.addActionListener(gestorMedicoControl);
        
        
    }
    
    public DefaultTableModel getTableModel () {
        return tabla;
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        RBIdentificacion = new javax.swing.JRadioButton();
        RBNombre = new javax.swing.JRadioButton();
        RBApellidos = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        txtConsulta = new javax.swing.JTextField();
        BConsultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaConsulta = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("CONSULTA MEDICOS");
        setName("JConsultas"); // NOI18N

        buttonGroup1.add(RBIdentificacion);
        RBIdentificacion.setText("Identificacion");
        RBIdentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBIdentificacionActionPerformed(evt);
            }
        });

        buttonGroup1.add(RBNombre);
        RBNombre.setText("Nombres");
        RBNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBNombreActionPerformed(evt);
            }
        });

        buttonGroup1.add(RBApellidos);
        RBApellidos.setText("Apellidos");
        RBApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBApellidosActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Valor a buscar:");

        txtConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConsultaActionPerformed(evt);
            }
        });

        BConsultar.setText("Consultar");
        BConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BConsultarActionPerformed(evt);
            }
        });

        TablaConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Identificación", "Nombres", "Apellidos"
            }
        ));
        jScrollPane1.setViewportView(TablaConsulta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27)
                        .addComponent(txtConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BConsultar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(RBIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(RBNombre)
                                .addGap(18, 18, 18)
                                .addComponent(RBApellidos)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RBIdentificacion)
                    .addComponent(RBNombre)
                    .addComponent(RBApellidos))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BConsultar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RBIdentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBIdentificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBIdentificacionActionPerformed

    private void RBNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBNombreActionPerformed

    private void txtConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConsultaActionPerformed

    private void RBApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBApellidosActionPerformed

    private void BConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BConsultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BConsultarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BConsultar;
    public javax.swing.JRadioButton RBApellidos;
    public javax.swing.JRadioButton RBIdentificacion;
    public javax.swing.JRadioButton RBNombre;
    public javax.swing.JTable TablaConsulta;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField txtConsulta;
    // End of variables declaration//GEN-END:variables

    public class Txtbusqueda {

     

        public Txtbusqueda() {
        }
    }

    }

