/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Jhonnier Hernandez
 */
public class VentanaDatos extends JFrame implements ActionListener{

    public VentanaDatos(){
        iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        setTitle("DATOS");
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setSize(300,300);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        setLayout(null);
        
        JLabel lblNombre = new JLabel("INGRESE SU NOMBRE");
        JTextField txtNombre = new JTextField(30);
        JButton btnOk = new JButton("OK");
        
        Container contenedor = getContentPane();
        contenedor.setLayout(null);
        
        lblNombre.setBounds(90, 70, 200, 20);
        txtNombre.setBounds(100, 100, 100, 30);
        btnOk.setBounds(110, 140, 70, 40);
        
        contenedor.add(lblNombre);
        contenedor.add(txtNombre);
        contenedor.add(btnOk);
    }
    
    private void iniciarJuego(){
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
