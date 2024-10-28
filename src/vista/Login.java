
package vista;
import controlador.UsuarioDAO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Login extends javax.swing.JFrame {

 public static String dniUsuarioLogueado;
    public Login() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        txtcontrasena = new javax.swing.JPasswordField();
        bottoningresar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        button = new javax.swing.JButton();
        admin = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jDesktopPane2 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo-EsSalud.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 430, 90));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("BIENVENIDO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 290, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo-usuario.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 150, 150));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("USUARIO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("CONTRASEÑA");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, -1, -1));
        jPanel1.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 220, -1));
        jPanel1.add(txtcontrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 220, -1));

        bottoningresar.setText("INGRESAR");
        bottoningresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottoningresarActionPerformed(evt);
            }
        });
        jPanel1.add(bottoningresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 330, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("¿Aún no tienes una cuenta?");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 200, -1));

        button.setBackground(new java.awt.Color(153, 153, 153));
        button.setForeground(new java.awt.Color(0, 0, 0));
        button.setText("CREAR CUENTA");
        button.setBorder(null);
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });
        jPanel1.add(button, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, 340, 30));

        admin.setText("Administrador");
        admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminActionPerformed(evt);
            }
        });
        jPanel1.add(admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, -1, -1));
        jPanel1.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, -1, -1));
        jPanel1.add(jDesktopPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 380, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bottoningresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottoningresarActionPerformed

        String dni = txtusuario.getText();
    String contrasena = new String(txtcontrasena.getPassword());
 
    UsuarioDAO usuarioDAO = new UsuarioDAO();
    boolean esValido = usuarioDAO.validarUsuario(dni, contrasena);
    if (esValido) {
       
        dniUsuarioLogueado = dni;
        JOptionPane.showMessageDialog(this, "Ingreso exitoso", "Éxito", JOptionPane.INFORMATION_MESSAGE);
          MenuPaciente mepac = new MenuPaciente();
        mepac.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // O DISPOSE_ON_CLOSE si prefieres
        mepac.setLocationRelativeTo(this);
        mepac.setVisible(true); 
        this.dispose(); 
    } else {
        JOptionPane.showMessageDialog(this, "DNI o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
    }
        
        

    }//GEN-LAST:event_bottoningresarActionPerformed

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed

        
     
    RegistroUsuario registrarUsuarioFrame = new RegistroUsuario();
    registrarUsuarioFrame.setLocationRelativeTo(this);
    registrarUsuarioFrame.setVisible(true);
    }//GEN-LAST:event_buttonActionPerformed

    private void adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminActionPerformed
       loginadmi loginUsuarioFrame = new loginadmi(this);
       loginUsuarioFrame.setLocationRelativeTo(this);
    loginUsuarioFrame.setVisible(true);
    }//GEN-LAST:event_adminActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton admin;
    private javax.swing.JButton bottoningresar;
    private javax.swing.JButton button;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtcontrasena;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
