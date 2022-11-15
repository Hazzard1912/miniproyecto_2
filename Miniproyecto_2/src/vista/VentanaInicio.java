/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

/**
 *
 * @authors: Jhonnier Hernandez Juan Cifuentes Alejandra Carvajal
 */
public class VentanaInicio extends javax.swing.JFrame {

    /**
     * Creates new form ventanaInicio
     */
    public VentanaInicio() {
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

        lblJugar = new javax.swing.JLabel();
        lblComoJugar = new javax.swing.JLabel();
        lblParaQueSirve = new javax.swing.JLabel();
        pnlBackground = new javax.swing.JPanel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblJugar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblJugar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblJugarMouseClicked(evt);
            }
        });
        getContentPane().add(lblJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 220, 80));

        lblComoJugar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblComoJugar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblComoJugarMouseClicked(evt);
            }
        });
        getContentPane().add(lblComoJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 180, 120));

        lblParaQueSirve.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblParaQueSirve.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblParaQueSirveMouseClicked(evt);
            }
        });
        getContentPane().add(lblParaQueSirve, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 320, 230, 120));

        pnlBackground.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlBackgroundMouseClicked(evt);
            }
        });
        pnlBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/background/backgroundInicio.png"))); // NOI18N
        pnlBackground.add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        getContentPane().add(pnlBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblJugarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJugarMouseClicked
        //Debe ejecutar la ventana datos.
        lblJugar.setVisible(false);
        VentanaDatos unaVentanaDatos = new VentanaDatos();
        unaVentanaDatos.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_lblJugarMouseClicked

    private void lblComoJugarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblComoJugarMouseClicked
        // TODO add your handling code here:
        //Debe ejecutar la ventana como jugar
        VentanaComoJugar unaVentanaComoJugar = new VentanaComoJugar();
        unaVentanaComoJugar.setVisible(true);
    }//GEN-LAST:event_lblComoJugarMouseClicked

    private void lblParaQueSirveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblParaQueSirveMouseClicked
        // TODO add your handling code here:
        //debe ejecutar la ventana para que sirve
        VentanaParaQueSirve unaVentanaParaQueSirve = new VentanaParaQueSirve();
        unaVentanaParaQueSirve.setVisible(true);
    }//GEN-LAST:event_lblParaQueSirveMouseClicked

    private void pnlBackgroundMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBackgroundMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlBackgroundMouseClicked

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
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblComoJugar;
    private javax.swing.JLabel lblJugar;
    private javax.swing.JLabel lblParaQueSirve;
    private javax.swing.JPanel pnlBackground;
    // End of variables declaration//GEN-END:variables
}
