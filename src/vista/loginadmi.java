
package vista;

import controlador.AdministradorDAO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class loginadmi extends javax.swing.JFrame {

    private Login loginFrame; // Referencia al frame Login

    public loginadmi(Login loginFrame) {
        this.loginFrame = loginFrame; // Asignamos el frame Login
        initComponents();
    }
  
    public loginadmi() {
        initComponents();
          setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
         setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        txtcontrasena = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        buttoncrear4 = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/setting.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, -1, -1));
        jPanel1.add(txtcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 180, 30));
        jPanel1.add(txtcontrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 180, 30));

        jLabel1.setText("Contraseña");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, -1, -1));

        jLabel3.setText("Correo");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Administrador");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 170, 40));

        buttoncrear4.setBackground(new java.awt.Color(153, 153, 153));
        buttoncrear4.setForeground(new java.awt.Color(0, 0, 0));
        buttoncrear4.setText("Ingresar");
        buttoncrear4.setBorder(null);
        buttoncrear4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttoncrear4ActionPerformed(evt);
            }
        });
        jPanel1.add(buttoncrear4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 120, 30));
        jPanel1.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttoncrear4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttoncrear4ActionPerformed

        String correo = txtcorreo.getText();
    String contraseña = new String(txtcontrasena.getPassword());
    
    AdministradorDAO administradorDAO = new AdministradorDAO();
    
    if (administradorDAO.validarAdministrador(correo, contraseña)) {
        JOptionPane.showMessageDialog(this, "Ingreso exitoso", "Éxito", JOptionPane.INFORMATION_MESSAGE);
         MenuAdmi menadm = new MenuAdmi();
        menadm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // O DISPOSE_ON_CLOSE si prefieres
        menadm.setLocationRelativeTo(this);
        menadm.setVisible(true); 
        this.dispose(); 
        loginFrame.dispose();
    } else {
        JOptionPane.showMessageDialog(this, "Correo o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_buttoncrear4ActionPerformed

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
            java.util.logging.Logger.getLogger(loginadmi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginadmi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginadmi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginadmi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginadmi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttoncrear;
    private javax.swing.JButton buttoncrear1;
    private javax.swing.JButton buttoncrear2;
    private javax.swing.JButton buttoncrear3;
    private javax.swing.JButton buttoncrear4;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtcontrasena;
    private javax.swing.JTextField txtcorreo;
    // End of variables declaration//GEN-END:variables
}
