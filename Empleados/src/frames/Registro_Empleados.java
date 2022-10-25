/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frames;

import javax.swing.JOptionPane;
import clases.Empleados;
import clases.Gobal;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;

/**
 *
 * @author jerem
 */
public class Registro_Empleados extends javax.swing.JFrame {

    Empleados empleado = new Empleados();
    Gobal clases = new Gobal();

    public Registro_Empleados() {
        initComponents();
        lbFecha.setText(clases.getFecha());
        //datos.Cargar();
        txtCodigo.setText(Integer.toString(clases.getCodigo()));
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnRegistro_E = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        lbApellido1 = new javax.swing.JLabel();
        lbApellido2 = new javax.swing.JLabel();
        cbID = new javax.swing.JComboBox<>();
        lbCodigo = new javax.swing.JLabel();
        lbPuesto = new javax.swing.JLabel();
        lbSalario = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        txtSalario = new javax.swing.JTextField();
        cbPuesto = new javax.swing.JComboBox<>();
        txtCodigo = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        txtAp2 = new javax.swing.JTextField();
        txtAp1 = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        lbFecha = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnRegistro_E.setBackground(new java.awt.Color(108, 115, 133));

        jPanel1.setBackground(new java.awt.Color(0, 49, 105));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRO DE EMPLEADOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        lbNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbNombre.setForeground(new java.awt.Color(255, 255, 255));
        lbNombre.setText("NOMBRE");

        lbApellido1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbApellido1.setForeground(new java.awt.Color(255, 255, 255));
        lbApellido1.setText("APELLIDO 1");

        lbApellido2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbApellido2.setForeground(new java.awt.Color(255, 255, 255));
        lbApellido2.setText("APELLIDO 2");

        cbID.setBackground(new java.awt.Color(108, 115, 133));
        cbID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbID.setForeground(new java.awt.Color(255, 255, 255));
        cbID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IDENTIFICACION", "CEDULA", "DIMEX", "PASAPORTE" }));
        cbID.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbCodigo.setForeground(new java.awt.Color(255, 255, 255));
        lbCodigo.setText("CODIGO");

        lbPuesto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbPuesto.setForeground(new java.awt.Color(255, 255, 255));
        lbPuesto.setText("PUESTO");

        lbSalario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbSalario.setForeground(new java.awt.Color(255, 255, 255));
        lbSalario.setText("SALARIO");

        btnSalir.setBackground(new java.awt.Color(0, 49, 105));
        btnSalir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        txtSalario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        cbPuesto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbPuesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "GERENTE", "SUPERVISOR", "ADMINISTRADOR", "CORDINADOR" }));

        txtCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtAp2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtAp1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lbFecha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbFecha.setForeground(new java.awt.Color(255, 255, 255));

        btnGuardar.setBackground(new java.awt.Color(0, 49, 105));
        btnGuardar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnRegistro_ELayout = new javax.swing.GroupLayout(pnRegistro_E);
        pnRegistro_E.setLayout(pnRegistro_ELayout);
        pnRegistro_ELayout.setHorizontalGroup(
            pnRegistro_ELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRegistro_ELayout.createSequentialGroup()
                .addGap(41, 85, Short.MAX_VALUE)
                .addGroup(pnRegistro_ELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnRegistro_ELayout.createSequentialGroup()
                        .addGroup(pnRegistro_ELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnRegistro_ELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAp1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnRegistro_ELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(pnRegistro_ELayout.createSequentialGroup()
                            .addComponent(lbSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnRegistro_ELayout.createSequentialGroup()
                            .addComponent(lbPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnRegistro_ELayout.createSequentialGroup()
                            .addComponent(lbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnRegistro_ELayout.createSequentialGroup()
                            .addGroup(pnRegistro_ELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(87, 87, 87)
                            .addGroup(pnRegistro_ELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtAp2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(82, 82, 82))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnRegistro_ELayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnRegistro_ELayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addContainerGap())
        );
        pnRegistro_ELayout.setVerticalGroup(
            pnRegistro_ELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRegistro_ELayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(pnRegistro_ELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnRegistro_ELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAp1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnRegistro_ELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAp2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnRegistro_ELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnRegistro_ELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnRegistro_ELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnRegistro_ELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(pnRegistro_ELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnGuardar))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnRegistro_E, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnRegistro_E, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        if (espacios() == true) {
            int option = JOptionPane.showConfirmDialog(null, "Esta seguro de guardar los datos ingresados");

            if (option == 0) {

                empleado.setNombre(txtNombre.getText());
                empleado.setApellido(txtAp1.getText());
                empleado.setApellido2(txtAp2.getText());
                empleado.setTipo_Id(cbID.getName());
                empleado.setId(txtID.getText());
                //empleado.setCodEmpleado(cbPuesto.getPrototypeDisplayValue());
                empleado.setPuesto(Integer.toString(cbPuesto.getSelectedIndex()));
                empleado.setSalario(Integer.parseInt(txtSalario.getText()));

                try {
                    // txtDb();
                    clases.archivo(empleado);
                } catch (IOException ex) {
                    java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }

                txtNombre.setText(" ");
                txtAp1.setText("");
                txtAp2.setText("");

                txtID.setText("");
                txtCodigo.setText(" ");
                txtSalario.setText("");
                cbPuesto.setToolTipText("");
                //  archivo();
            } else {
                //espacios();
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        Menu menu = new Menu();
        this.setVisible(false);
        menu.setVisible(true);

    }//GEN-LAST:event_btnSalirActionPerformed

    public void guardar() {
        if (espacios() == true) {
            int option = JOptionPane.showConfirmDialog(null, "Esta seguro de guardar los datos ingresados");

            if (option == 0) {

                empleado.setNombre(txtNombre.getText());
                empleado.setApellido(txtAp1.getText());
                empleado.setApellido2(txtAp2.getText());
                empleado.setTipo_Id(cbID.getName());
                empleado.setId(txtID.getText());
                //empleado.setCodEmpleado(cbPuesto.getPrototypeDisplayValue());
                empleado.setPuesto(Integer.toString(cbPuesto.getSelectedIndex()));
                empleado.setSalario(Integer.parseInt(txtSalario.getText()));

                try {
                    // txtDb();
                    clases.archivo(empleado);
                } catch (IOException ex) {
                    java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }

                txtNombre.setText(" ");
                txtAp1.setText("");
                txtAp2.setText("");

                txtID.setText("");
                txtCodigo.setText(" ");
                txtSalario.setText("");
                cbPuesto.setToolTipText("");
                //  archivo();
            } else {
                // espacios();
            }
        }

    }
    // se creara una funcion  para verificar que los campos no esten vacios

    public boolean espacios() {
        boolean option = true;

        if ((txtNombre.getText() == null) || (txtAp1.getText() == null) || (txtAp2.getText() == null)
                || (cbID.getName() == null) || (txtID.getText() == null) || (Integer.toString(cbPuesto.getSelectedIndex()) == null)
                || (txtSalario.getText()) == null) {

            JOptionPane.showMessageDialog(null, "Lo sentimos se produjo un ERROR favor revisar los campos ");
            option = false;

        }
        return option;
    }

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
            java.util.logging.Logger.getLogger(Registro_Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro_Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro_Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro_Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro_Empleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbID;
    private javax.swing.JComboBox<String> cbPuesto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbApellido1;
    private javax.swing.JLabel lbApellido2;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbFecha;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbPuesto;
    private javax.swing.JLabel lbSalario;
    private javax.swing.JPanel pnRegistro_E;
    private javax.swing.JTextField txtAp1;
    private javax.swing.JTextField txtAp2;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSalario;
    // End of variables declaration//GEN-END:variables
}
