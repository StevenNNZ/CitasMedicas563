/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author PC-01
 */
public class ConsultarMedicos extends javax.swing.JInternalFrame {

    /**
     * Creates new form ConsPacientesJInternalFrom
     */
    public ConsultarMedicos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Valor a buscar:");

        BConsultar.setText("Consultar");

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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(RBIdentificacion)
                        .addGap(18, 18, 18)
                        .addComponent(RBNombre)
                        .addGap(18, 18, 18)
                        .addComponent(RBApellidos)
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
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RBIdentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBIdentificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBIdentificacionActionPerformed

    private void RBNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBNombreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BConsultar;
    private javax.swing.JRadioButton RBApellidos;
    private javax.swing.JRadioButton RBIdentificacion;
    private javax.swing.JRadioButton RBNombre;
    private javax.swing.JTable TablaConsulta;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtConsulta;
    // End of variables declaration//GEN-END:variables
}
