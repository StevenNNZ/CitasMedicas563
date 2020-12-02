package Vista;

import javax.swing.JOptionPane;

public class PrincipalJFrame extends javax.swing.JFrame {
    RegPaciente regPaciente;
    ConsultarPacientes consultarPaciente;
    Registrar_medico regMedico;
    Registro_consultorio regConsultorio;
    ConsultarConsultorios consConsultorio;
    
    public PrincipalJFrame() {
        regPaciente=new RegPaciente();
        consultarPaciente=new ConsultarPacientes();
        regMedico=new Registrar_medico();
        regConsultorio=new Registro_consultorio();
        
        consConsultorio=new ConsultarConsultorios();
        add (consConsultorio);
        add(regConsultorio);
        add(regMedico);
        add (regPaciente);
        add (consultarPaciente);
        
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        JMArchivo = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        JMPacientes = new javax.swing.JMenu();
        IRegistrar = new javax.swing.JMenuItem();
        IConsultar = new javax.swing.JMenuItem();
        JMMedicos = new javax.swing.JMenu();
        MIconsultar_medico = new javax.swing.JMenuItem();
        MIregistrar_medico = new javax.swing.JMenuItem();
        JMConsultorio = new javax.swing.JMenu();
        MIregistrar_consultorio = new javax.swing.JMenuItem();
        MIConsultar_consultorio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GESTIÓN DE CITAS");
        setName("PrincipalJFrame"); // NOI18N

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        JMArchivo.setText("Archivo");

        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        JMArchivo.add(jMenuItem1);

        jMenuBar1.add(JMArchivo);

        JMPacientes.setText("Pacientes");

        IRegistrar.setText("Registrar");
        IRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IRegistrarActionPerformed(evt);
            }
        });
        JMPacientes.add(IRegistrar);

        IConsultar.setText("Consultar");
        IConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IConsultarActionPerformed(evt);
            }
        });
        JMPacientes.add(IConsultar);

        jMenuBar1.add(JMPacientes);

        JMMedicos.setText("Medicos");

        MIconsultar_medico.setText("Consultar");
        MIconsultar_medico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIconsultar_medicoActionPerformed(evt);
            }
        });
        JMMedicos.add(MIconsultar_medico);

        MIregistrar_medico.setText("Registrar");
        MIregistrar_medico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIregistrar_medicoActionPerformed(evt);
            }
        });
        JMMedicos.add(MIregistrar_medico);

        jMenuBar1.add(JMMedicos);

        JMConsultorio.setText("Consultorios");

        MIregistrar_consultorio.setText("Registrar");
        MIregistrar_consultorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIregistrar_consultorioActionPerformed(evt);
            }
        });
        JMConsultorio.add(MIregistrar_consultorio);

        MIConsultar_consultorio.setText("Consultar");
        MIConsultar_consultorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIConsultar_consultorioActionPerformed(evt);
            }
        });
        JMConsultorio.add(MIConsultar_consultorio);

        jMenuBar1.add(JMConsultorio);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    JOptionPane.showMessageDialog(null, "¡Gracias por utilizar nuestros servicios!");
    System.exit (0);   
    
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void IRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IRegistrarActionPerformed
        regPaciente.setVisible(true);
       
        
    }//GEN-LAST:event_IRegistrarActionPerformed

    private void IConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IConsultarActionPerformed
        consultarPaciente.setVisible(true);
    }//GEN-LAST:event_IConsultarActionPerformed

    private void MIregistrar_medicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIregistrar_medicoActionPerformed
        regMedico.setVisible(true);
    }//GEN-LAST:event_MIregistrar_medicoActionPerformed

    private void MIconsultar_medicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIconsultar_medicoActionPerformed
        ConsultarMedicos registro = new ConsultarMedicos();
       escritorio.add(registro);
       registro.show();
    }//GEN-LAST:event_MIconsultar_medicoActionPerformed

    private void MIregistrar_consultorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIregistrar_consultorioActionPerformed
        Registro_consultorio registro = new Registro_consultorio();
       escritorio.add(registro);
       registro.show();
    }//GEN-LAST:event_MIregistrar_consultorioActionPerformed

    private void MIConsultar_consultorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIConsultar_consultorioActionPerformed
       ConsultarConsultorios registro = new ConsultarConsultorios();
       escritorio.add(registro);
       registro.show();
    }//GEN-LAST:event_MIConsultar_consultorioActionPerformed
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PrincipalJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem IConsultar;
    private javax.swing.JMenuItem IRegistrar;
    private javax.swing.JMenu JMArchivo;
    private javax.swing.JMenu JMConsultorio;
    private javax.swing.JMenu JMMedicos;
    private javax.swing.JMenu JMPacientes;
    private javax.swing.JMenuItem MIConsultar_consultorio;
    private javax.swing.JMenuItem MIconsultar_medico;
    private javax.swing.JMenuItem MIregistrar_consultorio;
    private javax.swing.JMenuItem MIregistrar_medico;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
