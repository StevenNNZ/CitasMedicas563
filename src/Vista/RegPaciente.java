package Vista;


public class RegPaciente extends javax.swing.JInternalFrame {
    private Controlador.PacienteControl pacienteControlador;
    public RegPaciente() {
        initComponents();
        pacienteControlador=new Controlador.PacienteControl(this);
        btn_registrar.addActionListener(pacienteControlador);
        NuevoBtn.addActionListener(pacienteControlador);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        LaIdentificacion = new javax.swing.JLabel();
        LaNombre = new javax.swing.JLabel();
        LaApellidos = new javax.swing.JLabel();
        LaFechaNacimiento = new javax.swing.JLabel();
        LaSexo = new javax.swing.JLabel();
        IdentificaconTxt = new javax.swing.JTextField();
        NombreTxt = new javax.swing.JTextField();
        ApellidosTxt = new javax.swing.JTextField();
        rb_masculino = new javax.swing.JRadioButton();
        rbFemenino = new javax.swing.JRadioButton();
        btn_registrar = new javax.swing.JButton();
        NuevoBtn = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Registro de pacientes ");

        LaIdentificacion.setText("Identificacion: ");

        LaNombre.setText("Nombre:");

        LaApellidos.setText("Apellidos: ");

        LaFechaNacimiento.setText("Fecha de Nacimiento:");

        LaSexo.setText("Sexo:");

        buttonGroup1.add(rb_masculino);
        rb_masculino.setText("Masculino");

        buttonGroup1.add(rbFemenino);
        rbFemenino.setText("Femenino");

        btn_registrar.setText("Registrar");
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        NuevoBtn.setText("Nuevo");
        NuevoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LaIdentificacion)
                            .addComponent(LaNombre)
                            .addComponent(LaApellidos)
                            .addComponent(LaFechaNacimiento)
                            .addComponent(LaSexo))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(NombreTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IdentificaconTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ApellidosTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rb_masculino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                                .addComponent(rbFemenino))
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_registrar)
                        .addGap(18, 18, 18)
                        .addComponent(NuevoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LaIdentificacion)
                    .addComponent(IdentificaconTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LaNombre)
                    .addComponent(NombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LaApellidos)
                    .addComponent(ApellidosTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LaFechaNacimiento)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_masculino)
                    .addComponent(rbFemenino)
                    .addComponent(LaSexo))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_registrar)
                    .addComponent(NuevoBtn))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NuevoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoBtnActionPerformed
        
    }//GEN-LAST:event_NuevoBtnActionPerformed

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        
    }//GEN-LAST:event_btn_registrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField ApellidosTxt;
    public javax.swing.JTextField IdentificaconTxt;
    private javax.swing.JLabel LaApellidos;
    private javax.swing.JLabel LaFechaNacimiento;
    private javax.swing.JLabel LaIdentificacion;
    private javax.swing.JLabel LaNombre;
    private javax.swing.JLabel LaSexo;
    public javax.swing.JTextField NombreTxt;
    public javax.swing.JButton NuevoBtn;
    public javax.swing.JButton btn_registrar;
    public javax.swing.ButtonGroup buttonGroup1;
    public com.toedter.calendar.JDateChooser jDateChooser1;
    public javax.swing.JRadioButton rbFemenino;
    public javax.swing.JRadioButton rb_masculino;
    // End of variables declaration//GEN-END:variables
}
