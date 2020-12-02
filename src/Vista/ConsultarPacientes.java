package Vista;

import javax.swing.table.DefaultTableModel;

public class ConsultarPacientes extends javax.swing.JInternalFrame {
    
    public Controlador.GestorPacienteControl gestorPacienteControl;
    private DefaultTableModel tabla;
    

    public ConsultarPacientes() {
        initComponents();
        gestorPacienteControl=new Controlador.GestorPacienteControl(this);
        String titulosTabla[]={"Identificación","Nombres","Apellidos","Fecha Nacimiento","Género"};
        tabla=new DefaultTableModel (null, titulosTabla);
        Tresultados.setModel(tabla);
        Baceptar.addActionListener(gestorPacienteControl);
    }
    public DefaultTableModel getTableModel () {
        return tabla;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Ridentificacion = new javax.swing.JRadioButton();
        Rnombres = new javax.swing.JRadioButton();
        Rapellidos = new javax.swing.JRadioButton();
        Rsexo = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        Txtbusqueda = new javax.swing.JTextField();
        Baceptar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tresultados = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("CONSULTAR PACIENTES ");

        buttonGroup1.add(Ridentificacion);
        Ridentificacion.setText("Identificacion ");

        buttonGroup1.add(Rnombres);
        Rnombres.setText("Nombres");

        buttonGroup1.add(Rapellidos);
        Rapellidos.setText("Apellidos");

        buttonGroup1.add(Rsexo);
        Rsexo.setText("Sexo");

        jLabel1.setText("Valor a buscar:");

        Txtbusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtbusquedaActionPerformed(evt);
            }
        });

        Baceptar.setText("Aceptar");

        Tresultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Identificacion", "Nombre", "Apellido", "Sexo"
            }
        ));
        jScrollPane1.setViewportView(Tresultados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Ridentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Rnombres, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Rapellidos)
                        .addGap(18, 18, 18)
                        .addComponent(Rsexo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Txtbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Baceptar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ridentificacion)
                    .addComponent(Rnombres)
                    .addComponent(Rapellidos)
                    .addComponent(Rsexo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Txtbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Baceptar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtbusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtbusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtbusquedaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Baceptar;
    public javax.swing.JRadioButton Rapellidos;
    public javax.swing.JRadioButton Ridentificacion;
    public javax.swing.JRadioButton Rnombres;
    public javax.swing.JRadioButton Rsexo;
    public javax.swing.JTable Tresultados;
    public javax.swing.JTextField Txtbusqueda;
    public javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
