package Vista;

import javax.swing.table.DefaultTableModel;

public class ConsultarConsultorios extends javax.swing.JInternalFrame {

    public Controlador.GestorConsultorioControl gestorConsultorioControl;
    private DefaultTableModel tabla;

    public ConsultarConsultorios() {
        initComponents();
        gestorConsultorioControl = new Controlador.GestorConsultorioControl(this);
        String titulosTabla[] = {"Identificación", "Nombres"};
        tabla = new DefaultTableModel(null, titulosTabla);
        TablaConsulta.setModel(tabla);
        BConsultar.addActionListener(gestorConsultorioControl);
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
        jLabel1 = new javax.swing.JLabel();
        txtConsulta = new javax.swing.JTextField();
        BConsultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaConsulta = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("CONSULTA CONSULTORIOS");
        setName("JConsultas"); // NOI18N

        buttonGroup1.add(RBIdentificacion);
        RBIdentificacion.setText("Num.Consultorio");
        RBIdentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBIdentificacionActionPerformed(evt);
            }
        });

        buttonGroup1.add(RBNombre);
        RBNombre.setText("Nombres");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Valor a buscar:");

        BConsultar.setText("Consultar");

        TablaConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Numero Consultorio", "Nombres"
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(RBIdentificacion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(RBNombre)))
                        .addGap(18, 18, 18)
                        .addComponent(BConsultar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RBIdentificacion)
                    .addComponent(RBNombre))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BConsultar;
    public javax.swing.JRadioButton RBIdentificacion;
    public javax.swing.JRadioButton RBNombre;
    public javax.swing.JTable TablaConsulta;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField txtConsulta;
    // End of variables declaration//GEN-END:variables
}
