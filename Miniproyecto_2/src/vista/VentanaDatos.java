/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import actores.Jugador;
import javax.swing.JOptionPane;

/**
 *
 * @author aleja
 */
public class VentanaDatos extends javax.swing.JFrame {
    /**
     * Creates new form ventanaDatos
     */
    public VentanaDatos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIngresoNombre = new javax.swing.JLabel();
        txtFieldNombre = new javax.swing.JTextField();
        btnOk = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIngresoNombre.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        lblIngresoNombre.setForeground(new java.awt.Color(0, 102, 51));
        lblIngresoNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIngresoNombre.setText("INGRESE SU NOMBRE");
        getContentPane().add(lblIngresoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 430, 50));

        txtFieldNombre.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        txtFieldNombre.setForeground(new java.awt.Color(0, 102, 102));
        txtFieldNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFieldNombre.setText("JUGADOR 1");
        txtFieldNombre.setCaretColor(new java.awt.Color(255, 255, 204));
        txtFieldNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFieldNombreMouseClicked(evt);
            }
        });
        txtFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 300, -1));

        btnOk.setBackground(new java.awt.Color(255, 255, 204));
        btnOk.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        btnOk.setForeground(new java.awt.Color(0, 102, 51));
        btnOk.setText("OK");
        btnOk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOkMouseClicked(evt);
            }
        });
        getContentPane().add(btnOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 130, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldNombreActionPerformed

    private void btnOkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOkMouseClicked
        // TODO add your handling code here:
        if("JUGADOR 1".equals(txtFieldNombre.getText()) || "".equals(txtFieldNombre.getText())){
           JOptionPane.showMessageDialog(this, "Ingresa un nombre valido", "", 1);
        }else{
            VentanaJuego.jugador.setNombre(txtFieldNombre.getText());
            this.dispose();
            VentanaJuego unaVentanaJuego = new VentanaJuego();
            unaVentanaJuego.setVisible(true);
        }

    }//GEN-LAST:event_btnOkMouseClicked

    private void txtFieldNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFieldNombreMouseClicked
        // TODO add your handling code here:
        txtFieldNombre.setText("");
    }//GEN-LAST:event_txtFieldNombreMouseClicked

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
            java.util.logging.Logger.getLogger(VentanaDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaDatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOk;
    private javax.swing.JLabel lblIngresoNombre;
    private javax.swing.JTextField txtFieldNombre;
    // End of variables declaration//GEN-END:variables
}
