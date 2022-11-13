/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import actores.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @authors:
 * Jhonnier Hernandez
 * Juan Cifuentes
 */
public class VentanaJuego extends javax.swing.JFrame {
    
    /**
     * Creates new form VentanaJuego
     */
    private Ronda ronda;
    private Jugador jugador;

    private Figura figuraReto;
    private Figura figura1;
    private Figura figura2;
    private Figura figura3;
    
    private boolean rondaIniciada; 
    private boolean rondaFinalizada;

    private int tiempoDeObservacion;
    private Timer contador;
    
    private JuegoMemorable juego;
    
    
    public VentanaJuego() {
        ronda = new Ronda();
        jugador = new Jugador();
        
        figuraReto = new Figura();
        figura1 = new Figura();
        figura2 = new Figura();
        figura3 = new Figura();
        
        rondaIniciada = false;
        rondaFinalizada = false;        
        
        tiempoDeObservacion = 5;
        contador = new Timer (1000, new ActionListener ()
        {
            public void actionPerformed(ActionEvent e)
            {
                tiempoDeObservacion--;
                lblContador.setText("|"+tiempoDeObservacion);
                if (tiempoDeObservacion == 0)
                {
                    contador.stop();
                    lblFicha1.setIcon(null);
                    lblFicha2.setIcon(null);
                    lblFicha3.setIcon(null);
                    figuraReto.setRutaTo(lblFichaReto);
                    juego.contarNumeroDeFigurasAEncontrar(figura1, figura2, figura3, figuraReto);
                }
            }
        });
        
        juego = new JuegoMemorable(jugador);
                
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
        lblContador = new javax.swing.JLabel();
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
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 190, 40));

        lblContador.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        lblContador.setForeground(new java.awt.Color(255, 0, 0));
        lblContador.setText("|"+tiempoDeObservacion);
        getContentPane().add(lblContador, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, 50, 40));

        lblFicha1.setBackground(new java.awt.Color(240, 240, 240));
        lblFicha1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblFicha1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFicha1MouseClicked(evt);
            }
        });
        getContentPane().add(lblFicha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 60, 100, 170));

        lblFicha2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblFicha2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFicha2MouseClicked(evt);
            }
        });
        getContentPane().add(lblFicha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 100, 170));

        lblFicha3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblFicha3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFicha3MouseClicked(evt);
            }
        });
        getContentPane().add(lblFicha3, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 60, 100, 170));
        getContentPane().add(lblFichaReto, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 290, 100, 170));

        contenedorPpal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/background/plantilla.png"))); // NOI18N
        contenedorPpal.add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(contenedorPpal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblFicha1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFicha1MouseClicked
        // TODO add your handling code here:
        if(rondaIniciada == false){
            iniciarRonda();
        }
        else{
            mostrarFichaYCompararFigura(lblFicha1,figura1);
            
            finalizarOContinuarRonda(figura1);
        }
    }//GEN-LAST:event_lblFicha1MouseClicked

    private void lblFicha2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFicha2MouseClicked
        // TODO add your handling code here:
        if(rondaIniciada == false){
            iniciarRonda();
        }
        else{
            mostrarFichaYCompararFigura(lblFicha2,figura2);
            
            finalizarOContinuarRonda(figura2);
        }
    }//GEN-LAST:event_lblFicha2MouseClicked

    private void lblFicha3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFicha3MouseClicked
        // TODO add your handling code here:
        if(rondaIniciada == false){
            iniciarRonda();
        }
        else{
            mostrarFichaYCompararFigura(lblFicha3,figura3);
            
            finalizarOContinuarRonda(figura3);
        }
    }//GEN-LAST:event_lblFicha3MouseClicked

    public void reiniciarElementosComoDeInicioDeRonda(){
        System.out.println("Juego Terminado");
        rondaIniciada = false;
        tiempoDeObservacion = 5;
        lblFicha1.setIcon(null);
        lblFicha2.setIcon(null);
        lblFicha3.setIcon(null);
        lblFichaReto.setIcon(null);
        figura1.setRuta();
        figura2.setRuta();
        figura3.setRuta();
        figuraReto.setRuta();
    }
    
    public void iniciarRonda(){
        rondaIniciada = true;
        figura1.setRutaTo(lblFicha1);
        figura2.setRutaTo(lblFicha2);
        figura3.setRutaTo(lblFicha3);
        contador.start();
    }
    
    public void mostrarFichaYCompararFigura(javax.swing.JLabel lblFichaX, Figura figuraX){
        figuraX.setRutaTo(lblFichaX);
        String icono = figuraX.getRuta();
        String iconoComparar = figuraReto.getRuta();
        if(icono.equals(iconoComparar)){
            System.out.println("Acertaste!");
        }else{
            System.out.println("Fallaste!");
        }
        System.out.println("icono = " + icono);
        System.out.println("iconoComparar = " + iconoComparar);
    }
    
    public void finalizarOContinuarRonda(Figura figuraX){
        rondaFinalizada = juego.todasLasFichasSeleccionadas(figuraX);
        if (rondaFinalizada == true){
            reiniciarElementosComoDeInicioDeRonda();
        }
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
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaJuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenedorPpal;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblContador;
    private javax.swing.JLabel lblFicha1;
    private javax.swing.JLabel lblFicha2;
    private javax.swing.JLabel lblFicha3;
    private javax.swing.JLabel lblFichaReto;
    private javax.swing.JLabel lblJugador;
    private javax.swing.JLabel lblNombre;
    // End of variables declaration//GEN-END:variables
}