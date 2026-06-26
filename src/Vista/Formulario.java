
package Vista;
import Modelo.Embarque;

public class Formulario extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Formulario.class.getName());

    
    public Formulario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDistribuidor = new javax.swing.JTextField();
        cbxtipoLadrillo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbxtipoCamion = new javax.swing.JComboBox<>();
        txtCantodadLadrillos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnReguistrar = new javax.swing.JButton();
        btnNuevoReguistro = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaDatos = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("CODIGO DE EMBARQUE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        txtCodigo.addActionListener(this::txtCodigoActionPerformed);
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 180, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("NOMBRE DISTRIBUIDOR");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));
        jPanel1.add(txtDistribuidor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 180, 40));

        cbxtipoLadrillo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "KING KONG", "PANDERETA" }));
        jPanel1.add(cbxtipoLadrillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 180, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("TIPO DE CAMION ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        cbxtipoCamion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PALETIZADO", "CON GUINCHE" }));
        jPanel1.add(cbxtipoCamion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 180, 50));
        jPanel1.add(txtCantodadLadrillos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 180, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("TIPO DE LADRILLO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 130, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("CANTIDAD DE LADRILLO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        btnReguistrar.setBackground(new java.awt.Color(51, 153, 255));
        btnReguistrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnReguistrar.setForeground(new java.awt.Color(0, 0, 0));
        btnReguistrar.setText("REGUISTRAR ");
        btnReguistrar.addActionListener(this::btnReguistrarActionPerformed);
        jPanel1.add(btnReguistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 200, 50));

        btnNuevoReguistro.setBackground(new java.awt.Color(51, 153, 255));
        btnNuevoReguistro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnNuevoReguistro.setForeground(new java.awt.Color(0, 0, 0));
        btnNuevoReguistro.setText("NUEVO REGUISTRO");
        btnNuevoReguistro.addActionListener(this::btnNuevoReguistroActionPerformed);
        jPanel1.add(btnNuevoReguistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 200, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 220, 530));

        txaDatos.setColumns(20);
        txaDatos.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        txaDatos.setRows(5);
        jScrollPane1.setViewportView(txaDatos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 590, 540));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("DATOS DEL EMBARQUE");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));

        jLabel7.setBackground(new java.awt.Color(153, 153, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("LISTA DE PEDIDOS DE EMBARQUE");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btnNuevoReguistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoReguistroActionPerformed
     
      this.txtCodigo.setText("");
      this.txtDistribuidor.setText("");
      this.cbxtipoLadrillo.setSelectedIndex(0);
      this.cbxtipoCamion.setSelectedIndex(0);
      this.txtCantodadLadrillos.setText("");
      this.txtCodigo.requestFocus();
                       
    }//GEN-LAST:event_btnNuevoReguistroActionPerformed

    private void btnReguistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReguistrarActionPerformed
     // CREAMOS EL OBJETO
     Embarque e= new Embarque();
     // actualizaremos los atributos de la clase (setter)
     e.setCodigo(this.txtCodigo.getText());
     e.setDistribuidor(this.txtDistribuidor.getText());
     e.setTipoLadrillo(this.cbxtipoLadrillo.getSelectedItem().toString());
     e.setTipoCamion(this.cbxtipoCamion.getSelectedItem().toString());
     e.setCantLadrillos(Integer.parseInt(this.txtCantodadLadrillos.getText()));
     // MOSTRANDO LOS DATOS EN EL OBJETO TEXTAREA
    this.txaDatos.append(e.MostrarDatos()); 
        
        
        
    }//GEN-LAST:event_btnReguistrarActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Formulario().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNuevoReguistro;
    private javax.swing.JButton btnReguistrar;
    private javax.swing.JComboBox<String> cbxtipoCamion;
    private javax.swing.JComboBox<String> cbxtipoLadrillo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txaDatos;
    private javax.swing.JTextField txtCantodadLadrillos;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDistribuidor;
    // End of variables declaration//GEN-END:variables
}
