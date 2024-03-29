package Vista;

public class Registro_consultorio extends javax.swing.JInternalFrame {
    private Controlador.ConsultorioControl consultorioControlador;
    
   

    public Registro_consultorio() {
        initComponents();
        
         initComponents();
        consultorioControlador=new Controlador.ConsultorioControl(this);
        btn_re.addActionListener(consultorioControlador);
        btn_nu.addActionListener(consultorioControlador);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNumconsultorio = new javax.swing.JLabel();
        t_Num = new javax.swing.JTextField();
        lblNombreCon = new javax.swing.JLabel();
        t_Nom = new javax.swing.JTextField();
        btn_re = new javax.swing.JButton();
        btn_nu = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Registro consultorios");
        setOpaque(true);

        lblNumconsultorio.setText("Numero Consultorio:");

        lblNombreCon.setText("Nombre:");

        t_Nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_NomActionPerformed(evt);
            }
        });

        btn_re.setText("Registrar");
        btn_re.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reActionPerformed(evt);
            }
        });

        btn_nu.setText("Nuevo");
        btn_nu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_re)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblNumconsultorio)
                        .addComponent(lblNombreCon)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(t_Num, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                        .addComponent(t_Nom))
                    .addComponent(btn_nu))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumconsultorio)
                    .addComponent(t_Num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_Nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreCon))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_re)
                    .addComponent(btn_nu))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_reActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reActionPerformed

    }//GEN-LAST:event_btn_reActionPerformed

    private void btn_nuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuActionPerformed

        
    }//GEN-LAST:event_btn_nuActionPerformed

    private void t_NomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_NomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_NomActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_nu;
    public javax.swing.JButton btn_re;
    private javax.swing.JLabel lblNombreCon;
    private javax.swing.JLabel lblNumconsultorio;
    public javax.swing.JTextField t_Nom;
    public javax.swing.JTextField t_Num;
    // End of variables declaration//GEN-END:variables
}
