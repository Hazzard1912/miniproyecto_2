/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import actores.Ronda;

/**
 *
 * @author PC
 */
public class VentanaEstadisticas extends javax.swing.JFrame {

    /**
     * Creates new form VentanaEstadisticas
     */
    public VentanaEstadisticas() {
        initComponents();
        determinarAciertos();
        determinarPuntuacion();
        determinarTiempoJugador();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSiguiente = new javax.swing.JLabel();
        lblAciertosUnidades = new javax.swing.JLabel();
        lblAciertosDecenas = new javax.swing.JLabel();
        lblPuntajeMil = new javax.swing.JLabel();
        lblPuntajeCentenas = new javax.swing.JLabel();
        lblPuntajeDecenas = new javax.swing.JLabel();
        lblPuntajeUnidades = new javax.swing.JLabel();
        lblTiempoCentenas = new javax.swing.JLabel();
        lblTiempoDecenas = new javax.swing.JLabel();
        lblTiempoUnidades = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSiguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSiguienteMouseClicked(evt);
            }
        });
        getContentPane().add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 430, 50, 50));

        lblAciertosUnidades.setFont(new java.awt.Font("Segoe UI", 0, 72)); // NOI18N
        lblAciertosUnidades.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAciertosUnidades.setText("0");
        getContentPane().add(lblAciertosUnidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, 40, 80));

        lblAciertosDecenas.setFont(new java.awt.Font("Segoe UI", 0, 72)); // NOI18N
        lblAciertosDecenas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAciertosDecenas.setText("0");
        getContentPane().add(lblAciertosDecenas, new org.netbeans.lib.awtextra.AbsoluteConstraints(554, 160, 40, 80));

        lblPuntajeMil.setFont(new java.awt.Font("Segoe UI", 0, 72)); // NOI18N
        lblPuntajeMil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPuntajeMil.setText("0");
        getContentPane().add(lblPuntajeMil, new org.netbeans.lib.awtextra.AbsoluteConstraints(554, 253, 40, 80));

        lblPuntajeCentenas.setFont(new java.awt.Font("Segoe UI", 0, 72)); // NOI18N
        lblPuntajeCentenas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPuntajeCentenas.setText("0");
        getContentPane().add(lblPuntajeCentenas, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 253, 40, 80));

        lblPuntajeDecenas.setFont(new java.awt.Font("Segoe UI", 0, 72)); // NOI18N
        lblPuntajeDecenas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPuntajeDecenas.setText("0");
        getContentPane().add(lblPuntajeDecenas, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 253, 40, 80));

        lblPuntajeUnidades.setFont(new java.awt.Font("Segoe UI", 0, 72)); // NOI18N
        lblPuntajeUnidades.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPuntajeUnidades.setText("0");
        getContentPane().add(lblPuntajeUnidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 253, 40, 80));

        lblTiempoCentenas.setFont(new java.awt.Font("Segoe UI", 0, 72)); // NOI18N
        lblTiempoCentenas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTiempoCentenas.setText("0");
        getContentPane().add(lblTiempoCentenas, new org.netbeans.lib.awtextra.AbsoluteConstraints(554, 349, 40, 80));

        lblTiempoDecenas.setFont(new java.awt.Font("Segoe UI", 0, 72)); // NOI18N
        lblTiempoDecenas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTiempoDecenas.setText("0");
        getContentPane().add(lblTiempoDecenas, new org.netbeans.lib.awtextra.AbsoluteConstraints(599, 349, 40, 80));

        lblTiempoUnidades.setFont(new java.awt.Font("Segoe UI", 0, 72)); // NOI18N
        lblTiempoUnidades.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTiempoUnidades.setText("0");
        getContentPane().add(lblTiempoUnidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 349, 40, 80));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ventanaEstadisticas/ventanaEstadisticas.png"))); // NOI18N
        jPanel1.add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiguienteMouseClicked
        // TODO add your handling code here:
        VentanaContinuarJugando ventanaContinuarJugando = new VentanaContinuarJugando();
        ventanaContinuarJugando.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSiguienteMouseClicked

    
    private void determinarAciertos(){
        int decenas, unidades;
        int cantidadAciertos = Ronda.cantidadAciertos;
        
        decenas = Ronda.cantidadAciertos / 10;
        unidades = cantidadAciertos - decenas * 10;
        
        lblAciertosDecenas.setText(Integer.toString(decenas));
        lblAciertosUnidades.setText(Integer.toString(unidades));
    }
    
    private void determinarPuntuacion(){
        int miles, centenas;
        int puntuacionTotal = Ronda.puntajeTotal;
        
        miles = Ronda.puntajeTotal / 1000;
        if(puntuacionTotal >= 1000){
            centenas = (puntuacionTotal - miles * 1000) / 100;
        }else{
            centenas = puntuacionTotal / 100;
            System.out.println("centeneas: " + centenas);
        }
        lblPuntajeMil.setText(Integer.toString(miles));
        lblPuntajeCentenas.setText(Integer.toString(centenas));
    }
    
    private void determinarTiempoJugador(){
        int unidades, decenas, centenas;
        int tiempoTotal = Ronda.tiempoJugado;
        
        centenas = (Integer)Ronda.tiempoJugado / 100;
        decenas = (Integer)(tiempoTotal - centenas * 100) / 10;
        unidades = (Integer)((tiempoTotal - centenas * 100) - decenas * 10);
        
        lblTiempoCentenas.setText(Integer.toString(centenas));
        lblTiempoDecenas.setText(Integer.toString(decenas));
        lblTiempoUnidades.setText(Integer.toString(unidades));
    }
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
            java.util.logging.Logger.getLogger(VentanaEstadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaEstadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaEstadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaEstadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaEstadisticas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnSiguiente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAciertosDecenas;
    private javax.swing.JLabel lblAciertosUnidades;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblPuntajeCentenas;
    private javax.swing.JLabel lblPuntajeDecenas;
    private javax.swing.JLabel lblPuntajeMil;
    private javax.swing.JLabel lblPuntajeUnidades;
    private javax.swing.JLabel lblTiempoCentenas;
    private javax.swing.JLabel lblTiempoDecenas;
    private javax.swing.JLabel lblTiempoUnidades;
    // End of variables declaration//GEN-END:variables
}
