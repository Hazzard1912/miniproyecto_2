/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import actores.*;
import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/**
 *
 * @author PC
 */
public class ventanaJuego extends javax.swing.JFrame {
    
    /**
     * Creates new form ventanaJuego
     */
    private int countdown = 3000;
    private Ronda ronda = new Ronda();
    private Jugador jugador = new Jugador("Jhonnier");
    static int contador = 0;
    
    private Icon iconoFichaBuscar;
    
    public ventanaJuego() {
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

        lblJugador = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblFicha1 = new javax.swing.JLabel();
        lblFicha2 = new javax.swing.JLabel();
        lblFicha3 = new javax.swing.JLabel();
        lblFichaReto = new javax.swing.JLabel();
        contenedorPpal = new javax.swing.JPanel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblJugador.setFont(new java.awt.Font("Malgun Gothic", 0, 30)); // NOI18N
        lblJugador.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblJugador.setText("JUGADOR: ");
        getContentPane().add(lblJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 160, 40));

        lblNombre.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 0, 0));
        lblNombre.setText(jugador.getNombre());
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 310, 40));

        lblFicha1.setBackground(new java.awt.Color(240, 240, 240));
        lblFicha1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblFicha1.setDisabledIcon(null);
        lblFicha1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFicha1MouseClicked(evt);
            }
        });
        getContentPane().add(lblFicha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 60, 100, 170));

        lblFicha2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/figuras/cuadrado.png"))); // NOI18N
        getContentPane().add(lblFicha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 100, 170));

        lblFicha3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/figuras/triangulo.png"))); // NOI18N
        getContentPane().add(lblFicha3, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 60, 100, 170));

        lblFichaReto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/figuras/triangulo.png"))); // NOI18N
        getContentPane().add(lblFichaReto, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 290, 100, 170));

        contenedorPpal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/background/plantilla.png"))); // NOI18N
        contenedorPpal.add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(contenedorPpal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblFicha1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFicha1MouseClicked
        // TODO add your handling code here:
        contador++;
        if(contador % 2 == 0){
            lblFicha1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/figuras/circulo.png")));
        }
        else{
        lblFicha1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/figuras/triangulo.png")));
        }
        String icono = lblFicha1.getIcon().toString();
        System.out.println("icono = " + icono);
        String iconoComparar = lblFichaReto.getIcon().toString();
        System.out.println("iconoComparar = " + iconoComparar);
        if(icono.equals(iconoComparar)){
            System.out.println("Fallaste!");
        }else{
            System.out.println("Acertaste!");
        }
        System.out.println("Label clickeado");
        
    }//GEN-LAST:event_lblFicha1MouseClicked
    
    private void setIconoABuscar(){
        iconoFichaBuscar = lblFichaReto.getIcon();
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
            java.util.logging.Logger.getLogger(ventanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaJuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenedorPpal;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblFicha1;
    private javax.swing.JLabel lblFicha2;
    private javax.swing.JLabel lblFicha3;
    private javax.swing.JLabel lblFichaReto;
    private javax.swing.JLabel lblJugador;
    private javax.swing.JLabel lblNombre;
    // End of variables declaration//GEN-END:variables
}
