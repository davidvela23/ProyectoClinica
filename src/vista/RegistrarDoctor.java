
package vista;
import controlador.DoctorDAO;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Departamentos;

public class RegistrarDoctor extends javax.swing.JFrame {

  private Departamentos departamentos;
    public RegistrarDoctor() {
        initComponents();
        
        departamentos = new Departamentos();
    llenarComboDepartamentos();
    }

    private void llenarComboDepartamentos() {
    for (String dep : departamentos.getDepartamentos()) {
        combodep.addItem(dep);
    }

    // Agregar un ActionListener al JComboBox de departamentos
    combodep.addActionListener(e -> llenarComboDistritos());
}

// Método para llenar el JComboBox de distritos según el departamento seleccionado
private void llenarComboDistritos() {
    combodis.removeAllItems(); // Limpiar el JComboBox
    List<String> distritos = departamentos.getDistritos((String) combodep.getSelectedItem());
    for (String dis : distritos) {
        combodis.addItem(dis);
    }
}
  
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        txtdni = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        comboesp = new javax.swing.JComboBox<>();
        combodep = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        combodis = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        buttoneliminar = new javax.swing.JButton();
        buttonbuscar = new javax.swing.JButton();
        buttonactualizar = new javax.swing.JButton();
        buttoncrear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo-EsSalud.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 400, 90));
        jPanel1.add(txtcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 210, -1));
        jPanel1.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 210, -1));
        jPanel1.add(txtapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 210, -1));
        jPanel1.add(txtdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 210, -1));
        jPanel1.add(txtdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 440, 210, -1));

        comboesp.setBackground(new java.awt.Color(153, 153, 153));
        comboesp.setForeground(new java.awt.Color(0, 0, 0));
        comboesp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Obstetricia", "Ginecólogia", "Dermatología", "Odontología", "Medicina General", "Psicología", "Urología" }));
        jPanel1.add(comboesp, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 200, 30));

        combodep.setBackground(new java.awt.Color(153, 153, 153));
        combodep.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(combodep, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 130, 30));

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Especialidad ");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Apellido");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, -1, -1));

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Dirección:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, -1, -1));

        jLabel16.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("DNI");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jLabel17.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Correo");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, -1, -1));

        jLabel18.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Telefono");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 760, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Información");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 160, 40));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Sede");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 90, 40));

        jLabel19.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Nombre");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        combodis.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.add(combodis, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 130, 30));

        jLabel20.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Departamento");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));
        jPanel1.add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 210, -1));

        jLabel21.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Distrito");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, -1, -1));

        buttoneliminar.setText("Eliminar");
        buttoneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttoneliminarActionPerformed(evt);
            }
        });
        jPanel1.add(buttoneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 620, 90, 40));

        buttonbuscar.setText("Buscar");
        buttonbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonbuscarActionPerformed(evt);
            }
        });
        jPanel1.add(buttonbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, -1, -1));

        buttonactualizar.setText("Actualizar");
        buttonactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonactualizarActionPerformed(evt);
            }
        });
        jPanel1.add(buttonactualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 620, 100, 40));

        buttoncrear.setText("Crear");
        buttoncrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttoncrearActionPerformed(evt);
            }
        });
        jPanel1.add(buttoncrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 620, 90, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 749, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttoneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttoneliminarActionPerformed
   
        String dni = txtdni.getText();
    
    DoctorDAO doctorDAO = new DoctorDAO();
    if (doctorDAO.eliminarDoctor(dni)) {
        JOptionPane.showMessageDialog(this, "Doctor eliminado con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(this, "Error al eliminar doctor.", "Error", JOptionPane.ERROR_MESSAGE);
    }
        
    }//GEN-LAST:event_buttoneliminarActionPerformed

    private void buttonactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonactualizarActionPerformed
    String nombre = txtnombre.getText();
    String apellido = txtapellido.getText();
    String dni = txtdni.getText();
    String direccion = txtdireccion.getText();
    String correo = txtcorreo.getText();
    String telefono = txttelefono.getText();
    String especialidad = (String) comboesp.getSelectedItem();
    String departamento = (String) combodep.getSelectedItem();
    String distrito = (String) combodis.getSelectedItem();
    
    DoctorDAO doctorDAO = new DoctorDAO();
    if (doctorDAO.actualizarDoctor(nombre, apellido, dni, direccion, correo, telefono, especialidad, departamento, distrito)) {
        JOptionPane.showMessageDialog(this, "Doctor actualizado con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(this, "Error al actualizar doctor.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_buttonactualizarActionPerformed

    private void buttoncrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttoncrearActionPerformed
        String nombre = txtnombre.getText();
    String apellido = txtapellido.getText();
    String dni = txtdni.getText();
    String direccion = txtdireccion.getText();
    String correo = txtcorreo.getText();
    String telefono = txttelefono.getText();
    String especialidad = (String) comboesp.getSelectedItem();
    String departamento = (String) combodep.getSelectedItem();
    String distrito = (String) combodis.getSelectedItem();
    
    DoctorDAO doctorDAO = new DoctorDAO();
    if (doctorDAO.crearDoctor(nombre, apellido, dni, direccion, correo, telefono, especialidad, departamento, distrito)) {
        JOptionPane.showMessageDialog(this, "Doctor creado con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(this, "Error al crear doctor.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_buttoncrearActionPerformed

    private void buttonbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonbuscarActionPerformed


       
    String dni = txtdni.getText();
    DoctorDAO doctorDAO = new DoctorDAO();
    String[] doctor = doctorDAO.obtenerDoctorPorDNI(dni);
    
    if (doctor != null) {
        // Llenar los campos con la información del doctor
        txtnombre.setText(doctor[0]);         // Nombre
        txtapellido.setText(doctor[1]);       // Apellido
        txtdireccion.setText(doctor[2]);      // Dirección
        txtcorreo.setText(doctor[3]);         // Correo
        txttelefono.setText(doctor[4]);       // Teléfono
        comboesp.setSelectedItem(doctor[5]);  // Especialidad
        combodep.setSelectedItem(doctor[6]);  // Departamento
        combodis.setSelectedItem(doctor[7]);   // Distrito
    } else {
        System.out.println("Doctor no encontrado.");
        // Opcionalmente puedes mostrar un mensaje al usuario
        JOptionPane.showMessageDialog(this, "Doctor no encontrado.");
    }







    }//GEN-LAST:event_buttonbuscarActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarDoctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonactualizar;
    private javax.swing.JButton buttonbuscar;
    private javax.swing.JButton buttoncrear;
    private javax.swing.JButton buttoneliminar;
    private javax.swing.JComboBox<String> combodep;
    private javax.swing.JComboBox<String> combodis;
    private javax.swing.JComboBox<String> comboesp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
