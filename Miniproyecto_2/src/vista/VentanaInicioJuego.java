/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @authors:
 * Jhonnier Hernandez
 * Juan Cifuentes
 * Alejandra Carvajal
 */
public class VentanaInicioJuego extends javax.swing.JFrame { 
    
    private JButton btnComoJugar;
    private JButton btnJugar;
    private JButton btnParaQueSirve;
    private JLabel lblNombreJuego;
    
    private Container contenedorInicio;
    
    
    public VentanaInicioJuego(){
        iniciarComponentes();   // Declarar los controles
        setSize(650,450);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Inicio");
        setResizable(false);
    }
    
    private void iniciarComponentes(){
        btnComoJugar = new JButton("¿Cómo jugar?");
        btnJugar = new JButton("Jugar");
        btnParaQueSirve = new JButton("Para qué sirve?");
        lblNombreJuego = new JLabel ("MEMORABBLE");
        lblNombreJuego.setFont(new Font("Sherif", Font.PLAIN, 28));
        lblNombreJuego.setForeground(Color.green);
        
        contenedorInicio = getContentPane();
                                
        
        //btnCalcularArea.addActionListener(adminsitradorEventos);
                                
        
        // Configura un adminsitrador de distribución
        contenedorInicio.setLayout(null);
        
        //lblTitulo.setBounds(10, 10, 70, 30);
        //txtDatos.setBounds(80, 10, 150, 30);
        
        contenedorInicio.add(btnComoJugar);  
        contenedorInicio.add(btnJugar);  
        contenedorInicio.add(btnParaQueSirve);  
        contenedorInicio.add(lblNombreJuego);  
        //contenedorPpal.addMouseListener(new ManejadoraDeMouse());
        //contenedorPpal.addMouseMotionListener(new ManejadoraDeMouseMotion());
        //contenedorPpal.addMouseWheelListener(new ManejadoraDeMouseMotion());
        //lblTitulo.addMouseMotionListener(new ManejadoraDeMouseMotion());
        //txtDatos.addKeyListener(new ManejadorDeKeyboard());
        
    } 
    
    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt){
       
       ventanaDatos newframe = new ventanaDatos ();
       newframe.setVisible (true);
       this.dispose();
     
    }
    
    private void btnComoJugarActionPerformed(java.awt.event.ActionEvent evt){
       
       ventanaComoJugar newframe = new ventanaComoJugar ();
       newframe.setVisible (true);
       
       //this.dispose(); para cerrar una ventana cuando abra la otra
    }
    
    private void btnParaQueSirveActionPerformed(java.awt.event.ActionEvent evt){
       
       ventanaParaQueSirve newframe = new ventanaParaQueSirve ();
       newframe.setVisible (true);
       
       //this.dispose(); para cerrar una ventana cuando abra la otra
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
                new VentanaInicioJuego().setVisible(true);
            }
        });
    }
  
      
}
