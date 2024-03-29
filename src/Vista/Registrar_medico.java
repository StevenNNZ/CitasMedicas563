package Vista;

public class Registrar_medico extends javax.swing.JInternalFrame {
    private Controlador.MedicoControl medicoControlador;
    
    public Registrar_medico() {
        initComponents();
        medicoControlador=new Controlador.MedicoControl(this);
        btnRegistrar.addActionListener(medicoControlador);
        btnNuevo.addActionListener(medicoControlador);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblId_doc = new javax.swing.JLabel();
        lblApellido_doc = new javax.swing.JLabel();
        lblNombreDoc = new javax.swing.JLabel();
        txtId_doc = new javax.swing.JTextField();
        txtNombre_doc = new javax.swing.JTextField();
        txtApellido_doc = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Registrar médicos");

        lblId_doc.setText("Documento:");

        lblApellido_doc.setText("Apellidos:");

        lblNombreDoc.setText("Nombres:");

        txtNombre_doc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombre_docActionPerformed(evt);
            }
        });

        txtApellido_doc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellido_docActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblApellido_doc)
                            .addComponent(lblNombreDoc)
                            .addComponent(lblId_doc))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtId_doc, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNombre_doc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtApellido_doc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(btnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRegistrar)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId_doc)
                    .addComponent(txtId_doc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreDoc)
                    .addComponent(txtNombre_doc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellido_doc)
                    .addComponent(txtApellido_doc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnRegistrar))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombre_docActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombre_docActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre_docActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtApellido_docActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellido_docActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellido_docActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnNuevo;
    public javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel lblApellido_doc;
    private javax.swing.JLabel lblId_doc;
    private javax.swing.JLabel lblNombreDoc;
    public javax.swing.JTextField txtApellido_doc;
    public javax.swing.JTextField txtId_doc;
    public javax.swing.JTextField txtNombre_doc;
    // End of variables declaration//GEN-END:variables
}
