
package vista;

import controlador.UsuarioDAO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.Usuario;

public class RegistroDatos extends javax.swing.JFrame {

 
    public RegistroDatos() {
        initComponents();
        // Añadir los radio buttons al ButtonGroup
buttonGroup1.add(radioyo);
buttonGroup1.add(radiootro);

    }
// Añadir los radio buttons al ButtonGroup



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtapellidos = new javax.swing.JTextField();
        txtnumero = new javax.swing.JTextField();
        txtdni = new javax.swing.JTextField();
        buttonenviar = new javax.swing.JButton();
        radiootro = new javax.swing.JRadioButton();
        radioyo = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo-EsSalud.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 420, 90));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Registrar Datos Paciente");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 290, 40));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Apellidos");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, -1, -1));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Numero telefónico");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, -1, -1));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("DNI/CE");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, -1, -1));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Correo Electrónico");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, -1, -1));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Nombres");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        txtcorreo.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.add(txtcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 190, 30));

        txtnombre.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 190, 30));

        txtapellidos.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.add(txtapellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 190, 30));

        txtnumero.setBackground(new java.awt.Color(153, 153, 153));
        txtnumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumeroActionPerformed(evt);
            }
        });
        jPanel1.add(txtnumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 190, 30));

        txtdni.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.add(txtdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, 190, 30));

        buttonenviar.setText("Enviar");
        buttonenviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonenviarActionPerformed(evt);
            }
        });
        jPanel1.add(buttonenviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, 80, 30));

        radiootro.setBackground(new java.awt.Color(204, 204, 204));
        radiootro.setForeground(new java.awt.Color(0, 0, 0));
        radiootro.setText("Otro");
        radiootro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiootroActionPerformed(evt);
            }
        });
        jPanel1.add(radiootro, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, -1, -1));

        radioyo.setBackground(new java.awt.Color(204, 204, 204));
        radioyo.setForeground(new java.awt.Color(0, 0, 0));
        radioyo.setText("Yo");
        radioyo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioyoActionPerformed(evt);
            }
        });
        jPanel1.add(radioyo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioyoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioyoActionPerformed
      
         String dniLogueado = Login.dniUsuarioLogueado;
         
             
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuario = usuarioDAO.obtenerDatosUsuario(dniLogueado);

        if (usuario != null) {
         
            txtnombre.setText(usuario.getNombres());
            txtapellidos.setText(usuario.getApellidos());
            txtnumero.setText(usuario.getTelefono());
            txtdni.setText(usuario.getDni());
            txtcorreo.setText(usuario.getCorreo());
        } else {
            JOptionPane.showMessageDialog(this, "No se encontraron los datos del usuario", "Error", JOptionPane.ERROR_MESSAGE);
        }
         
         
         
    
    }//GEN-LAST:event_radioyoActionPerformed

    private void radiootroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiootroActionPerformed
      txtnombre.setText("");
        txtapellidos.setText("");
        txtnumero.setText("");
        txtdni.setText("");
        txtcorreo.setText("");
    }//GEN-LAST:event_radiootroActionPerformed

    private void buttonenviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonenviarActionPerformed
  
          Doctores doc = new Doctores();
        doc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // O DISPOSE_ON_CLOSE si prefieres
        doc.setLocationRelativeTo(this); 
        
        doc.setVisible(true); 
        this.dispose(); // Cerrar el frame Entrada
        
        
        
        
        
        
        
    }//GEN-LAST:event_buttonenviarActionPerformed

    private void txtnumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumeroActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(RegistroDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroDatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton buttonenviar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton radiootro;
    private javax.swing.JRadioButton radioyo;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnumero;
    // End of variables declaration//GEN-END:variables
}
