/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import java.io.IOException;
import clases.ExportaExcel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import clases.Gobal;
import clases.Empleados;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;

/**
 *
 * @author User
 */
public class ListarFinal extends javax.swing.JFrame {

    Gobal datos = new Gobal();
    DefaultTableModel mdlTabla;
    Vector Columnas =  new Vector();

    ExportaExcel eport = new ExportaExcel();

    /**
     * Creates new form NewJFrame
     */
    public ListarFinal() {
        initComponents();
        this.setLocationRelativeTo(null);
        

        mdlTabla = new DefaultTableModel(Columnas, 0);
        tblListar.setModel(mdlTabla);
        cargar();
        TextPrompt prueba = new TextPrompt("SELECCIONE UN FORMATO A EXPORTAR ", txtBuscar);
    }

    public  void cargar() {

       // jComboBox1.setModel(new DefaultComboBoxModel<>(columnas));
        tblListar.setModel(datos.listarDaotos());
    }
   
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgGenerar = new javax.swing.ButtonGroup();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jbExcel = new javax.swing.JRadioButton();
        jbPdf = new javax.swing.JRadioButton();
        btGenerar = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListar = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        cbFiltro = new javax.swing.JComboBox<>();
        txtBuscar = new javax.swing.JTextField();
        btBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(108, 115, 133));
        setMinimumSize(new java.awt.Dimension(530, 560));
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(108, 115, 133));
        jPanel1.setMaximumSize(new java.awt.Dimension(530, 560));
        jPanel1.setMinimumSize(new java.awt.Dimension(530, 560));
        jPanel1.setPreferredSize(new java.awt.Dimension(530, 560));

        bgGenerar.add(jbExcel);
        jbExcel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbExcel.setText("EXCEL");

        bgGenerar.add(jbPdf);
        jbPdf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbPdf.setText("PDF");

        btGenerar.setBackground(new java.awt.Color(0, 49, 105));
        btGenerar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btGenerar.setForeground(new java.awt.Color(255, 255, 255));
        btGenerar.setText("GENERAR");
        btGenerar.setPreferredSize(new java.awt.Dimension(93, 24));
        btGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGenerarActionPerformed(evt);
            }
        });

        btSalir.setBackground(new java.awt.Color(0, 49, 105));
        btSalir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btSalir.setForeground(new java.awt.Color(255, 255, 255));
        btSalir.setText("SALIR");
        btSalir.setPreferredSize(new java.awt.Dimension(93, 24));
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 49, 105));
        jPanel2.setForeground(new java.awt.Color(108, 115, 133));
        jPanel2.setAutoscrolls(true);
        jPanel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.setMaximumSize(new java.awt.Dimension(346, 46));
        jPanel2.setMinimumSize(new java.awt.Dimension(346, 46));
        jPanel2.setName(""); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(560, 44));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LISTA DE EMPLEADOS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        tblListar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblListar.setToolTipText("");
        tblListar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblListar);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FORMATO A EXPORTAR");
        jLabel2.setPreferredSize(new java.awt.Dimension(150, 30));

        cbFiltro.setBackground(new java.awt.Color(0, 49, 105));
        cbFiltro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "NOMBRE", "APELLIDO", "CODIGO", "IDENTIFICACION" }));
        cbFiltro.setPreferredSize(new java.awt.Dimension(150, 30));
        cbFiltro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbFiltroItemStateChanged(evt);
            }
        });
        cbFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFiltroActionPerformed(evt);
            }
        });

        txtBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(200, 196, 225));
        txtBuscar.setPreferredSize(new java.awt.Dimension(160, 30));
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

        btBuscar.setBackground(new java.awt.Color(0, 49, 105));
        btBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btBuscar.setText("BUSCAR");
        btBuscar.setPreferredSize(new java.awt.Dimension(93, 24));
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("FILTRO DE BUSQUEDA");
        jLabel3.setPreferredSize(new java.awt.Dimension(150, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jbExcel)
                        .addGap(69, 69, 69)
                        .addComponent(jbPdf)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(159, 159, 159))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(btBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbPdf)
                    .addComponent(jbExcel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        // TODO add your handling code here:
        Menu_P2 menu = new Menu_P2();

        this.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_btSalirActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        // TODO add your handling code here:

        if (txtBuscar.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "DEBE INGRESAR  ");
        } else {
            System.out.println("hi");
        }
    }//GEN-LAST:event_btBuscarActionPerformed
    int xx;
    int xy;
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed

        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_formMouseDragged

    private void btGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGenerarActionPerformed
        // TODO add your handling code here:

        if (jbExcel.isSelected()) {
            ExportaExcel obj1;

            try {
                obj1 = new ExportaExcel();
                obj1.exportarExcel(tblListar);
            } catch (IOException ex) {
                System.out.println("Error: " + ex);
            }
        }
        if (jbPdf.isSelected()) {

//            PDFExportador obj;
//            obj = new PDFExportador();
//            obj.CrearPDF(jTablaExporta);
//            
        }
        if (bgGenerar.isSelected(null)) {
            JOptionPane.showMessageDialog(rootPane, "SELECCIONE UN FORMATO A EXPORTAR ");
        }


    }//GEN-LAST:event_btGenerarActionPerformed

    private void cbFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbFiltroActionPerformed

    private void cbFiltroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbFiltroItemStateChanged
        String op = cbFiltro.getSelectedItem().toString();

        if (op.equals("SELECCIONE")) {
            txtBuscar.setText(null);
            txtBuscar.setEditable(false);
            txtBuscar.requestFocus();

        }
        if (op.equals("NOMBRE")) {
            txtBuscar.setText(null);
            txtBuscar.setEditable(true);
            txtBuscar.requestFocus();
            TextPrompt prueba = new TextPrompt("jeremy ", txtBuscar);

        }
        if (op.equals("APELLIDO")) {

            txtBuscar.setText(null);
            txtBuscar.setEditable(true);
            txtBuscar.requestFocus();

        }
        if (op.equals("CODIGO")) {
            txtBuscar.setText(null);
            txtBuscar.setEditable(true);
            txtBuscar.requestFocus();

        }
        if (op.equals("IDENTIFICACION")) {
            txtBuscar.setText(null);
            txtBuscar.setEditable(true);
            txtBuscar.requestFocus();

        }


    }//GEN-LAST:event_cbFiltroItemStateChanged

    private void tblListarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListarMouseClicked
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_tblListarMouseClicked

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
            java.util.logging.Logger.getLogger(ListarFinal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarFinal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarFinal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarFinal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarFinal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgGenerar;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btGenerar;
    private javax.swing.JButton btSalir;
    private javax.swing.JComboBox<String> cbFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton jbExcel;
    private javax.swing.JRadioButton jbPdf;
    private javax.swing.JTable tblListar;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
